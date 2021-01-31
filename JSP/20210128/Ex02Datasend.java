

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02Datasend")
public class Ex02Datasend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//사용자가 요청한 값을 받아준다. -> request 객체 사용
		String data = request.getParameter("data"); // form 태그에 작성해준 name 값을 변수에 대입한다.
		
		// System.out.println(data);
		
		// html 형식으로 응답을 해주고, euc-kr로 인코딩을 해준다.
		response.setContentType("text/html; charset=euc-kr");
		
		
		// PrintWriter 객체 생성 -> 응답할 때 필요한 객체이다.
		// response.getWriter() 메소드를 호출하면 PrintWriter 객체를 쓸 수 있다.
		PrintWriter out = response.getWriter(); //import java.io.PrintWriter;  필요
		
		
		// out 객체를 이용해서 화면을 출력한다.
		// html 구조 만들기
		out.print("<html>");
		out.print("<body>");
		
		//body 태그 사이에서 어떤 값을 출력할건지 정해준다.
		//strong 태그 -> 문자열로 작성하기
		out.print("입력한 데이터는 <strong>" +data+ "</strong>입니다."); //data 값을 출력 한다.
		
		out.print("</body>");
		out.print("</html>");
	}

}
