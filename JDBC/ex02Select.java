package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex02Select {
	// main 있어야함.
	public static void main(String[] args) {
		// 선언구문을 전역으로 빼는 작업
		// 6번 닫기 작업할 때 conn, psmt, rs가 지역변수라 범위를 벗어나 참조 X ->에러남
		Connection conn = null; // 기본값인 null로 초기화
		PreparedStatement psmt = null;
		ResultSet rs = null;

		// 1. 드라이버 로딩
		// 가장 먼저 JDBC 연결 할 때 해야하는 것.
		// Class 쩜 찍고 컨+스페이스 , forName 선택
		// Class.forName(어떤 드라이버) 해서 드라이버를 동적으로 로딩한다.
		// 동적로딩 => 실행을 시키면서 자료형을 로딩한다.
		// forName 변수 안에 매개변수로 주소값이 들어간다. 주소값 = 우리가 로딩하고 싶은 주소값
		// Class.forName("oracle.jdbc.driver.OracleDriver"); 치고 빨간줄 뜨면
		// Surrounded with try/catch
		try {
			// 동적로딩을 함과 동시에 DriverManager이라고 하는 공간에 Oracle 드라이버가 들어간다.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 1 작성 후 try 문 안에다가 작성.
			// 2. 데이터베이스 연결
			// DriverManager. 까지 치고 3번째 매개변수 3개있는것 선택
			// jdbc드라이버가 oracle thin 타입이다.
			// localhost -> ip주소
			// 1521 -> serverport 번호
			// xe -> 데이터베이스의 이름(별명)

			// 2-2. DriverManager.getConnection 에서 빨간줄 뜨면 세번째 catch문 두개인것 선택.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			String user = "hr"; // 실습 계정 id hr을 넣어준다.
			String password = "hr"; // 비번 hr을 넣어준다.

			// DriverM 하고 컨+스
			// DriverManager가 가지고 있는 기능 중에 데이터베이스와 연결할 수 있는 기능인 getConnection()를 쓴다.
			// 데이터 커넥션(연결) 하기 위해서는 url, user, password 가 필요하다.
			// getConnection 함수는 리턴 타입이 Connection 이어서 Connection 타입으로 받아준다.
			// Connection이란 데이터베이스와 연결하는 모든 데이터를 관리해주는 객체.
			// Connection 빨간줄 -> 임포트 해야함. Import 'Connection' (java.sql)
			conn = DriverManager.getConnection(url, user, password);

			// Connection이 연결 잘 됐는지 확인
			// Connection을 conn 이라는 이름으로 줬을 때,
			if (conn != null) { // null이 아니라면, connection 객체가 비어있지 않다면
				System.out.println("success!");
			} else {
				System.out.println("fail!");
			} // 여기까지 하면 데이터베이스 연결을 한거다.
				// 하지만! 우리는 실제로 SQL문을 작성시켜서 그 SQL문을 실행을 시켜야 한다.

			// 3. SQL문 작성(모든 컬럼을 확인하는 Query)
			// SQL 문은 String 형태로 받아준다.
			String sql = "select * from bigdatamember"; // 이 안에 쿼리를 작성한다.

			// 4. SQL문이 준비가 됐으면 SQL문을 전송할 수 있는 객체를 생성해야 한다. 그 객체 -> PreparedStatement.
			// PreparedStatement는 위에서 불러온 Connection이라는 객체를 통해서만 만들어줄 수 있다.
			// 이 Connection 객체를 통해서 prepareStatement를 만드는 순간 미리 sql문장을 담아준다.
			// conn.prepare 까지 작성하고 컨+스
			// prepareStatement 의 리턴타입은 PreparedStatement 이니 이 리턴타입으로 받아준다.
			psmt = conn.prepareStatement(sql);

			// 5. SQL문 실행
			// 누구를 통해서 실행? PreparedStatement라고 하는 psmt <- 얘를 통해서 실행
			// ★★★ 어제는 실행시킬 때 executeUpdate를 썼지만
			// executeUpdate -> 행의 영향을 끼치는 SQL문을 실행할 때 사용함. ex) INSERT, UPDATE, DELETE
			// --> SELECT 문 같은 경우는 직접적으로 행에 영향을 끼치지 않기 때문에
			// ===> executeQuery를 쓴다.
			// psmt.executeQu 까지 치고 컨+스 -> 리턴타입이 ResultSet인 애 선택.
			// 아직은 ResultSet이 뭔지 모르겠으나 얘로 psmt.executeQuery를 받아야 한다.
			// Result 까지 치고 컨+스 -> ResultSet이 나오면 클릭해 자동 임포트 시킨다.
			// ResultSet의 이름을 rs으로 준다.

			rs = psmt.executeQuery();
			// executeUpdate를 하면 영향을 받은 행의 개수가 돌아왔다면(리턴됐다면)
			// executeQuery라고 하는 얘는 결과를 돌려줄 때 ResultSet이라고 하는걸로 돌려준다.

			// ResultSet => SELECT문에 대한 결과를 "테이블"과 같은 형태로 가지고 있는 객체다. (행x열)
			// └ 얘를 가지고 결과 처리를 할건데 특이한 걸 가지고 있다.
			// ResultSet은 커서를 가지고 있어서 맨 상단의 컬럼이름에서 커서가 깜빡깜빡 한다.
			// 근데 우리가 밑에 있는 결과값들을 가지고 와서 하나씩 보고싶다고 생각을 하면,
			// 그렇다면 커서의 위치를 한 칸 밑으로 내려야 한다.
			// 이 커서가 가리키고 있는 공간에 대한 데이터를 볼 수 있고 가져올 수 있다.
			// 커서 내리는 방법? rs가 가지고 있는 기능 중에 next()라는 기능을 쓰면 커서가 한칸 밑으로 내려간다.
			// ====> rs.next() 는 ResultSet이라고 하는 객체가 가지고 있는 커서를 한 칸 밑으로 내려주는 작업이다.

			// 6. 결과값 처리해주기.
			// rs.next() -> 커서를 한 칸 밑으로 내리는 기능
			while (rs.next()) { // rs.next() -> boolean의 리턴타입이니 데이터가 있을때만 ,TRUE 일때만
								// 각각의 열에 맞는 데이터를 뽑아와서 출력해서 보여준다.
								// 행이 몇개 있는지 모르니까 while rs.next()를 감싸준다.

				String id = rs.getString("id"); // rs가 가지고 있는 기능 중 getString
												// 오버로딩으로 매개변수가 int와 String이 들어가는 것 2개가 있는데
												// int 형태는 몇 번째 컬럼인지, 컬럼의 순서가 들어가는 것이다.
												// String 형태는 컬럼의 이름이 들어간다. <- 더 쉬움.

				String pw = rs.getString("pw"); // 패스워드를 꺼낼거야.

				String name = rs.getString("name"); // 이름도 가져온다.
				int age = rs.getInt("age"); // 나이는 숫자 형태 -> 정수형으로 꺼내준다.

				// while문 돌면서 모든 데이터를 출력해준다.
				System.out.println(id + "\t" + pw + "\t" + age + "\t");

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 7. 닫기
			// 어디서 예외가 발생할지 모르는데 자원(Connection, PreparedStatement)을 반납을 안해줄 수는 없음
			// 자원 반납을 무조건 해줄 수 있는 코드
			// 무조건 한번은 실행해줘야 하는 구문
			// 예외가 발생하더라도 실행!
			// if문을 try catch로 감싼
			try {
				// ★★★ 닫을 때는 자원을 할당한 역순으로 닫아줘야 한다. ★★★
				// == 열어준 순서의 역으로 닫아줘야 한다.
				// 1. Resultset 닫고 PreparedStatement 닫아주고 마지막으로 Connection 닫아주는 순서대로.
				// rs, psmt, conn이 지역변수로 안쪽에 선언을 해버렸기 때문에 rs.close()를, 닫아주는 요청을 못한다.
				// ==> 맨 상단의 main문 안쪽에 3개의 객체로 선언한다.

				// 빨간줄이 뜬다 -> 혹시 모를 예외를 처리하기 위해 try catch 구문으로 감싸준다.
				if (rs != null) // rs가 null 이 아니라면, 열려있다면
					rs.close(); // rs 를 닫는다.

				if (psmt != null)// psmt 자원이 null 이 아니라면, 열려있다면
					psmt.close(); // psmt를 닫는다.

				if (conn != null)// conn이 null이 아니라면, 자원이 사용되었다면
					conn.close(); // conn을 닫는다. -> 빨간줄 뜨면 Surrounded with try catch

			} catch (SQLException e) { // 데이터베이스에 대한 예외처리.
				e.printStackTrace();
			}

		}

	}

}
