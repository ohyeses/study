

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex01table")
public class Ex01table extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public Ex01table() {
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 응답 컨텐츠 형식 지정(인코딩방식)
		response.setContentType("text/html; charset=euc-kr");
		
		//2.PrintWriter 객체. 화면에 출력을 할 수 있게끔 하는 객체
		PrintWriter out = response.getWriter();
		
		//3. html 문서 생성 화면에 어떻게 생성할껀지 구조 출력
		out.print("<html>");
		out.print("<body>");
		out.print("<table border ='1' >"); //테이블 태그 작성 //"-> 문자열로 들어가기 때문에 '로 적는다.
		
		out.print("<tr>");
		out.print("<td>1</td>");
		out.print("<td>2</td>");
		out.print("<td>3</td>");
		out.print("<td>4</td>");
		out.print("<td>5</td>");
		out.print("<td>6</td>");
		out.print("</tr>");
		
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

}
