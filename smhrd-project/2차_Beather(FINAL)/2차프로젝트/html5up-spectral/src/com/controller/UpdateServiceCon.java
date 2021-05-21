package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.front.Command;
import com.model.MemberDAO;
import com.model.MemberDTO;

public class UpdateServiceCon implements Command {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		HttpSession session = request.getSession();
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = (MemberDTO)session.getAttribute("ReturnDTO");
		
		String id = dto.getId();
		String password = dto.getPassword();
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String ft = request.getParameter("ft");
		MemberDTO ReturnDTO = new MemberDTO(id,password,name,age,ft);
		System.out.println(ft);
		
		int cnt = dao.update(ReturnDTO);
		
		if (cnt > 0) {
			System.out.println("업데이트 성공");
			
			session.setAttribute("ReturnDTO", ReturnDTO);
	
		}else {
			System.out.println("업데이트 실패!");
			
		}
		response.sendRedirect("index.jsp");
	}

}
