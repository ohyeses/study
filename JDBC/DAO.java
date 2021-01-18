package JDBC;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// MVC 패턴 중 Controller 의 역할을 한다.
// Controller -> 모델이 “어떻게” 처리할 지를 제어하는 역할을 한다.
public class DAO {
	// DAO -> DataBase Access Object의 약자. 데이터베이스 접근 객체
	// 데이터베이스에 접근하는 모든 객체는 DAO라는 Controller가 관리를 한다.

	// 중복되는 부분을 필드로 빼준다.
	// private 선언 -> 외부의 접근을 막는다
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	// 중복코드 간편화 - 2
	// private -> 다른 클래스에서 쓰지 않음 DAO 안에서만 쓰기 때문에.
	// 리턴타입 X 매개변수 X
	private void getConnection() {
		// 빨간 줄 뜨면 surround with try catch 클릭
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// try 문 안으로 이동시킨다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			//
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	// 중복코드 간편화 - 3
	// 외부에서 쓰지 않기 때문에 private으로 제한.
	private void getClose() {
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

	// 1. 회원가입 메소드를 만들어준다. (INSERT)
	// public 접근제한자 -> 외부에서 접근을 할 수있게 함.
	// 반환형 int -> INSERT 라고 하는 JDBC 작업을 해주고 나면 결과값이 int형으로 나와서
	// id pw name pw를 하나로 묶을 수 있는 자료형 -> MemberVO
	// 매개변수 자체를 MemberVO 로 바꾼다.
	public int insert(MemberVO vo) {

		int result = 0; // 결과값을 담을 변수

//		JDBC는 반복작업이다. 코드가 바뀌지 않는다.
//		ex01_JDBC의 insert문을 복붙해서 가져온다.

		try {
			getConnection();

			// 매개변수로 받은 애들을 입력해줘야 한다.
			// 사용자가 무엇을 입력할지 모르니 ? 인자를 쓴다.
			String sql = "insert into bigdatamember values(?,?,?,?)"; // 이 안에 쿼리를 작성한다.

			psmt = conn.prepareStatement(sql);

			// ? 인자 채우고 나서 실행을 해야한다. executeUpdate() 전에 작성.
			// setString() -> 넘겨주는 인자가 String 타입이라면
			// setInt() -> 넘겨주는 인자 값이 int 라면
			
			
			psmt.setString(1, vo.getId()); //Membervo에서 아이디를 꺼내와서 채워준다.
			psmt.setString(2, vo.getPw()); 
			psmt.setString(3, vo.getName()); 
			psmt.setInt(4, vo.getAge());

			// 영향을 받은 행의 개수를 담아서 리턴을 해주는 변수 row를 result로 바꾼다.
			result = psmt.executeUpdate();


			// ClassNotFoundException 지운다
			// SQLException은 데이터베이스에 관련된 예외사항이기 때문에 conn.prepareStatement에서 예외가 발생할 수 있기 때문에
			// 지우지 않는다.
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			getClose();

		}

		return result;
	} // 회원가입 메소드 끝

	// 2. 로그인 수행하는 메소드
	// 로그인을 했는데 패스워드를 제외하고 아이디, 이름, 나이를 돌려준다. -> 얘네를 하나로 묶는 오브젝트를 만들어준다.
	// public -> 접근제한자
	// 리턴타입 -> MemberVO 라는 객체로 리턴
	// 매개변수 -> id pw도 MemberVo로 관리할 수 있다
	public MemberVO login(MemberVO vo) {
		MemberVO resultVO = null; // resultVO라는 이름으로 MemberVO 객체를 만들어준다.
									// 아직 어떤 값이 들어갈지 모르니까 null 을 넣어준다.

		// ex02Select 에서 했던 코드를 긁어온다.

		try {
			getConnection();

			// 로그인 할 때 좋은 SQL 쿼리문은 뭘까? 테이블에 데이터가 존재하는지 안하는지 봐야함 ==> SELECT
			// bigdatamember의 모든 컬럼을 조회한다.
			// id와 pw가 같아야 하는 조건으로.
			// id와 pw가 뭐가 들어올지 모르니 ? 인자를 쓴다.
			String sql = "select * from bigdatamember where id = ? and pw =?";

			psmt = conn.prepareStatement(sql);

			// ? 인자는 executeQuery(), 실행하기 직전에 채워준다.
			psmt.setString(1, vo.getId()); // vo에서 id를 꺼내온다.
			psmt.setString(2, vo.getPw()); // vo에서 pw를 꺼내온다.
			rs = psmt.executeQuery();

			// id가 중복이 없다면 행이 딱 하나 있는건데, 행이 하나라는 전제하에 while -> if로 바꾼다.
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

		}
		// ClassNotFoundException 지우기
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		// 0118
		// 두개의 메소드에서 중복되는 부분이 있다.
		// 연동 부분, Connection, PreparedStatement, 닫는 작업 -> 별도의 메소드로 뺀다.

		// 데이터베이스 연동하는 부분을 별도의 메소드로 뺀다.

		return resultVO;
	}

	
	// 리턴 타입 int - > 영향을 받은 행의 개수이다.
	// 매개변수 -> MemberVO로 받아온다.
	public int delete(MemberVO vo) {
		int result = 0; // 결과값을 담을 변수
		

		try {
			// 1. 가장먼저 데이터베이스 연결하기.
			getConnection();

			// 2. SQL문 작성
			// 매개변수로 받은 애들을 입력해줘야 한다.
			// 사용자가 무엇을 입력할지 모르니 ? 인자를 쓴다.
			String sql = "delete from bigdatamember where id =? and pw = ?";

			// 3. psmt 객체 만들기
			// psmt는 conn을 통해 만들어 줄 수 있다.
			psmt = conn.prepareStatement(sql);

			// 4. 물음표 인자를 채워주는 작업.
			// ? 인자 채우고 나서 실행을 해야한다. executeUpdate() 전에 작성.
			// setString() -> 넘겨주는 인자가 String 타입이라면
			// setInt() -> 넘겨주는 인자 값이 int 라면
			psmt.setString(1, vo.getId()); //Membervo에서 아이디를 꺼내와서 채워준다.
			psmt.setString(2, vo.getPw()); 

			// 행에 변화를 주는 작업은 executeUpdate를 쓴다.
			// executeUpdate 리턴 타입 -> int 니 result에 담아준다.
			result = psmt.executeUpdate(); // 영향을 받은 행의 개수를 result에 담아준다.


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			getClose();

		}

		
		
		return result;
	}

	
	// 리턴 -> ArrayLis 타입으로.
	public ArrayList<MemberVO> allSelect() {
		
		// MemberVO를 담는 AraryList형 list
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		
		try {
			// 1. 드라이버 연결
			getConnection();
			
			// 2. SQL 문장 만들기
			String sql = "select * from bigdatamember"; //테이블에 있는 모든 값을 가져오기
			
			// 3. psmt 객체 만들기
			// sql 문장을 담은 PreparedStatement psmt 을 conn 통해서 만든다.
			psmt = conn.prepareStatement(sql);
			
			// 4. 실행
			// executeQuery -> 행에 영향을 미치지 않을 때 쓴다.
			rs = psmt.executeQuery();
			
			// rs-> 테이블과 같은 형태이고 커서를 가지고 있다.
			// rs.next() -> 커서를 한 칸 밑으로 내리는 기능
			while (rs.next()) { // rs.next() -> boolean의 리턴타입이니 데이터가 있을때만 ,TRUE 일때만
								// 각각의 열에 맞는 데이터를 뽑아와서 출력해서 보여준다.
								// 행이 몇개 있는지 모르니까 while rs.next()를 감싸준다.
				
				//getString() -> rs에서 값을 꺼내온다.
				String id = rs.getString("id"); // 꺼내온 id를 String id에 담아준다.
				String pw = rs.getString("pw"); 
				String name = rs.getString("name"); 
				int age = rs.getInt("age");
				
				// id pw name age 를 하나로 묶을 수 있는 자료형 MemberVO 객체 만들기
				MemberVO vo = new MemberVO(id,pw,name,age);
				
				// 어레이리스트에 값을 담아줄때는 리스트가 가지고 있는 기능 중 add() 사용하기
				// MemberVO를 하나로 묶어서 관리하기 위한 어레이리스트 list
				// While문 돌때마다 생겨나는 vo 객체마다 어레이리스트에 담아둔다.
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		
		return list;// 어레이리스트인 list를 반환한다.
	}

}