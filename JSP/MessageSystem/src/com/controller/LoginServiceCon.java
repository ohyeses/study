package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Front.Command;
import com.model.MemberDAO;
import com.model.MemberDTO;

public class LoginServiceCon implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		System.out.println(email);
		System.out.println(pw);
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO(email, pw);
		MemberDTO ReturnDto = dao.login(dto);
		
		
		if(ReturnDto != null) {
			System.out.println(ReturnDto);
			System.out.println("로그인 성공!");
			
			HttpSession session = request.getSession();
			session.setAttribute("ReturnDto", ReturnDto);
		}else {
			System.out.println("로그인 실패!");
			System.out.println(ReturnDto);
		}
		
		response.sendRedirect("main.jsp");
	}

}
