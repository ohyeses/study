package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex02Select {
	// main �־����.
	public static void main(String[] args) {
		// ���𱸹��� �������� ���� �۾�
		// 6�� �ݱ� �۾��� �� conn, psmt, rs�� ���������� ������ ��� ���� X ->������
		Connection conn = null; // �⺻���� null�� �ʱ�ȭ
		PreparedStatement psmt = null;
		ResultSet rs = null;

		// 1. ����̹� �ε�
		// ���� ���� JDBC ���� �� �� �ؾ��ϴ� ��.
		// Class �� ��� ��+�����̽� , forName ����
		// Class.forName(� ����̹�) �ؼ� ����̹��� �������� �ε��Ѵ�.
		// �����ε� => ������ ��Ű�鼭 �ڷ����� �ε��Ѵ�.
		// forName ���� �ȿ� �Ű������� �ּҰ��� ����. �ּҰ� = �츮�� �ε��ϰ� ���� �ּҰ�
		// Class.forName("oracle.jdbc.driver.OracleDriver"); ġ�� ������ �߸�
		// Surrounded with try/catch
		try {
			// �����ε��� �԰� ���ÿ� DriverManager�̶�� �ϴ� ������ Oracle ����̹��� ����.
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

			String user = "hr"; // �ǽ� ���� id hr�� �־��ش�.
			String password = "hr"; // ��� hr�� �־��ش�.

			// DriverM �ϰ� ��+��
			// DriverManager�� ������ �ִ� ��� �߿� �����ͺ��̽��� ������ �� �ִ� ����� getConnection()�� ����.
			// ������ Ŀ�ؼ�(����) �ϱ� ���ؼ��� url, user, password �� �ʿ��ϴ�.
			// getConnection �Լ��� ���� Ÿ���� Connection �̾ Connection Ÿ������ �޾��ش�.
			// Connection�̶� �����ͺ��̽��� �����ϴ� ��� �����͸� �������ִ� ��ü.
			// Connection ������ -> ����Ʈ �ؾ���. Import 'Connection' (java.sql)
			conn = DriverManager.getConnection(url, user, password);

			// Connection�� ���� �� �ƴ��� Ȯ��
			// Connection�� conn �̶�� �̸����� ���� ��,
			if (conn != null) { // null�� �ƴ϶��, connection ��ü�� ������� �ʴٸ�
				System.out.println("success!");
			} else {
				System.out.println("fail!");
			} // ������� �ϸ� �����ͺ��̽� ������ �ѰŴ�.
				// ������! �츮�� ������ SQL���� �ۼ����Ѽ� �� SQL���� ������ ���Ѿ� �Ѵ�.

			// 3. SQL�� �ۼ�(��� �÷��� Ȯ���ϴ� Query)
			// SQL ���� String ���·� �޾��ش�.
			String sql = "select * from bigdatamember"; // �� �ȿ� ������ �ۼ��Ѵ�.

			// 4. SQL���� �غ� ������ SQL���� ������ �� �ִ� ��ü�� �����ؾ� �Ѵ�. �� ��ü -> PreparedStatement.
			// PreparedStatement�� ������ �ҷ��� Connection�̶�� ��ü�� ���ؼ��� ������� �� �ִ�.
			// �� Connection ��ü�� ���ؼ� prepareStatement�� ����� ���� �̸� sql������ ����ش�.
			// conn.prepare ���� �ۼ��ϰ� ��+��
			// prepareStatement �� ����Ÿ���� PreparedStatement �̴� �� ����Ÿ������ �޾��ش�.
			psmt = conn.prepareStatement(sql);

			// 5. SQL�� ����
			// ������ ���ؼ� ����? PreparedStatement��� �ϴ� psmt <- �긦 ���ؼ� ����
			// �ڡڡ� ������ �����ų �� executeUpdate�� ������
			// executeUpdate -> ���� ������ ��ġ�� SQL���� ������ �� �����. ex) INSERT, UPDATE, DELETE
			// --> SELECT �� ���� ���� ���������� �࿡ ������ ��ġ�� �ʱ� ������
			// ===> executeQuery�� ����.
			// psmt.executeQu ���� ġ�� ��+�� -> ����Ÿ���� ResultSet�� �� ����.
			// ������ ResultSet�� ���� �𸣰����� ��� psmt.executeQuery�� �޾ƾ� �Ѵ�.
			// Result ���� ġ�� ��+�� -> ResultSet�� ������ Ŭ���� �ڵ� ����Ʈ ��Ų��.
			// ResultSet�� �̸��� rs���� �ش�.

			rs = psmt.executeQuery();
			// executeUpdate�� �ϸ� ������ ���� ���� ������ ���ƿԴٸ�(���ϵƴٸ�)
			// executeQuery��� �ϴ� ��� ����� ������ �� ResultSet�̶�� �ϴ°ɷ� �����ش�.

			// ResultSet => SELECT���� ���� ����� "���̺�"�� ���� ���·� ������ �ִ� ��ü��. (��x��)
			// �� �긦 ������ ��� ó���� �Ұǵ� Ư���� �� ������ �ִ�.
			// ResultSet�� Ŀ���� ������ �־ �� ����� �÷��̸����� Ŀ���� �������� �Ѵ�.
			// �ٵ� �츮�� �ؿ� �ִ� ��������� ������ �ͼ� �ϳ��� ����ʹٰ� ������ �ϸ�,
			// �׷��ٸ� Ŀ���� ��ġ�� �� ĭ ������ ������ �Ѵ�.
			// �� Ŀ���� ����Ű�� �ִ� ������ ���� �����͸� �� �� �ְ� ������ �� �ִ�.
			// Ŀ�� ������ ���? rs�� ������ �ִ� ��� �߿� next()��� ����� ���� Ŀ���� ��ĭ ������ ��������.
			// ====> rs.next() �� ResultSet�̶�� �ϴ� ��ü�� ������ �ִ� Ŀ���� �� ĭ ������ �����ִ� �۾��̴�.

			// 6. ����� ó�����ֱ�.
			// rs.next() -> Ŀ���� �� ĭ ������ ������ ���
			while (rs.next()) { // rs.next() -> boolean�� ����Ÿ���̴� �����Ͱ� �������� ,TRUE �ϋ���
								// ������ ���� �´� �����͸� �̾ƿͼ� ����ؼ� �����ش�.
								// ���� � �ִ��� �𸣴ϱ� while rs.next()�� �����ش�.

				String id = rs.getString("id"); // rs�� ������ �ִ� ��� �� getString
												// �����ε����� �Ű������� int�� String�� ���� �� 2���� �ִµ�
												// int ���´� �� ��° �÷�����, �÷��� ������ ���� ���̴�.
												// String ���´� �÷��� �̸��� ����. <- �� ����.

				String pw = rs.getString("pw"); // �н����带 �����ž�.

				String name = rs.getString("name"); // �̸��� �����´�.
				int age = rs.getInt("age"); // ���̴� ���� ���� -> ���������� �����ش�.

				// while�� ���鼭 ��� �����͸� ������ش�.
				System.out.println(id + "\t" + pw + "\t" + age + "\t");

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 7. �ݱ�
			// ��� ���ܰ� �߻����� �𸣴µ� �ڿ�(Connection, PreparedStatement)�� �ݳ��� ������ ���� ����
			// �ڿ� �ݳ��� ������ ���� �� �ִ� �ڵ�
			// ������ �ѹ��� ��������� �ϴ� ����
			// ���ܰ� �߻��ϴ��� ����!
			// if���� try catch�� ����
			try {
				// �ڡڡ� ���� ���� �ڿ��� �Ҵ��� �������� �ݾ���� �Ѵ�. �ڡڡ�
				// == ������ ������ ������ �ݾ���� �Ѵ�.
				// 1. Resultset �ݰ� PreparedStatement �ݾ��ְ� ���������� Connection �ݾ��ִ� �������.
				// rs, psmt, conn�� ���������� ���ʿ� ������ �ع��ȱ� ������ rs.close()��, �ݾ��ִ� ��û�� ���Ѵ�.
				// ==> �� ����� main�� ���ʿ� 3���� ��ü�� �����Ѵ�.

				// �������� ��� -> Ȥ�� �� ���ܸ� ó���ϱ� ���� try catch �������� �����ش�.
				if (rs != null) // rs�� null �� �ƴ϶��, �����ִٸ�
					rs.close(); // rs �� �ݴ´�.

				if (psmt != null)// psmt �ڿ��� null �� �ƴ϶��, �����ִٸ�
					psmt.close(); // psmt�� �ݴ´�.

				if (conn != null)// conn�� null�� �ƴ϶��, �ڿ��� ���Ǿ��ٸ�
					conn.close(); // conn�� �ݴ´�. -> ������ �߸� Surrounded with try catch

			} catch (SQLException e) { // �����ͺ��̽��� ���� ����ó��.
				e.printStackTrace();
			}

		}

	}

}
