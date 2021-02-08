/*select-option ��ư, üũ�ڽ�, ������ư, ��¥�ʵ�, textarea*/

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex01form")
public class Ex01form extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public Ex01form() {
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String job = request.getParameter("job"); // request-> ����ڰ� �Է��� ���� �޴� ��ü
		String gender = request.getParameter("gender");
		//getParameter : name�� �ش��ϴ� �ϳ��� �Ķ���Ͱ� ����
		//getParameterValues : name�� �ش��ϴ� ��� �Ķ���Ͱ� ���� (���ϰ�: String[])
		String hobby[] = request.getParameterValues("hobby");// ��̴� ������ ���� �� �� �ִ�. -> �迭�� �����Ѵ�.
		String birth = request.getParameter("birth");
		String text = request.getParameter("text");
		
		response.setContentType("text/html; charset=euc-kr"); //� ������ �������� ���������� �˷��ִ� �κ�
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>"); // html ���� �����
		out.print("<body>");
		
		out.print("���� : " + job + "<br>");
		out.print("���� : " + gender + "<br>");
		out.print("��� : " );
		out.println(" ");
		// �ݺ��� �̿��Ͽ� �迭 �� �� ���
		// for-each��
		// for(�ӽ��� ��������(�迭���� ������� ������� ��) :�迭�̸� )
		for (String h : hobby) { /* hobby��� ���� String Ÿ���� h�� �־��ش�. */
			out.print(h + " ");
		}
		out.print("���� : " + birth + "<br>");
		out.print("����� �� : " + text + "<br>");
		
		
		out.print("</body>");
		out.print("</html>");
		
	}

}
