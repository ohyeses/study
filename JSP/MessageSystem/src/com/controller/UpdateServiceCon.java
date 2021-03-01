package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Front.Command;
import com.model.MemberDAO;
import com.model.MemberDTO;

public class UpdateServiceCon implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO)session.getAttribute("ReturnDto");
		
		request.setCharacterEncoding("EUC-KR");
		String email = dto.getEmail();
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");

		MemberDAO dao = new MemberDAO();
		MemberDTO updateDto = new MemberDTO(email, pw, tel, addr);
		int cnt = dao.update(updateDto);

		
		if (cnt > 0){
			System.out.println("정보수정 성공!");
			session.setAttribute("ReturnDto", updateDto);
		}else {
			System.out.println("정보수정 실패!");
		}
		response.sendRedirect("main.jsp");
		
	}

}
