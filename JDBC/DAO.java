package JDBC;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// MVC ���� �� Controller �� ������ �Ѵ�.
// Controller -> ���� ����ԡ� ó���� ���� �����ϴ� ������ �Ѵ�.
public class DAO {
	// DAO -> DataBase Access Object�� ����. �����ͺ��̽� ���� ��ü
	// �����ͺ��̽��� �����ϴ� ��� ��ü�� DAO��� Controller�� ������ �Ѵ�.

	// �ߺ��Ǵ� �κ��� �ʵ�� ���ش�.
	// private ���� -> �ܺ��� ������ ���´�
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	// �ߺ��ڵ� ����ȭ - 2
	// private -> �ٸ� Ŭ�������� ���� ���� DAO �ȿ����� ���� ������.
	// ����Ÿ�� X �Ű����� X
	private void getConnection() {
		// ���� �� �߸� surround with try catch Ŭ��
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// try �� ������ �̵���Ų��.
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
	
	// �ߺ��ڵ� ����ȭ - 3
	// �ܺο��� ���� �ʱ� ������ private���� ����.
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

	// 1. ȸ������ �޼ҵ带 ������ش�. (INSERT)
	// public ���������� -> �ܺο��� ������ �� ���ְ� ��.
	// ��ȯ�� int -> INSERT ��� �ϴ� JDBC �۾��� ���ְ� ���� ������� int������ ���ͼ�
	// id pw name pw�� �ϳ��� ���� �� �ִ� �ڷ��� -> MemberVO
	// �Ű����� ��ü�� MemberVO �� �ٲ۴�.
	public int insert(MemberVO vo) {

		int result = 0; // ������� ���� ����

//		JDBC�� �ݺ��۾��̴�. �ڵ尡 �ٲ��� �ʴ´�.
//		ex01_JDBC�� insert���� �����ؼ� �����´�.

		try {
			getConnection();

			// �Ű������� ���� �ֵ��� �Է������ �Ѵ�.
			// ����ڰ� ������ �Է����� �𸣴� ? ���ڸ� ����.
			String sql = "insert into bigdatamember values(?,?,?,?)"; // �� �ȿ� ������ �ۼ��Ѵ�.

			psmt = conn.prepareStatement(sql);

			// ? ���� ä��� ���� ������ �ؾ��Ѵ�. executeUpdate() ���� �ۼ�.
			// setString() -> �Ѱ��ִ� ���ڰ� String Ÿ���̶��
			// setInt() -> �Ѱ��ִ� ���� ���� int ���
			
			
			psmt.setString(1, vo.getId()); //Membervo���� ���̵� �����ͼ� ä���ش�.
			psmt.setString(2, vo.getPw()); 
			psmt.setString(3, vo.getName()); 
			psmt.setInt(4, vo.getAge());

			// ������ ���� ���� ������ ��Ƽ� ������ ���ִ� ���� row�� result�� �ٲ۴�.
			result = psmt.executeUpdate();


			// ClassNotFoundException �����
			// SQLException�� �����ͺ��̽��� ���õ� ���ܻ����̱� ������ conn.prepareStatement���� ���ܰ� �߻��� �� �ֱ� ������
			// ������ �ʴ´�.
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			getClose();

		}

		return result;
	} // ȸ������ �޼ҵ� ��

	// 2. �α��� �����ϴ� �޼ҵ�
	// �α����� �ߴµ� �н����带 �����ϰ� ���̵�, �̸�, ���̸� �����ش�. -> ��׸� �ϳ��� ���� ������Ʈ�� ������ش�.
	// public -> ����������
	// ����Ÿ�� -> MemberVO ��� ��ü�� ����
	// �Ű����� -> id pw�� MemberVo�� ������ �� �ִ�
	public MemberVO login(MemberVO vo) {
		MemberVO resultVO = null; // resultVO��� �̸����� MemberVO ��ü�� ������ش�.
									// ���� � ���� ���� �𸣴ϱ� null �� �־��ش�.

		// ex02Select ���� �ߴ� �ڵ带 �ܾ�´�.

		try {
			getConnection();

			// �α��� �� �� ���� SQL �������� ����? ���̺� �����Ͱ� �����ϴ��� ���ϴ��� ������ ==> SELECT
			// bigdatamember�� ��� �÷��� ��ȸ�Ѵ�.
			// id�� pw�� ���ƾ� �ϴ� ��������.
			// id�� pw�� ���� ������ �𸣴� ? ���ڸ� ����.
			String sql = "select * from bigdatamember where id = ? and pw =?";

			psmt = conn.prepareStatement(sql);

			// ? ���ڴ� executeQuery(), �����ϱ� ������ ä���ش�.
			psmt.setString(1, vo.getId()); // vo���� id�� �����´�.
			psmt.setString(2, vo.getPw()); // vo���� pw�� �����´�.
			rs = psmt.executeQuery();

			// id�� �ߺ��� ���ٸ� ���� �� �ϳ� �ִ°ǵ�, ���� �ϳ���� �����Ͽ� while -> if�� �ٲ۴�.
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

		}
		// ClassNotFoundException �����
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		// 0118
		// �ΰ��� �޼ҵ忡�� �ߺ��Ǵ� �κ��� �ִ�.
		// ���� �κ�, Connection, PreparedStatement, �ݴ� �۾� -> ������ �޼ҵ�� ����.

		// �����ͺ��̽� �����ϴ� �κ��� ������ �޼ҵ�� ����.

		return resultVO;
	}

	
	// ���� Ÿ�� int - > ������ ���� ���� �����̴�.
	// �Ű����� -> MemberVO�� �޾ƿ´�.
	public int delete(MemberVO vo) {
		int result = 0; // ������� ���� ����
		

		try {
			// 1. ������� �����ͺ��̽� �����ϱ�.
			getConnection();

			// 2. SQL�� �ۼ�
			// �Ű������� ���� �ֵ��� �Է������ �Ѵ�.
			// ����ڰ� ������ �Է����� �𸣴� ? ���ڸ� ����.
			String sql = "delete from bigdatamember where id =? and pw = ?";

			// 3. psmt ��ü �����
			// psmt�� conn�� ���� ����� �� �� �ִ�.
			psmt = conn.prepareStatement(sql);

			// 4. ����ǥ ���ڸ� ä���ִ� �۾�.
			// ? ���� ä��� ���� ������ �ؾ��Ѵ�. executeUpdate() ���� �ۼ�.
			// setString() -> �Ѱ��ִ� ���ڰ� String Ÿ���̶��
			// setInt() -> �Ѱ��ִ� ���� ���� int ���
			psmt.setString(1, vo.getId()); //Membervo���� ���̵� �����ͼ� ä���ش�.
			psmt.setString(2, vo.getPw()); 

			// �࿡ ��ȭ�� �ִ� �۾��� executeUpdate�� ����.
			// executeUpdate ���� Ÿ�� -> int �� result�� ����ش�.
			result = psmt.executeUpdate(); // ������ ���� ���� ������ result�� ����ش�.


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			getClose();

		}

		
		
		return result;
	}

	
	// ���� -> ArrayLis Ÿ������.
	public ArrayList<MemberVO> allSelect() {
		
		// MemberVO�� ��� AraryList�� list
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		
		try {
			// 1. ����̹� ����
			getConnection();
			
			// 2. SQL ���� �����
			String sql = "select * from bigdatamember"; //���̺� �ִ� ��� ���� ��������
			
			// 3. psmt ��ü �����
			// sql ������ ���� PreparedStatement psmt �� conn ���ؼ� �����.
			psmt = conn.prepareStatement(sql);
			
			// 4. ����
			// executeQuery -> �࿡ ������ ��ġ�� ���� �� ����.
			rs = psmt.executeQuery();
			
			// rs-> ���̺�� ���� �����̰� Ŀ���� ������ �ִ�.
			// rs.next() -> Ŀ���� �� ĭ ������ ������ ���
			while (rs.next()) { // rs.next() -> boolean�� ����Ÿ���̴� �����Ͱ� �������� ,TRUE �϶���
								// ������ ���� �´� �����͸� �̾ƿͼ� ����ؼ� �����ش�.
								// ���� � �ִ��� �𸣴ϱ� while rs.next()�� �����ش�.
				
				//getString() -> rs���� ���� �����´�.
				String id = rs.getString("id"); // ������ id�� String id�� ����ش�.
				String pw = rs.getString("pw"); 
				String name = rs.getString("name"); 
				int age = rs.getInt("age");
				
				// id pw name age �� �ϳ��� ���� �� �ִ� �ڷ��� MemberVO ��ü �����
				MemberVO vo = new MemberVO(id,pw,name,age);
				
				// ��̸���Ʈ�� ���� ����ٶ��� ����Ʈ�� ������ �ִ� ��� �� add() ����ϱ�
				// MemberVO�� �ϳ��� ��� �����ϱ� ���� ��̸���Ʈ list
				// While�� �������� ���ܳ��� vo ��ü���� ��̸���Ʈ�� ��Ƶд�.
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		
		return list;// ��̸���Ʈ�� list�� ��ȯ�Ѵ�.
	}

}