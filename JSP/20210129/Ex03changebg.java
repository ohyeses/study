

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex03changebg")
public class Ex03changebg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String color = request.getParameter("color"); // getParameter 안에 color를 String 으로 받아준다.
		System.out.println(color);
		
		response.setContentType("text/html; charset=euc-kr");
		
		PrintWriter out = response.getWriter(); //PrintWriter 객체 생성
		
		out.print("<html>");
		out.print("<body bgcolor=" + color + ">"); //바디태그에 배경색 지정. 변수랑 같이 작성 => ""
		
		
		
		out.print("</body>");
		out.print("</html>");
		


}
	}
