

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex07login")
public class Ex07login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id"); // id ���� �޾ƿͼ� String ������ �־��ش�.
		
		response.setContentType("text/html; charset=euc-kr"); // html ��������, ���ڵ��� euc-kr�� �Ѵ�.
		
		PrintWriter out = response.getWriter();// PrintWriter ��ü ����
		
		// html ���� ����
		out.print("<html>"); 
		out.print("<body>");
		
		out.print(id + " �� ȯ���մϴ�.");
		
		
		out.print("</body>");
		out.print("</html>");
	}

}
