package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// MVC 패턴 중 Controller 의 역할을 한다.
// Controller -> 모델이 “어떻게” 처리할 지를 제어하는 역할을 한다.
public class DAO {
	// DAO -> DataBase Access Object의 약자. 데이터베이스 접근 객체
	// 데이터베이스에 접근하는 모든 객체는 DAO라는 Controller가 관리를 한다.
	
	// 1. 회원가입 메소드를 만들어준다. (INSERT)
	
	// public 접근제한자 -> 외부에서 접근을 할 수있게 함.
	// 반환형 int -> INSERT 라고 하는 JDBC 작업을 해주고 나면 결과값이 int형으로 나와서
	// 매개변수 4개 -> 각각의 컬럼을 모두 채워주기 위해. (id, pw, name, age)
	public int insert(String id, String pw, String name, int age) {
		
		int result = 0; // 결과값을 담을 변수
		
//		JDBC는 반복작업이다. 코드가 바뀌지 않는다.
//		ex01_JDBC의 insert문을 복붙해서 가져온다.
		
		Connection conn = null;
		PreparedStatement psmt = null;
		

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			

			String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
			String user = "hr";
			String password = "hr";
			

			conn = DriverManager.getConnection(url, user, password);

			if (conn!=null) {
				System.out.println("success!");
			} else {
				System.out.println("fail!");
			}
			
			
			// 매개변수로 받은 애들을 입력해줘야 한다.
			// 사용자가 무엇을 입력할지 모르니 ? 인자를 쓴다.
			String sql  = "insert into bigdatamember values(?,?,?,?)"; // 이 안에 쿼리를 작성한다.
			
			psmt = conn.prepareStatement(sql);
			
			
			// ? 인자 채우고 나서 실행을 해야한다. executeUpdate() 전에 작성.
			// setString() -> 넘겨주는 인자가 String 타입이라면
			// setInt() -> 넘겨주는 인자 값이 int 라면
			psmt.setString(1,id); // 1번째에다 id라는 매개변수 값을 넣어주겠다라는 뜻.
			psmt.setString(2, pw); // 2번째에다 pw라는 매개변수 값을 넣어준다.
			psmt.setString(3, name); // 3번째에다 name라는 매개변수 값을 넣어준다.
			psmt.setInt(4, age);// 4번째에 age를 넣는다. int 형태에 string 넣으면 에러남.
			
			
			// 영향을 받은 행의 개수를 담아서 리턴을 해주는 변수 row를 result로 바꾼다.
			result = psmt.executeUpdate();
			
			// ↓ DAO에서는 출력문을 사용해주지 않는다. ↓
			// 출력해주는 구간은 View에게 맡긴다.
			/* 
			 * if (row > 0) { System.out.println("행 추가 성공!"); } else {
			 * System.out.println("행 추가 실패..."); }
			 */ 
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

				try {

					
					if (psmt!=null) {
						psmt.close();
					}
					
					
					if(conn != null){
					conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			
		}
		
		
		
		return result;
	} // 회원가입 메소드 끝
	
	
	
	// 2. 로그인 수행하는 메소드
	// 로그인을 했는데 패스워드를 제외하고 아이디, 이름, 나이를 돌려준다. -> 얘네를 하나로 묶는 오브젝트를 만들어준다.
	// public -> 접근제한자
	// 리턴타입 -> MemberVO 라는 객체로 리턴
	// 매개변수 -> 로그인할 때 사용자에게 id, pw를 받아온다
	public MemberVO login(String id, String pw) {
		MemberVO resultVO = null; // resultVO라는 이름으로 MemberVO 객체를 만들어준다.
								// 아직 어떤 값이 들어갈지 모르니까 null 을 넣어준다.
		
		// ex02Select 에서 했던 코드를 긁어온다.
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;


		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			
			conn = DriverManager.getConnection(url, user, password);

			
			// 로그인 할 때 좋은 SQL 쿼리문은 뭘까? 테이블에 데이터가 존재하는지 안하는지 봐야함 ==> SELECT
			// bigdatamember의 모든 컬럼을 조회한다.
			// id와 pw가 같아야 하는 조건으로.
			// id와 pw가 뭐가 들어올지 모르니 ? 인자를 쓴다.
			String sql = "select * from bigdatamember where id = ? and pw =?"; 

			psmt = conn.prepareStatement(sql);

			// ? 인자는 executeQuery(), 실행하기 직전에 채워준다.
			psmt.setString(1, id);  // 1번째에다 매개변수로 받아온 id 를 넣어준다.
			psmt.setString(2, pw); // 2번째는 매개변수로 받아온 pw를 넣어준다.
			
			
			rs = psmt.executeQuery();


			//id가 중복이 없다면 행이 딱 하나 있는건데, 행이 하나라는 전제하에 while -> if로 바꾼다.
			// rs.next()는 boolean의 리턴타입이다 -> 데이터가 있을때(=결과가 TRUE 일때)만 실행한다.
			if (rs.next()) { // rs 라는 커서를 밑으로 한칸 내린다 -> 각 컬럼에 있는 데이터들을 뽑아온다.
							
				
				// 처음에 긁어오면 id pw 가 이름이 중복이 되어 에러가 뜬다.
				// 출력문들은 다 지우기
				
				String id2 = rs.getString("id");

				String pw2 = rs.getString("pw");

				String name = rs.getString("name");
				
				int age = rs.getInt("age");
				
				// 뽑아온 id pw name age 를 누구한테 넣어야 할까? resultVO에 넣어줘야 한다.
				// resultVO라는 MemberVO 타입의 객체를 생성해주고 매개변수 4개로 생성해준다.
				// 이 4개는 우리가 실제 데이터베이스에서 꺼내온 값인 id2, pw2, name, age 이다.
				resultVO = new MemberVO(id2, pw2, name, age);

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();

				if (psmt != null)
					psmt.close();

				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
		// 두개의 메소드에서 중복되는 부분이 있다. 
		// 연동 부분, Connection, PreparedStatement, 닫는 작업 -> 별도의 메소드로 뺀다.
		
		
		
		return resultVO;
	}
	
	
	
	
	
	
	
	
	
	
	
}
