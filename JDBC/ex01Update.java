package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex01Update {
// 에러나면 jar 파일안 넣어서 그런다.
// 프로젝트 선택 우클 -> Build Path -> Configure Build Path -> ClassPath 선택 -> Add jar -> ojdbc6.jar 추가
	public static void main(String[] args) {
		// 객체를 전역으로 빼준다.
		// 6번 닫기 작업할 때 conn, psmt가 지역변수라 범위를 벗어나 참조 X ->에러남
		Connection conn = null;
		PreparedStatement psmt = null;

		Scanner sc = new Scanner(System.in);

		// 사용자에게 값을 입력받는다. Scanner 사용
		System.out.println("변경할 아이디를 입력하세요 >> ");
		String id = sc.next();
		System.out.println("어떤 이름으로 변경할 지 입력하세요 >> ");
		String name = sc.next();

		try {
			// 1. 드라이버 동적 로딩 => 가장 먼저 JDBC 연결 할 때 해야하는 것.
			
			// Class 쩜 찍고 컨+스페이스 , forName 선택
			// Class.forName(어떤 드라이버) 해서 드라이버를 동적으로 로딩한다.
			// 동적로딩 => 실행을 시키면서 자료형을 로딩한다.
			// forName 변수 안에 매개변수로 주소값이 들어간다. 주소값 = 우리가 로딩하고 싶은 주소값
			// Class.forName("oracle.jdbc.driver.OracleDriver"); 치고 빨간줄 -> 예외처리를 안해서 뜬다.
			// Surrounded with try/catch. 예외처리를 해준다.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			
			
			// 2. 데이터베이스 연결
			// 연결~실행하는 것까지 try~catch문 하나로 마무리를 할꺼기 때문에 안쪽에서 작성한다.
			// DriverManager에 필요한 준비물 3개를 String 형태로 선언한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // url 외울필요 X, Data Source Explorer 에서 볼 수 있다.
													// New Oracle 연결 안된상태면 더블클릭해서 연결시켜준다.
													// New Oracle에서 우클 -> Properties -> Driver Properties 에 url이 있다.
			String user = "hr";
			String password = "hr";

			
			
			// DriverM 컨+스 -> 자동 임포트
			// getConnection은 매개변수가 3개있는 걸로.
			// 전체 빨간줄 -> 예외처리를 안해서 뜸. 2번째거 선택해 catch문 추가.
			// Connection 빨간줄 -> 임포트 해야함. Import 'Connection' (java.sql)

			// DriverManager가 가지고 있는 기능 중에 데이터베이스와 연결할 수 있는 기능인 getConnection()를 쓴다.
			// 데이터 커넥션(연결) 하기 위해서는 url, user, password 가 필요하다.
			// getConnection 함수는 리턴 타입이 Connection 이어서 Connection 타입으로 받아준다.
			// Connection이란 데이터베이스와 연결하는 모든 데이터를 관리해주는 객체.
			conn = DriverManager.getConnection(url, user, password);

			
			// Connection이 연결 잘 됐는지 확인
			// Connection을 conn 이라는 이름으로 줬을 때,
			if (conn != null)
				System.out.println("success!");
			else
				System.out.println("fail!"); // 여기까지 적고 실행해보자.

			
			
			// 3. SQL문 작성 -> 아이디에 맞는 이름 컬럼을 변경
			// UPDATE bigdatamember SET name = '이름" WHERE ID = '입력한 값'
			// String sql = "UPDATE bigdatamember SET name ='"+name+"' WHERE ID = '"+id+"'";
			// └변수를 구분하기 위해 ' 따옴표 뒤에 " 쌍따옴표를 처음과 끝에 붙히고 + 를 넣은것이다.
			// └이렇게 하면 복잡하기 때문에 그냥 ?를 쓴다.
			// ? -> Preparedstatement의 기능. 뭐가 올 지 모를때 쓴다.
			String sql = "UPDATE bigdatamember SET name =  ? WHERE ID = ?";

			// 4. SQL문 전송하는 객체 생성
			// Import 'PreparedStatement' java.sql;
			psmt = conn.prepareStatement(sql);
			// └ sql 구문을 prepareStatement 구문에 담고, ? 인자가 들어올만한 공간들을 만든다.

			// sql 생성과 execute 실행 전에 이 사이에서  ? 인자를 채워줄 수 있다.
			// preparedstatement 가 가지고 있는 기능 중에 덮어 씌울 쑤 있는 기능인 set이 있다.
			// SetString -> String 형태로 채울거다.
			// 특이하게 1부터 시작한다. 원래 배열 0부터 시작 X
			// psmt.setString(1.몇번째 물음표 인자, 2.채워줄 값)
			
			psmt.setString(1, name); // 1번째 인자를 name으로 채운다.
			psmt.setString(2, id); // 2번째 인자를 채울거야, id 값으로.

			// 5. 실행 행에 영향을 주는 쿼리 
			// 행에 영향을 끼치는 작업을 수행할 때는 -> executeUpdate
			// executeUpdate의 리턴타입은 int 이다.
			// int -> 영향을 받은 행의 개수
			// => executeUpdate 하면 영향을 받은 행의 숫자가 돌아온다.
			int row = psmt.executeUpdate();

			
			// 성공했는지 실패했는지 조건판별
			// 성공했다면 1이라는 숫자, 실패면 0 리턴
			if (row > 0) { // row가 0보다 크다면
				System.out.println("업데이트 성공!");
			}
			else // 그렇지 않다면
				System.out.println("업데이트 실패!");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { //finally -> 무조건 한번은 실행해줘야 하는 구문
			// 6. 닫기
			// if 문 먼저 만들고 psmt.close()가 빨간줄이 난다면
			// Surround with try/catch -> try 문 안으로 if문을 집어넣는다.
			
			try {
				//★★★ 닫을 때는 자원을 할당한 역순으로 닫아줘야 한다. ★★★
				// 즉 PreparedStatement 닫아주고 그 다음 Connection 닫아줘야 한다.
				if (psmt != null) // PreparedStatement 객체 닫아주기
					psmt.close(); // null이 아니었을 때, 닫아주기

				if (conn != null) // Connection 객체 닫아주기
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
