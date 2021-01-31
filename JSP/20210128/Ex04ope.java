

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
		
		// 사용자가 입력한 값 받아와서 변수에 대입한다.
		// String -> Integer 형변환 (Integer class - parseInt 메소드 사용)
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
		
		//연산결과
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
		
		// 브라우저에게 인코딩 방식을 euc-kr 로 하겠다고 알려준다.
		response.setContentType("text/html; charset=euc-kr");
		
		// 응답을 해줄 때는 PrintWriter 객체를 사용한다.
		// response 객체의 getWriter()를 사용하면 PriterWriter를 얻을 수 있다.
		PrintWriter out = response.getWriter();
		
		
		// html과 body 태그를 만들어 준다.
		out.print("<html>");
		out.print("<body>");
		
		// 결과값 출력
		out.print(num1 + giho + num2 + "=" + result);

		out.print("</body>");
		out.print("</html>");
	
	}

}
