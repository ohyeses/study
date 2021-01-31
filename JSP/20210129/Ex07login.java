

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex07login")
public class Ex07login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id"); // id 값을 받아와서 String 변수에 넣어준다.
		
		response.setContentType("text/html; charset=euc-kr"); // html 형식으로, 인코딩은 euc-kr로 한다.
		
		PrintWriter out = response.getWriter();// PrintWriter 객체 생성
		
		// html 구조 생성
		out.print("<html>"); 
		out.print("<body>");
		
		out.print(id + " 님 환영합니다.");
		
		
		out.print("</body>");
		out.print("</html>");
	}

}
