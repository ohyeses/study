package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex01Update {

	public static void main(String[] args) {
		// 빨간줄 뜨면 import 해줄 것.!! java.sql -> Connection
		Connection conn = null;
		PreparedStatement psmt = null;

		// 아이디, 이름을 입력 받는다.
		Scanner sc = new Scanner(System.in);

		System.out.print("변경할 아이디를 입력하세요 >> ");
		String id = sc.next();
		System.out.print("어떤 이름으로 변경할 지 입력하세요 >> ");
		String name = sc.next(); // -> 사용자에게 값을 입력
		// JDBC 코드 작성

		// 1. 드라이버 동적 로딩 -> 에러 나면 프로젝트 우클릭 Build Path ->Configure Build path
		try {

			// Class가 가지고 있는 기능 중 forName이라는 기능을 쓴다.
			// 그 안에다 주소값을 넣는다. 주소값은 외울 필요 없다.
			// 빨간색 오류 => Surrounded with try catch
			// try 안쪽에다 넣는다.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 데이터베이스 연결
			// 아래 연결에 필요한 것들 준비 url, user, password
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			// 매개변수 3개가 들어가는 메서드를 사용
			// 리턴 타입이 Connection 인 conn으로 닫아준다.
			// 또 빨간줄 나오면 예외처리 -> 데이터베이스 관련한 예외처리 하라는 뜻
			// 두번째꺼 클릭 -> catch문 위에 또다른 catch문.
			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("01/15 success!");
			} else {
				System.out.println("fail...");
			}

			// 3. SQL문 작성 -> 아이디에 맞는 이름 컬럼을 변경
			// UPDATE bigdatamember SET name = '값' WHERE ID = '입력한 값'
			// '" 싱글 뒤에 더블. 따옴표 구분 하나하나 붙여주니 복잡.
			// 그걸 방지하기 위해서 psmt는 특이한 기능을 가지고 있다. -> statement를 쓴다.
			// 하지만 이 값에 대해서 공간을비워놓고 준비할 수 있다.
			// String sql = "UPDATE bigdatamember SET name = '"+name+"' WHERE ID =
			// '"+id+"'";
			// ?는 '나 뭐 올지 몰라' 라는 뜻.
			// ?는 preparedstatement 만이 가지고 있는 기능. 어떤 값이 올지 모를 때 쓰는 기능.

			String sql = "UPDATE bigdatamember SET name = ? WHERE ID =?";

			// 4. SQL문 전송하는 객체 생성
			// psmt 는 conn을 통해 만들었다.
			// 얘가 가지고있는 기능중에 preparedstatement라는 것이 있었고 sql을 매개변수로 받는다.
			psmt = conn.prepareStatement(sql);

			// 어떤 값을 덮어씌울 때 set
			// preparedstatement 가 가지고 있는 기능 중에 덮어 씌울 쑤 있는 기능인 set이 있다.
			// String 형태로 채울거다.
			// 특이하게 1부터 시작한다.
			// psmt.setString(몇번째 물음표 인자, 채워줄 값)
			// 1- 몇번째 인자를 채워 줄건지, 2-어떤 값으로 채워줄건지
			// 두번째 인자를 채울거야, id 값으로.
			psmt.setString(1, name);
			psmt.setString(2, id);

			// 5. 실행 -> executeUpdate
			// 행이 업데이트 되는 작업은 executeUpdate를 쓴다.
			// 얘의 리턴타입은 int. -> 영향을 받은 행의 개수 -> row라는 이름을 준다.
			int row = psmt.executeUpdate();

			if (row > 0) { // row가 0보다 크다면
				System.out.println("update 성공!");
			} else { // 그렇지 않다면
				System.out.println("update 실패!");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			// 6. 닫기
			// 닫을 때 역순으로 닫아야 하니 1. psmt 2. conn 순으로 닫아준다.
		} finally {
			try {
				if (psmt != null) {
					psmt.close();
				}

				if (conn != null) { // conn이 null이 아니었을 떄 null을 닫아준다.
					conn.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
