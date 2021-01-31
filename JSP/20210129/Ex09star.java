
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex09star")
public class Ex09star extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=euc-kr"); // ������ html ����, ���ڵ��� euc-kr �� �Ѵ�.
		PrintWriter out = response.getWriter(); // PrintWriter ��ü ����

		int N = Integer.parseInt(request.getParameter("num")); // num�� int ������ ����ȯ ��Ų�� ������ ��´�.
		String color = request.getParameter("color"); // color�� String ���·� ��´�.

		out.print("<html>"); // html ���� ����
		out.print("<body>");
		out.write("<table border=1 ; bordercolor=red ;" + ">"); // ��輱 1px, ��輱 ���� �������� ���̺� ����, tr�� td ���� ��輱 ���� ���� �� ��
																// ����.
//		out.print("<table border=1; bgcolor=" + color +">");
		for (int i = 1; i <= N; i++) {
			out.print("<tr>");
			for (int j = 0; j < i; j++) {
				if (i % 2 == 1) { // i�� Ȧ�����

					out.print("<td bgcolor=" + color + ">" + "*" + "</td>"); // ������ color ������ , * ���

				} else {

					out.print("<td>" + "*" + "</td>"); // ¦����� ���� ���� * ���
				}
			}
			out.print("</tr>"); //j���� �����Ǹ� </tr>�� �ݾ��ش�.
		}

		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

}
