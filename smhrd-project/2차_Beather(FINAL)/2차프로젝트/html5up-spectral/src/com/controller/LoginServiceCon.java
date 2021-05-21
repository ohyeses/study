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

public class LoginServiceCon implements Command {
	

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO(id, pw);
		MemberDTO ReturnDTO = dao.login(dto);

		if (ReturnDTO != null) {
			System.out.println("로그인 성공!");

			HttpSession session = request.getSession();
			session.setAttribute("ReturnDTO", ReturnDTO);

		} else {
			System.out.println("로그인 실패...");
		}

		response.sendRedirect("index.jsp");

	}

}
