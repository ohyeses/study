package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Front.Command;
import com.model.MemberDTO;
import com.model.MessageDAO;

public class DelAllServiceCon implements Command {

		public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession();
			MemberDTO dto = (MemberDTO)session.getAttribute("ReturnDto");
			
			MessageDAO dao = new MessageDAO();
			int cnt = dao.delete(dto.getEmail());
			
			if (cnt>0){
				System.out.println("삭제 성공!");
			} else {
				System.out.println("삭제 실패!");
			}
			
			response.sendRedirect("main.jsp");
		}

}
