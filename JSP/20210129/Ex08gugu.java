
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex08gugu")
public class Ex08gugu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int N = Integer.parseInt(request.getParameter("num")); //String ������ num�� int�������� ����ȯ �����ش�. 

		response.setContentType("text/html; charset=euc-kr"); // html ��������, euc-kr ���ڵ� ������� �ϰڴ�.

		PrintWriter out = response.getWriter(); //PrinterWriter ��ü�� ���ڴ�.
		
		out.print("<html>"); // html ���� �����
		out.print("<body>");
		out.print("<table border=1>"); // ���̺� ��輱�� 1px�� �� ���̺� �����
		// ���̺� �ȿ� �������� ����Ѵ�.
		
		for (int i=1; i< 10; i++) { // i�� 1���� 9����
			out.print("<tr>"); // <tr>�� �����Ƿν� �����ܽ��� �� �྿ ����� �ȴ�.
			out.print("<td>" + N + "*" + i + "=" + N*i + "</td>");
			
			out.print("</tr>");
			
		}
		
		
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

}
