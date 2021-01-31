

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex04ope")
public class Ex04ope extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ����ڰ� �Է��� �� �޾ƿͼ� ������ �����Ѵ�.
		// String -> Integer ����ȯ (Integer class - parseInt �޼ҵ� ���)
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String giho = request.getParameter("giho");
		int result = 0;
		
//		switch(ope) {
//		case  "+" : 
//			result = num1+num2; break;
//		case  "-" : 
//			result = num1-num2; break;
//		case  "*" : 
//			result = num1*num2; break;
//		case  "/" : 
//			result = num1/num2; break;
//		}
//		
		
		//������
		if (giho.equals("+")) {
			result = num1+num2;
		}
		else if (giho.equals("-")){
			result = num1-num2;
		}
		else if (giho.equals("*")) {
			result = num1*num2;
		}
		else if (giho.equals("/")){
			result = num1/num2;
		}
		
		// ���������� ���ڵ� ����� euc-kr �� �ϰڴٰ� �˷��ش�.
		response.setContentType("text/html; charset=euc-kr");
		
		// ������ ���� ���� PrintWriter ��ü�� ����Ѵ�.
		// response ��ü�� getWriter()�� ����ϸ� PriterWriter�� ���� �� �ִ�.
		PrintWriter out = response.getWriter();
		
		
		// html�� body �±׸� ����� �ش�.
		out.print("<html>");
		out.print("<body>");
		
		// ����� ���
		out.print(num1 + giho + num2 + "=" + result);

		out.print("</body>");
		out.print("</html>");
	
	}

}
