

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
		
		out.print("���̵� : " + id + "<br>");
		out.print("��й�ȣ : " + pw + "<br>");
		
		if(pwcheck.equals(pw)) {
			out.print("��й�ȣ�� ��ġ�մϴ�" + "<br>");
		}else{
			out.print("��й�ȣ�� ��ġ���� �ʽ��ϴ�" + "<br>");
		}
		
		out.print("���� : " + gender + "<br>");
		out.print("������ : " + bloodtype + "<br>");
		out.print("���� : " + birthday + "<br>");
		out.print("��� : ");
		
		for (String h : hobby) {
			out.print(h + " " + "<br>");
		}
		
		out.print("�����ϴ� ��: " + color + "<br>");
		out.print("����� ���� �� : " + textarea + "<br>");
		
		
		out.print("</body>");
		out.print("</html>");
		
	}

}
