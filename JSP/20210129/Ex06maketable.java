

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex06maketable")
public class Ex06maketable extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html; charse=euc-kr");
		
		PrintWriter out = response.getWriter();
		
		int N = Integer.parseInt(request.getParameter("num1")); //num1을 int 형으로 바꾼다.
				
		out.print("<html>");
		out.print("<body>");
		out.print("<table border = '1' > "); // 테이블 만들기
		out.print("<tr>"); // table row
		
		for (int i=1; i<= N; i++) {
			out.print("<td>" + i + "</td>"); // table data
		}
		
		out.print("</tr>");
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
