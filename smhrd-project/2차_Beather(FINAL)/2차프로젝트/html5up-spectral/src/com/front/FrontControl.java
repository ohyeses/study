package com.front;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.JoinServiceCon;
import com.controller.LoginServiceCon;
import com.controller.UpdateServiceCon;
import com.controller.WriterBoard;

@WebServlet("*.do")
public class FrontControl extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String reqURI = request.getRequestURI();
		String path = request.getContextPath();
		String resultURI = reqURI.substring(path.length() + 1);
		
		Command command = null;
		if(resultURI.equals("LoginServiceCon.do")) {
			command = new LoginServiceCon();
		}else if (resultURI.equals("JoinServiceCon.do")) {
			command = new JoinServiceCon();
		}else if (resultURI.equals("WriterBoard.do")) {
			command = new WriterBoard();
		}else if (resultURI.equals("UpdateServiceCon.do")) {
			command = new UpdateServiceCon();
		}
		command.execute(request, response);
	}

}
