

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex08getpost")
public class Ex08getpost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Get ���
	/*
	 * - URL�� ������ ���� 
	 * - �����ϴ� �������� ���̿� �Ѱ�(1024byte) 
	 * - �����Ͱ� URL ��ü�� ������ �Ǳ� ������ ���Ȼ� ���������� 
	 * - �̷� ����� Query String ����̶�� �Ѵ�. 
	 * - �˻���� url ����ǵ� ��� ����
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("get!!!");
		String name = request.getParameter("name");
		System.out.println(name);
				
	}
	
	// Post ���
	/*
	 * - ��Ŷ(Packet)�� ��Ƽ� �����ϴ� ��� 
	 * - �����ϴ� ������ ���̿� ������ ���� 
	 * - ������ �ȵǴ� get ��� ���ٴ� ���ȿ� ���ϴ�.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("post!!!");
		request.setCharacterEncoding("euc-kr");
		String name = request.getParameter("name");
		System.out.println(name);
	}

}
