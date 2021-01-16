package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex01Update {
// �������� jar ���Ͼ� �־ �׷���.
// ������Ʈ ���� ��Ŭ -> Build Path -> Configure Build Path -> ClassPath ���� -> Add jar -> ojdbc6.jar �߰�
	public static void main(String[] args) {
		// ��ü�� �������� ���ش�.
		// 6�� �ݱ� �۾��� �� conn, psmt�� ���������� ������ ��� ���� X ->������
		Connection conn = null;
		PreparedStatement psmt = null;

		Scanner sc = new Scanner(System.in);

		// ����ڿ��� ���� �Է¹޴´�. Scanner ���
		System.out.println("������ ���̵� �Է��ϼ��� >> ");
		String id = sc.next();
		System.out.println("� �̸����� ������ �� �Է��ϼ��� >> ");
		String name = sc.next();

		try {
			// 1. ����̹� ���� �ε� => ���� ���� JDBC ���� �� �� �ؾ��ϴ� ��.
			
			// Class �� ��� ��+�����̽� , forName ����
			// Class.forName(� ����̹�) �ؼ� ����̹��� �������� �ε��Ѵ�.
			// �����ε� => ������ ��Ű�鼭 �ڷ����� �ε��Ѵ�.
			// forName ���� �ȿ� �Ű������� �ּҰ��� ����. �ּҰ� = �츮�� �ε��ϰ� ���� �ּҰ�
			// Class.forName("oracle.jdbc.driver.OracleDriver"); ġ�� ������ -> ����ó���� ���ؼ� ���.
			// Surrounded with try/catch. ����ó���� ���ش�.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			
			
			// 2. �����ͺ��̽� ����
			// ����~�����ϴ� �ͱ��� try~catch�� �ϳ��� �������� �Ҳ��� ������ ���ʿ��� �ۼ��Ѵ�.
			// DriverManager�� �ʿ��� �غ� 3���� String ���·� �����Ѵ�.
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // url �ܿ��ʿ� X, Data Source Explorer ���� �� �� �ִ�.
													// New Oracle ���� �ȵȻ��¸� ����Ŭ���ؼ� ��������ش�.
													// New Oracle���� ��Ŭ -> Properties -> Driver Properties �� url�� �ִ�.
			String user = "hr";
			String password = "hr";

			
			
			// DriverM ��+�� -> �ڵ� ����Ʈ
			// getConnection�� �Ű������� 3���ִ� �ɷ�.
			// ��ü ������ -> ����ó���� ���ؼ� ��. 2��°�� ������ catch�� �߰�.
			// Connection ������ -> ����Ʈ �ؾ���. Import 'Connection' (java.sql)

			// DriverManager�� ������ �ִ� ��� �߿� �����ͺ��̽��� ������ �� �ִ� ����� getConnection()�� ����.
			// ������ Ŀ�ؼ�(����) �ϱ� ���ؼ��� url, user, password �� �ʿ��ϴ�.
			// getConnection �Լ��� ���� Ÿ���� Connection �̾ Connection Ÿ������ �޾��ش�.
			// Connection�̶� �����ͺ��̽��� �����ϴ� ��� �����͸� �������ִ� ��ü.
			conn = DriverManager.getConnection(url, user, password);

			
			// Connection�� ���� �� �ƴ��� Ȯ��
			// Connection�� conn �̶�� �̸����� ���� ��,
			if (conn != null)
				System.out.println("success!");
			else
				System.out.println("fail!"); // ������� ���� �����غ���.

			
			
			// 3. SQL�� �ۼ� -> ���̵� �´� �̸� �÷��� ����
			// UPDATE bigdatamember SET name = '�̸�" WHERE ID = '�Է��� ��'
			// String sql = "UPDATE bigdatamember SET name ='"+name+"' WHERE ID = '"+id+"'";
			// �������� �����ϱ� ���� ' ����ǥ �ڿ� " �ֵ���ǥ�� ó���� ���� ������ + �� �������̴�.
			// ���̷��� �ϸ� �����ϱ� ������ �׳� ?�� ����.
			// ? -> Preparedstatement�� ���. ���� �� �� �𸦶� ����.
			String sql = "UPDATE bigdatamember SET name =  ? WHERE ID = ?";

			// 4. SQL�� �����ϴ� ��ü ����
			// Import 'PreparedStatement' java.sql;
			psmt = conn.prepareStatement(sql);
			// �� sql ������ prepareStatement ������ ���, ? ���ڰ� ���ø��� �������� �����.

			// sql ������ execute ���� ���� �� ���̿���  ? ���ڸ� ä���� �� �ִ�.
			// preparedstatement �� ������ �ִ� ��� �߿� ���� ���� �� �ִ� ����� set�� �ִ�.
			// SetString -> String ���·� ä��Ŵ�.
			// Ư���ϰ� 1���� �����Ѵ�. ���� �迭 0���� ���� X
			// psmt.setString(1.���° ����ǥ ����, 2.ä���� ��)
			
			psmt.setString(1, name); // 1��° ���ڸ� name���� ä���.
			psmt.setString(2, id); // 2��° ���ڸ� ä��ž�, id ������.

			// 5. ���� �࿡ ������ �ִ� ���� 
			// �࿡ ������ ��ġ�� �۾��� ������ ���� -> executeUpdate
			// executeUpdate�� ����Ÿ���� int �̴�.
			// int -> ������ ���� ���� ����
			// => executeUpdate �ϸ� ������ ���� ���� ���ڰ� ���ƿ´�.
			int row = psmt.executeUpdate();

			
			// �����ߴ��� �����ߴ��� �����Ǻ�
			// �����ߴٸ� 1�̶�� ����, ���и� 0 ����
			if (row > 0) { // row�� 0���� ũ�ٸ�
				System.out.println("������Ʈ ����!");
			}
			else // �׷��� �ʴٸ�
				System.out.println("������Ʈ ����!");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { //finally -> ������ �ѹ��� ��������� �ϴ� ����
			// 6. �ݱ�
			// if �� ���� ����� psmt.close()�� �������� ���ٸ�
			// Surround with try/catch -> try �� ������ if���� ����ִ´�.
			
			try {
				//�ڡڡ� ���� ���� �ڿ��� �Ҵ��� �������� �ݾ���� �Ѵ�. �ڡڡ�
				// �� PreparedStatement �ݾ��ְ� �� ���� Connection �ݾ���� �Ѵ�.
				if (psmt != null) // PreparedStatement ��ü �ݾ��ֱ�
					psmt.close(); // null�� �ƴϾ��� ��, �ݾ��ֱ�

				if (conn != null) // Connection ��ü �ݾ��ֱ�
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
