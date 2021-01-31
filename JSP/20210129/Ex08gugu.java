
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

		int N = Integer.parseInt(request.getParameter("num")); //String 형태의 num을 int형식으로 형변환 시켜준다. 

		response.setContentType("text/html; charset=euc-kr"); // html 형식으로, euc-kr 인코딩 방식으로 하겠다.

		PrintWriter out = response.getWriter(); //PrinterWriter 객체를 쓰겠다.
		
		out.print("<html>"); // html 구조 만들기
		out.print("<body>");
		out.print("<table border=1>"); // 테이블 경계선을 1px로 한 테이블 만들기
		// 테이블 안에 구구단을 출력한다.
		
		for (int i=1; i< 10; i++) { // i는 1부터 9까지
			out.print("<tr>"); // <tr>을 넣으므로써 구구단식이 한 행씩 출력이 된다.
			out.print("<td>" + N + "*" + i + "=" + N*i + "</td>");
			
			out.print("</tr>");
			
		}
		
		
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

}
