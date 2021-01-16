package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex01_JDBC {
	// main 있어야함.
	public static void main(String[] args) {
		Connection conn = null; // 기본값인 null로 초기화
		PreparedStatement psmt = null;
		
		// 1. 드라이버 로딩
		// Class 쩜 찍고 컨+스페이스 , forName 선택
		// Class.forName(어떤 드라이버)
		// Class.forName("oracle.jdbc.driver.OracleDriver"); 치고 빨간줄 -> 예외처리를 안해서 뜬다.
		// Surrounded with try/catch. 예외처리를 해준다.
		try {
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
			
			String user = "hr"; // hr을 넣어준다.
			String password = "hr"; //비번 hr을 넣어준다.
			
//		DriverM 하고 컨+스
			// 데이터 커넥션 하기 위해서는 url, user, password 가 필요하다.
			// getConnection 함수는 리턴 타입이 Connection 이어서 Connection으로 받아준다.
			// Connection은 java.sql 3번째걸 가져온다.
			conn = DriverManager.getConnection(url, user, password);
			
			// 연결 잘 됐는지 확인
			if (conn!=null) { //connection 객체가 비어있지 않다면
				System.out.println("success!");
			} else {
				System.out.println("fail!");
			}
			
			// 3. SQL문 작성(모든 컬럼을 확인하는 Query)
			// SQL 문은 String 형태로 받아준다.
			String sql  = "insert into bigdatamember values('soyoung', '12345', '소영', 20)"; // 이 안에 쿼리를 작성한다.
			
			// 4. SQL문이 준비가 됐으면 SQL문을 전송할 수 있는 객체를 생성해야 한다.
			// 이 객체를 생성할 수 있는건 연결을 해줬던 객체인 Connection 이다.
			// conn을 통해서 객체를 생성한다.
			// conn.prepare 까지 작성하고 컨+스
			// prepareStatement 의 리턴타입은 PreparedStatement 이니 이 리턴타입으로 받아준다.
			// 객체를 생성할때는 미리 sql문을 먼저 담아준다.
			// conn 객체를 통해서 prepareStatement를 만드는 순간 미리 sql문장을 담아준다.
			psmt = conn.prepareStatement(sql);
			
			
			// 5.실행
			// 행을 추가, 업데이트 한다. -> execute
			// 실행을 하고 나면 실제로 행이 반영이 됐는지 판단을 해야함.
			// executeUpdate의 리턴타입은 int 니 받아준다.
			// int -> 영향을 받은 행의 개수
			// => executeUpdate 하면 영향을 받은 행의 숫자가 돌아온다.
			int row = psmt.executeUpdate();
			
			
			// 성공했는지 실패했는지 조건판별
			// 성공했다면 0이라는 숫자, 실패했다면 1이라는 숫자 리턴
			if (row > 0) { // row 가 0보다 크다면 성공
				System.out.println("행 추가 성공!");
			} else {
				System.out.println("행 추가 실패...");
			}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 어디서 예외가 발생할지 모르는데 자원(Connection, PreparedStatement)을 반납을 안해줄 수는 없음
			// 자원 반납을 무조건 해줄 수 있는 코드
			// 무조건 한번은 실행해줘야 하는 구문
			// 예외가 발생하더라도 실행!
				// if문을 try catch로 감싼
				try {
					// 6. 닫기
					//★★★ 닫을 때는 자원을 할당한 역순으로 닫아줘야 한다. ★★★
					// == 열어준 순서의 역으로 닫아줘야 한다.
					// 즉 PreparedStatement 닫아주고 그 다음 Connection 닫아줘야 한다.
					
					if (psmt!=null) { //psmt 자원이 null 이 아닐 때, 사용되고 있을 때
						psmt.close(); //psmt를 close 하겠다.
					}
					
					
					if(conn != null){// 만약에 자원이 사용됐다면 즉, conn이 null이 아니라면
					conn.close(); // conn을 닫는다. -> 빨간줄 뜨면 Surrounded with try catch
					}
				} catch (SQLException e) { //데이터베이스에 대한 예외처리.
					e.printStackTrace();
				} 
			
		}
		
	}

}
