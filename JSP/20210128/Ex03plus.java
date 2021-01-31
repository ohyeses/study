

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex03plus")
public class Ex03plus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		// request ��ü -> ����ڰ� ������ ���� �ޱ� ���� ���
		// ������ �ϱ� ������ ���ڿ��� �ƴ϶� ���������� �޾��ش�.
		// ���� �ߴ� �� -> String���� ��ȯ�Ǵ°� int�� �������ϱ�.
		// Integer.parseInt �� �Ἥ String Ÿ���� ���ڿ��� Integer�� �ٲ��ش�.
		int num1 = Integer.parseInt(request.getParameter("num1")); // getParameter() �ȿ� name �� ����
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		
		
		// html ������ �ۼ��ϰڴ�, ���ڵ� ��� ����
		response.setContentType("text/html; charset=euc-kr");
		
		
		//PrintWriter ��ü ����
		PrintWriter out = response.getWriter();
		
		
		//out�� ����� html ���� ���
		//html ���� �����
		out.print("<html>");
		out.print("<body>");
		
		out.print(num1 + "+" + num2 + "=" + (num1+num2) + "<br>"); // �ٹٲ� �Ϸ��� <br> �±� ���
		
		out.print("</body>");
		out.print("</html>");
		
	}

}
