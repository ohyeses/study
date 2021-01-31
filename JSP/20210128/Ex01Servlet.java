

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
@WebServlet("/Hello") //@는 어노테이션 : 기능이 있는 주석(url mapping을 하는 기능)
public class Ex01Servlet extends HttpServlet { // HttpServlet을 상속받는다.
	
	// * 직렬화(Serialization) 이란? 객체를 전송할 때 데이터들을 byte 단위로 나눠서 값을 보내는것.
	// 직렬화(Serialization) 시킨 다음에 다시 역직렬화 시켜준다.
	// => 직렬화 하고 바이트 단위로 보내서 다시 역직렬화 하는데 사용하는 것이 serialVersionUID.
	private static final long serialVersionUID = 1L; 

													
    public Ex01Servlet() { // 생성자. 반환타입 X, 메서드 이름이 클래스 이름과 동일.
    	super();
    }

    
    // 초기화 하는 역할. 객체가 생성이 됐을 때 처음에 딱 한 번 호출
	public void init(ServletConfig config) throws ServletException { 
	}


	// 애플리케이션 실행을 멈출 때 한번 실행 자원을 모두 초기화 시킨다.
	public void destroy() {
	}


	// 매개변수 2개 request와 response 객체
	// 사용자가 입력한 값 받아서 처리할때는 request 사용
	// 응답할때는 response 사용
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// 사용자에게 요청을 받지 않고 응답페이지만 작성한다.
		// html 형식으로 응답을 해주고, euc-kr로 인코딩을 해준다.
		response.setContentType("text/html; charset=euc-kr");
		
		// PrintWriter -> 응답할 때 필요한 객체
		// response.getWriter() 메소드를 호출하면 PrintWriter 객체를 쓸 수 있다.
		PrintWriter out = response.getWriter();
		
		
		// out을 통해 응답할 페이지를 만들어 준다.
		// 응답을 무조건 html 문서로 응답하게 한다.
		out.print("<html>");
		out.print("<body>"); // body 태그 -> 사용자에게 보여지는 부분. 여기 안에다 작성을 한다.
		
		out.print("Hello World!!");
		
		out.print("</body>"); // </> 끝 태그도 넣어줘야 한다.
		out.print("</html>");
	}


	//get 방식으로 보냈을 때 호출하는 메소드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	//post 방식으로 보냈을 때 호출하는 메소드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
