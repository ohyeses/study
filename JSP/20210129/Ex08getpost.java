

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex08getpost")
public class Ex08getpost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Get 방식
	/*
	 * - URL로 데이터 전송 
	 * - 전송하는 데이터의 길이에 한계(1024byte) 
	 * - 데이터가 URL 자체에 노출이 되기 때문에 보안상 문제가있음 
	 * - 이런 방식을 Query String 방식이라고 한다. 
	 * - 검색어는 url 노출되도 상관 없음
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("get!!!");
		String name = request.getParameter("name");
		System.out.println(name);
				
	}
	
	// Post 방식
	/*
	 * - 패킷(Packet)을 담아서 전송하는 방식 
	 * - 전송하는 데이터 길이에 제한이 없다 
	 * - 노출이 안되니 get 방식 보다는 보안에 강하다.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("post!!!");
		request.setCharacterEncoding("euc-kr");
		String name = request.getParameter("name");
		System.out.println(name);
	}

}
