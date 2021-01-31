
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

		response.setContentType("text/html; charset=euc-kr"); // 형식은 html로, 인코딩은 euc-kr 로 하겠다.

		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성
		
		
		String color = request.getParameter("color"); // 컬러 값을 String 형태로 받아온다.
		int num1 = Integer.parseInt(request.getParameter("num1")); // num1 값을 int 형태로 변환 후 변수에 담는다.
		int num2 = Integer.parseInt(request.getParameter("num2"));

		out.print("<html>"); // html 구조 작성
		out.print("<body>");
//		out.print("<table border = '1'  + 'bgcolor=' + color + >");
		out.print("<table border=1; bgcolor=" + color +">"); // 경계선을 1px, 받아온 color로 배경색 지정하는 테이블을 만든다.
		for (int i = num1; i <= num2; i++) { // i는 num1부터 num2까지 반복
			out.print("<tr>"); // for문이 돌아가면서 i 횟수 만큼 행이 생성된다.
			for (int j = 1; j < 10; j++) { // j는 1부터 10까지 
				out.print("<td>" + i + "*" + j + "=" + i * j + "</td>"); // 각 행의 열들을 i*j 식으로 채운다.
			}
			out.print("</tr>"); // 각 단의 출력이 끝났으면 개행을 해준다.
		}

		out.print("</table>");
		out.print("</body>");
		out.print("</html>");

	}

}
