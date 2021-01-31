
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex08makegugu")
public class Ex08makegugu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=euc-kr"); // ������ html��, ���ڵ��� euc-kr �� �ϰڴ�.

		PrintWriter out = response.getWriter(); // PrintWriter ��ü ����
		
		
		String color = request.getParameter("color"); // �÷� ���� String ���·� �޾ƿ´�.
		int num1 = Integer.parseInt(request.getParameter("num1")); // num1 ���� int ���·� ��ȯ �� ������ ��´�.
		int num2 = Integer.parseInt(request.getParameter("num2"));

		out.print("<html>"); // html ���� �ۼ�
		out.print("<body>");
//		out.print("<table border = '1'  + 'bgcolor=' + color + >");
		out.print("<table border=1; bgcolor=" + color +">"); // ��輱�� 1px, �޾ƿ� color�� ���� �����ϴ� ���̺��� �����.
		for (int i = num1; i <= num2; i++) { // i�� num1���� num2���� �ݺ�
			out.print("<tr>"); // for���� ���ư��鼭 i Ƚ�� ��ŭ ���� �����ȴ�.
			for (int j = 1; j < 10; j++) { // j�� 1���� 10���� 
				out.print("<td>" + i + "*" + j + "=" + i * j + "</td>"); // �� ���� ������ i*j ������ ä���.
			}
			out.print("</tr>"); // �� ���� ����� �������� ������ ���ش�.
		}

		out.print("</table>");
		out.print("</body>");
		out.print("</html>");

	}

}
