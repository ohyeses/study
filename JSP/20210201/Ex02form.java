

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02form")
public class Ex02form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pwcheck = request.getParameter("pwcheck");
		String gender = request.getParameter("gender");
		String bloodtype = request.getParameter("bloodtype");
		String birthday = request.getParameter("birthday");
		String[] hobby = request.getParameterValues("hobby");
		String color = request.getParameter("color");
		String textarea = request.getParameter("textarea");
		
		response.setContentType("text/html; charset=euc-kr");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		
		out.print("아이디 : " + id + "<br>");
		out.print("비밀번호 : " + pw + "<br>");
		
		if(pwcheck.equals(pw)) {
			out.print("비밀번호가 일치합니다" + "<br>");
		}else{
			out.print("비밀번호가 일치하지 않습니다" + "<br>");
		}
		
		out.print("성별 : " + gender + "<br>");
		out.print("혈액형 : " + bloodtype + "<br>");
		out.print("생일 : " + birthday + "<br>");
		out.print("취미 : ");
		
		for (String h : hobby) {
			out.print(h + " " + "<br>");
		}
		
		out.print("좋아하는 색: " + color + "<br>");
		out.print("남기고 싶은 말 : " + textarea + "<br>");
		
		
		out.print("</body>");
		out.print("</html>");
		
	}

}
