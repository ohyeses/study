package com.Front;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.controller.DelAllServiceCon;
import com.controller.DelOneServiceCon;
import com.controller.JoinServiceCon;
import com.controller.LoginServiceCon;
import com.controller.Logout;
import com.controller.MessageServiceCon;
import com.controller.UpdateServiceCon;
import com.controller.WriterBoard;
import com.model.BoardDAO;
import com.model.BoardDTO;
import com.model.MemberDAO;
import com.model.MemberDTO;
import com.model.MessageDAO;
import com.model.MessageDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("*.do") // 뒤에 이걸 붙이면 여기로 온다.
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			Command command = null;
		
			String reqURI = request.getRequestURI();
			
			String path = request.getContextPath();
			String resultURI = reqURI.substring(path.length()+1);
			
			System.out.println(reqURI);
			System.out.println(path);
			System.out.println(resultURI);
			
			if(resultURI.equals("DelAllSerciveCon.do")) {
				command = new DelAllServiceCon();
				
				//command = new DelAllServiceCon();
				
			}else if(resultURI.equals("DelOneServiceCon.do")) {

				command = new DelOneServiceCon();
				
				//command = new DelOneServiceCon();
				
			}else if(resultURI.equals("JoinServiceCon.do")) {
			     
				command = new JoinServiceCon();
				
				//command = new JoinServiceCon();
				
			}else if(resultURI.equals("LoginServiceCon.do")) {
				
				command = new LoginServiceCon();
				//command = new LogineServiceCon();
				
			}else if(resultURI.equals("Logout.do")) {
				
				command = new Logout();
				
				//command = new Logout();
				
			}else if(resultURI.equals("MessageServiceCon.do")) {
				
				command = new MessageServiceCon();
				
				//command = new MessageServiceCon();

				
			}else if(resultURI.equals("UpdateServiceCon.do")) {
			
				command = new UpdateServiceCon();
				
				//command = new UpdateServiceCon();

				
			}else if(resultURI.equals("WriterBoard.do")) {
				
				command = new WriterBoard();
				//command = new WriterBoard();

			}
			
			command.execute(request, response);
	}

}
