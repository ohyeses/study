package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex01_JDBC {
	// main �־����.
	public static void main(String[] args) {
		Connection conn = null; // �⺻���� null�� �ʱ�ȭ
		PreparedStatement psmt = null;
		
		// 1. ����̹� �ε�
		// Class �� ��� ��+�����̽� , forName ����
		// Class.forName(� ����̹�)
		// Class.forName("oracle.jdbc.driver.OracleDriver"); ġ�� ������ -> ����ó���� ���ؼ� ���.
		// Surrounded with try/catch. ����ó���� ���ش�.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 1 �ۼ� �� try �� �ȿ��ٰ� �ۼ�.
			// 2. �����ͺ��̽� ����
			// DriverManager. ���� ġ�� 3��° �Ű����� 3���ִ°� ����
			// jdbc����̹��� oracle thin Ÿ���̴�.
			// localhost -> ip�ּ�
			// 1521 -> serverport ��ȣ
			// xe -> �����ͺ��̽��� �̸�(����)
			
			// 2-2. DriverManager.getConnection ���� ������ �߸� ����° catch�� �ΰ��ΰ� ����.
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
			
			String user = "hr"; // hr�� �־��ش�.
			String password = "hr"; //��� hr�� �־��ش�.
			
//		DriverM �ϰ� ��+��
			// ������ Ŀ�ؼ� �ϱ� ���ؼ��� url, user, password �� �ʿ��ϴ�.
			// getConnection �Լ��� ���� Ÿ���� Connection �̾ Connection���� �޾��ش�.
			// Connection�� java.sql 3��°�� �����´�.
			conn = DriverManager.getConnection(url, user, password);
			
			// ���� �� �ƴ��� Ȯ��
			if (conn!=null) { //connection ��ü�� ������� �ʴٸ�
				System.out.println("success!");
			} else {
				System.out.println("fail!");
			}
			
			// 3. SQL�� �ۼ�(��� �÷��� Ȯ���ϴ� Query)
			// SQL ���� String ���·� �޾��ش�.
			String sql  = "insert into bigdatamember values('soyoung', '12345', '�ҿ�', 20)"; // �� �ȿ� ������ �ۼ��Ѵ�.
			
			// 4. SQL���� �غ� ������ SQL���� ������ �� �ִ� ��ü�� �����ؾ� �Ѵ�.
			// �� ��ü�� ������ �� �ִ°� ������ ����� ��ü�� Connection �̴�.
			// conn�� ���ؼ� ��ü�� �����Ѵ�.
			// conn.prepare ���� �ۼ��ϰ� ��+��
			// prepareStatement �� ����Ÿ���� PreparedStatement �̴� �� ����Ÿ������ �޾��ش�.
			// ��ü�� �����Ҷ��� �̸� sql���� ���� ����ش�.
			// conn ��ü�� ���ؼ� prepareStatement�� ����� ���� �̸� sql������ ����ش�.
			psmt = conn.prepareStatement(sql);
			
			
			// 5.����
			// ���� �߰�, ������Ʈ �Ѵ�. -> execute
			// ������ �ϰ� ���� ������ ���� �ݿ��� �ƴ��� �Ǵ��� �ؾ���.
			// executeUpdate�� ����Ÿ���� int �� �޾��ش�.
			// int -> ������ ���� ���� ����
			// => executeUpdate �ϸ� ������ ���� ���� ���ڰ� ���ƿ´�.
			int row = psmt.executeUpdate();
			
			
			// �����ߴ��� �����ߴ��� �����Ǻ�
			// �����ߴٸ� 0�̶�� ����, �����ߴٸ� 1�̶�� ���� ����
			if (row > 0) { // row �� 0���� ũ�ٸ� ����
				System.out.println("�� �߰� ����!");
			} else {
				System.out.println("�� �߰� ����...");
			}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ��� ���ܰ� �߻����� �𸣴µ� �ڿ�(Connection, PreparedStatement)�� �ݳ��� ������ ���� ����
			// �ڿ� �ݳ��� ������ ���� �� �ִ� �ڵ�
			// ������ �ѹ��� ��������� �ϴ� ����
			// ���ܰ� �߻��ϴ��� ����!
				// if���� try catch�� ����
				try {
					// 6. �ݱ�
					//�ڡڡ� ���� ���� �ڿ��� �Ҵ��� �������� �ݾ���� �Ѵ�. �ڡڡ�
					// == ������ ������ ������ �ݾ���� �Ѵ�.
					// �� PreparedStatement �ݾ��ְ� �� ���� Connection �ݾ���� �Ѵ�.
					
					if (psmt!=null) { //psmt �ڿ��� null �� �ƴ� ��, ���ǰ� ���� ��
						psmt.close(); //psmt�� close �ϰڴ�.
					}
					
					
					if(conn != null){// ���࿡ �ڿ��� ���ƴٸ� ��, conn�� null�� �ƴ϶��
					conn.close(); // conn�� �ݴ´�. -> ������ �߸� Surrounded with try catch
					}
				} catch (SQLException e) { //�����ͺ��̽��� ���� ����ó��.
					e.printStackTrace();
				} 
			
		}
		
	}

}
