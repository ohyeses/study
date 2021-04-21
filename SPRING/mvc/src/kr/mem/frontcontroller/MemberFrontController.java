package kr.mem.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mem.controller.Controller;

@WebServlet("*.do")
public class MemberFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. 클라이언트의 모든 요청을 받는 작업(*.do)
		// command="/memberList.do"
		String reqUrl = request.getRequestURI(); // /mvc/memberList.do 요청경로를 가지고 옴
		String ctx = request.getContextPath(); // /mvc
		String command = reqUrl.substring(ctx.length());
		System.out.println(command);

		// command에 따라서 분기작업 --> 알바생을 연결(POJO)
		// 2. HandlerMapping
		// /memberList.do-->MemberListController
		// /memberInsert.do-->MemberInsertController
		// /memberDelete.do-->MemberDeleteController

		HandlerMapping mappings = new HandlerMapping();
		Controller controller = mappings.getController(command);
		String nextPage = controller.execute(request, response);
		// 3.view로 분기작업
		if(nextPage!=null) {
			if(nextPage.indexOf("redirect:")!=-1) {
				response.sendRedirect(nextPage.split(":")[1]); // redirect:/mvc/memberList.do
			}else {
				RequestDispatcher rd = request.getRequestDispatcher(ViewResolver.makeView(nextPage));
				rd.forward(request, response);
			}
		}
	}

}
