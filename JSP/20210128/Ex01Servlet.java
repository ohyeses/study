

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex01Servlet
 */
@WebServlet("/Hello") //@�� ������̼� : ����� �ִ� �ּ�(url mapping�� �ϴ� ���)
public class Ex01Servlet extends HttpServlet { // HttpServlet�� ��ӹ޴´�.
	
	// * ����ȭ(Serialization) �̶�? ��ü�� ������ �� �����͵��� byte ������ ������ ���� �����°�.
	// ����ȭ(Serialization) ��Ų ������ �ٽ� ������ȭ �����ش�.
	// => ����ȭ �ϰ� ����Ʈ ������ ������ �ٽ� ������ȭ �ϴµ� ����ϴ� ���� serialVersionUID.
	private static final long serialVersionUID = 1L; 

													
    public Ex01Servlet() { // ������. ��ȯŸ�� X, �޼��� �̸��� Ŭ���� �̸��� ����.
    	super();
    }

    
    // �ʱ�ȭ �ϴ� ����. ��ü�� ������ ���� �� ó���� �� �� �� ȣ��
	public void init(ServletConfig config) throws ServletException { 
	}


	// ���ø����̼� ������ ���� �� �ѹ� ���� �ڿ��� ��� �ʱ�ȭ ��Ų��.
	public void destroy() {
	}


	// �Ű����� 2�� request�� response ��ü
	// ����ڰ� �Է��� �� �޾Ƽ� ó���Ҷ��� request ���
	// �����Ҷ��� response ���
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// ����ڿ��� ��û�� ���� �ʰ� ������������ �ۼ��Ѵ�.
		// html �������� ������ ���ְ�, euc-kr�� ���ڵ��� ���ش�.
		response.setContentType("text/html; charset=euc-kr");
		
		// PrintWriter -> ������ �� �ʿ��� ��ü
		// response.getWriter() �޼ҵ带 ȣ���ϸ� PrintWriter ��ü�� �� �� �ִ�.
		PrintWriter out = response.getWriter();
		
		
		// out�� ���� ������ �������� ����� �ش�.
		// ������ ������ html ������ �����ϰ� �Ѵ�.
		out.print("<html>");
		out.print("<body>"); // body �±� -> ����ڿ��� �������� �κ�. ���� �ȿ��� �ۼ��� �Ѵ�.
		
		out.print("Hello World!!");
		
		out.print("</body>"); // </> �� �±׵� �־���� �Ѵ�.
		out.print("</html>");
	}


	//get ������� ������ �� ȣ���ϴ� �޼ҵ�
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	//post ������� ������ �� ȣ���ϴ� �޼ҵ�
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
