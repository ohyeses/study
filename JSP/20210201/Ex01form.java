/*select-option 버튼, 체크박스, 라디오버튼, 날짜필드, textarea*/

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
		
		String job = request.getParameter("job"); // request-> 사용자가 입력한 값을 받는 객체
		String gender = request.getParameter("gender");
		//getParameter : name에 해당하는 하나의 파라미터값 구함
		//getParameterValues : name에 해당하는 모든 파라미터값 구함 (리턴값: String[])
		String hobby[] = request.getParameterValues("hobby");// 취미는 여러개 선택 할 수 있다. -> 배열로 생성한다.
		String birth = request.getParameter("birth");
		String text = request.getParameter("text");
		
		response.setContentType("text/html; charset=euc-kr"); //어떤 식으로 응답할지 브라우저에게 알려주는 부분
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>"); // html 구조 만들기
		out.print("<body>");
		
		out.print("직업 : " + job + "<br>");
		out.print("성별 : " + gender + "<br>");
		out.print("취미 : " );
		out.println(" ");
		// 반복문 이용하여 배열 값 다 출력
		// for-each문
		// for(임시적 변수선언(배열에서 순서대로 가지고온 값) :배열이름 )
		for (String h : hobby) { /* hobby라는 값을 String 타입의 h에 넣어준다. */
			out.print(h + " ");
		}
		out.print("생일 : " + birth + "<br>");
		out.print("남기는 말 : " + text + "<br>");
		
		
		out.print("</body>");
		out.print("</html>");
		
	}

}
