package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex01Update {

	public static void main(String[] args) {
		// ������ �߸� import ���� ��.!! java.sql -> Connection
		Connection conn = null;
		PreparedStatement psmt = null;

		// ���̵�, �̸��� �Է� �޴´�.
		Scanner sc = new Scanner(System.in);

		System.out.print("������ ���̵� �Է��ϼ��� >> ");
		String id = sc.next();
		System.out.print("� �̸����� ������ �� �Է��ϼ��� >> ");
		String name = sc.next(); // -> ����ڿ��� ���� �Է�
		// JDBC �ڵ� �ۼ�

		// 1. ����̹� ���� �ε� -> ���� ���� ������Ʈ ��Ŭ�� Build Path ->Configure Build path
		try {

			// Class�� ������ �ִ� ��� �� forName�̶�� ����� ����.
			// �� �ȿ��� �ּҰ��� �ִ´�. �ּҰ��� �ܿ� �ʿ� ����.
			// ������ ���� => Surrounded with try catch
			// try ���ʿ��� �ִ´�.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. �����ͺ��̽� ����
			// �Ʒ� ���ῡ �ʿ��� �͵� �غ� url, user, password
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			// �Ű����� 3���� ���� �޼��带 ���
			// ���� Ÿ���� Connection �� conn���� �ݾ��ش�.
			// �� ������ ������ ����ó�� -> �����ͺ��̽� ������ ����ó�� �϶�� ��
			// �ι�°�� Ŭ�� -> catch�� ���� �Ǵٸ� catch��.
			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("01/15 success!");
			} else {
				System.out.println("fail...");
			}

			// 3. SQL�� �ۼ� -> ���̵� �´� �̸� �÷��� ����
			// UPDATE bigdatamember SET name = '��' WHERE ID = '�Է��� ��'
			// '" �̱� �ڿ� ����. ����ǥ ���� �ϳ��ϳ� �ٿ��ִ� ����.
			// �װ� �����ϱ� ���ؼ� psmt�� Ư���� ����� ������ �ִ�. -> statement�� ����.
			// ������ �� ���� ���ؼ� ������������� �غ��� �� �ִ�.
			// String sql = "UPDATE bigdatamember SET name = '"+name+"' WHERE ID =
			// '"+id+"'";
			// ?�� '�� �� ���� ����' ��� ��.
			// ?�� preparedstatement ���� ������ �ִ� ���. � ���� ���� �� �� ���� ���.

			String sql = "UPDATE bigdatamember SET name = ? WHERE ID =?";

			// 4. SQL�� �����ϴ� ��ü ����
			// psmt �� conn�� ���� �������.
			// �갡 �������ִ� ����߿� preparedstatement��� ���� �־��� sql�� �Ű������� �޴´�.
			psmt = conn.prepareStatement(sql);

			// � ���� ����� �� set
			// preparedstatement �� ������ �ִ� ��� �߿� ���� ���� �� �ִ� ����� set�� �ִ�.
			// String ���·� ä��Ŵ�.
			// Ư���ϰ� 1���� �����Ѵ�.
			// psmt.setString(���° ����ǥ ����, ä���� ��)
			// 1- ���° ���ڸ� ä�� �ٰ���, 2-� ������ ä���ٰ���
			// �ι�° ���ڸ� ä��ž�, id ������.
			psmt.setString(1, name);
			psmt.setString(2, id);

			// 5. ���� -> executeUpdate
			// ���� ������Ʈ �Ǵ� �۾��� executeUpdate�� ����.
			// ���� ����Ÿ���� int. -> ������ ���� ���� ���� -> row��� �̸��� �ش�.
			int row = psmt.executeUpdate();

			if (row > 0) { // row�� 0���� ũ�ٸ�
				System.out.println("update ����!");
			} else { // �׷��� �ʴٸ�
				System.out.println("update ����!");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			// 6. �ݱ�
			// ���� �� �������� �ݾƾ� �ϴ� 1. psmt 2. conn ������ �ݾ��ش�.
		} finally {
			try {
				if (psmt != null) {
					psmt.close();
				}

				if (conn != null) { // conn�� null�� �ƴϾ��� �� null�� �ݾ��ش�.
					conn.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
