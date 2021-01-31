

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02Datasend")
public class Ex02Datasend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//����ڰ� ��û�� ���� �޾��ش�. -> request ��ü ���
		String data = request.getParameter("data"); // form �±׿� �ۼ����� name ���� ������ �����Ѵ�.
		
		// System.out.println(data);
		
		// html �������� ������ ���ְ�, euc-kr�� ���ڵ��� ���ش�.
		response.setContentType("text/html; charset=euc-kr");
		
		
		// PrintWriter ��ü ���� -> ������ �� �ʿ��� ��ü�̴�.
		// response.getWriter() �޼ҵ带 ȣ���ϸ� PrintWriter ��ü�� �� �� �ִ�.
		PrintWriter out = response.getWriter(); //import java.io.PrintWriter;  �ʿ�
		
		
		// out ��ü�� �̿��ؼ� ȭ���� ����Ѵ�.
		// html ���� �����
		out.print("<html>");
		out.print("<body>");
		
		//body �±� ���̿��� � ���� ����Ұ��� �����ش�.
		//strong �±� -> ���ڿ��� �ۼ��ϱ�
		out.print("�Է��� �����ʹ� <strong>" +data+ "</strong>�Դϴ�."); //data ���� ��� �Ѵ�.
		
		out.print("</body>");
		out.print("</html>");
	}

}
