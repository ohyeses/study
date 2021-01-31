

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex03plus")
public class Ex03plus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		// request 객체 -> 사용자가 보내준 값을 받기 위해 사용
		// 연산을 하기 때문에 문자열이 아니라 정수형으로 받아준다.
		// 오류 뜨는 것 -> String으로 반환되는걸 int로 받으려니까.
		// Integer.parseInt 를 써서 String 타입의 문자열을 Integer로 바꿔준다.
		int num1 = Integer.parseInt(request.getParameter("num1")); // getParameter() 안에 name 값 지정
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		
		
		// html 문서를 작성하겠다, 인코딩 방식 지정
		response.setContentType("text/html; charset=euc-kr");
		
		
		//PrintWriter 객체 생성
		PrintWriter out = response.getWriter();
		
		
		//out을 사용한 html 문서 출력
		//html 구조 만들기
		out.print("<html>");
		out.print("<body>");
		
		out.print(num1 + "+" + num2 + "=" + (num1+num2) + "<br>"); // 줄바꿈 하려면 <br> 태그 사용
		
		out.print("</body>");
		out.print("</html>");
		
	}

}
