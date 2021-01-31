

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
		//1. ���� ������ ���� ����(���ڵ����)
		response.setContentType("text/html; charset=euc-kr");
		
		//2.PrintWriter ��ü. ȭ�鿡 ����� �� �� �ְԲ� �ϴ� ��ü
		PrintWriter out = response.getWriter();
		
		//3. html ���� ���� ȭ�鿡 ��� �����Ҳ��� ���� ���
		out.print("<html>");
		out.print("<body>");
		out.print("<table border ='1' >"); //���̺� �±� �ۼ� //"-> ���ڿ��� ���� ������ '�� ���´�.
		
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
