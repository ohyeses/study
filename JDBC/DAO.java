package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// MVC ���� �� Controller �� ������ �Ѵ�.
// Controller -> ���� ����ԡ� ó���� ���� �����ϴ� ������ �Ѵ�.
public class DAO {
	// DAO -> DataBase Access Object�� ����. �����ͺ��̽� ���� ��ü
	// �����ͺ��̽��� �����ϴ� ��� ��ü�� DAO��� Controller�� ������ �Ѵ�.
	
	// 1. ȸ������ �޼ҵ带 ������ش�. (INSERT)
	
	// public ���������� -> �ܺο��� ������ �� ���ְ� ��.
	// ��ȯ�� int -> INSERT ��� �ϴ� JDBC �۾��� ���ְ� ���� ������� int������ ���ͼ�
	// �Ű����� 4�� -> ������ �÷��� ��� ä���ֱ� ����. (id, pw, name, age)
	public int insert(String id, String pw, String name, int age) {
		
		int result = 0; // ������� ���� ����
		
//		JDBC�� �ݺ��۾��̴�. �ڵ尡 �ٲ��� �ʴ´�.
//		ex01_JDBC�� insert���� �����ؼ� �����´�.
		
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
			
			
			// �Ű������� ���� �ֵ��� �Է������ �Ѵ�.
			// ����ڰ� ������ �Է����� �𸣴� ? ���ڸ� ����.
			String sql  = "insert into bigdatamember values(?,?,?,?)"; // �� �ȿ� ������ �ۼ��Ѵ�.
			
			psmt = conn.prepareStatement(sql);
			
			
			// ? ���� ä��� ���� ������ �ؾ��Ѵ�. executeUpdate() ���� �ۼ�.
			// setString() -> �Ѱ��ִ� ���ڰ� String Ÿ���̶��
			// setInt() -> �Ѱ��ִ� ���� ���� int ���
			psmt.setString(1,id); // 1��°���� id��� �Ű����� ���� �־��ְڴٶ�� ��.
			psmt.setString(2, pw); // 2��°���� pw��� �Ű����� ���� �־��ش�.
			psmt.setString(3, name); // 3��°���� name��� �Ű����� ���� �־��ش�.
			psmt.setInt(4, age);// 4��°�� age�� �ִ´�. int ���¿� string ������ ������.
			
			
			// ������ ���� ���� ������ ��Ƽ� ������ ���ִ� ���� row�� result�� �ٲ۴�.
			result = psmt.executeUpdate();
			
			// �� DAO������ ��¹��� ��������� �ʴ´�. ��
			// ������ִ� ������ View���� �ñ��.
			/* 
			 * if (row > 0) { System.out.println("�� �߰� ����!"); } else {
			 * System.out.println("�� �߰� ����..."); }
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
	} // ȸ������ �޼ҵ� ��
	
	
	
	// 2. �α��� �����ϴ� �޼ҵ�
	// �α����� �ߴµ� �н����带 �����ϰ� ���̵�, �̸�, ���̸� �����ش�. -> ��׸� �ϳ��� ���� ������Ʈ�� ������ش�.
	// public -> ����������
	// ����Ÿ�� -> MemberVO ��� ��ü�� ����
	// �Ű����� -> ����ڿ��� id, 
	public MemberVO login(String id, String pw) {
		MemberVO resultVO = null; // resultVO��� �̸����� MemberVO ��ü�� ������ش�.
								// ���� � ���� ���� �𸣴ϱ� null �� �־��ش�.
		
		// ex02Select ���� �ߴ� �ڵ带 �ܾ�´�.
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;


		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			
			conn = DriverManager.getConnection(url, user, password);

			
			// �α��� �� �� ���� SQL �������� ����? ���̺� �����Ͱ� �����ϴ��� ���ϴ��� ������ ==> SELECT
			// bigdatamember�� ��� �÷��� ��ȸ�Ѵ�.
			// id�� pw�� ���ƾ� �ϴ� ��������.
			// id�� pw�� ���� ������ �𸣴� ? ���ڸ� ����.
			String sql = "select * from bigdatamember where id = ? and pw =?"; 

			psmt = conn.prepareStatement(sql);

			// ? ���ڴ� executeQuery(), �����ϱ� ������ ä���ش�.
			psmt.setString(1, id);  // 1��°���� �Ű������� �޾ƿ� id �� �־��ش�.
			psmt.setString(2, pw); // 2��°�� �Ű������� �޾ƿ� pw�� �־��ش�.
			
			
			rs = psmt.executeQuery();


			//id�� �ߺ��� ���ٸ� ���� �� �ϳ� �ִ°ǵ�, ���� �ϳ���� �����Ͽ� while -> if�� �ٲ۴�.
			// rs.next()�� boolean�� ����Ÿ���̴� -> �����Ͱ� ������(=����� TRUE �϶�)�� �����Ѵ�.
			if (rs.next()) { // rs ��� Ŀ���� ������ ��ĭ ������ -> �� �÷��� �ִ� �����͵��� �̾ƿ´�.
							
				
				// ó���� �ܾ���� id pw �� �̸��� �ߺ��� �Ǿ� ������ ���.
				// ��¹����� �� �����
				
				String id2 = rs.getString("id");

				String pw2 = rs.getString("pw");

				String name = rs.getString("name");
				
				int age = rs.getInt("age");
				
				// �̾ƿ� id pw name age �� �������� �־�� �ұ�? resultVO�� �־���� �Ѵ�.
				// resultVO��� MemberVO Ÿ���� ��ü�� �������ְ� �Ű����� 4���� �������ش�.
				// �� 4���� �츮�� ���� �����ͺ��̽����� ������ ���� id2, pw2, name, age �̴�.
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
		
		// �ΰ��� �޼ҵ忡�� �ߺ��Ǵ� �κ��� �ִ�. 
		// ���� �κ�, Connection, PreparedStatement, �ݴ� �۾� -> ������ �޼ҵ�� ����.
		
		
		
		return resultVO;
	}
	
	
	
	
	
	
	
	
	
	
	
}