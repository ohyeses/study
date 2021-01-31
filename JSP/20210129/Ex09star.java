
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

		response.setContentType("text/html; charset=euc-kr"); // 형식은 html 형식, 인코딩은 euc-kr 로 한다.
		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성

		int N = Integer.parseInt(request.getParameter("num")); // num을 int 형으로 형변환 시킨우 변수에 담는다.
		String color = request.getParameter("color"); // color를 String 형태로 담는다.

		out.print("<html>"); // html 구조 생성
		out.print("<body>");
		out.write("<table border=1 ; bordercolor=red ;" + ">"); // 경계선 1px, 경계선 색깔 빨간색인 테이블 생성, tr과 td 에는 경계선 색깔 따로 줄 수
																// 없다.
//		out.print("<table border=1; bgcolor=" + color +">");
		for (int i = 1; i <= N; i++) {
			out.print("<tr>");
			for (int j = 0; j < i; j++) {
				if (i % 2 == 1) { // i가 홀수라면

					out.print("<td bgcolor=" + color + ">" + "*" + "</td>"); // 배경색은 color 값으로 , * 출력

				} else {

					out.print("<td>" + "*" + "</td>"); // 짝수라면 배경색 없는 * 출력
				}
			}
			out.print("</tr>"); //j값이 증가되면 </tr>을 닫아준다.
		}

		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

}
