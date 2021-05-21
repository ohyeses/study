package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.front.Command;
import com.model.MemberDAO;
import com.model.MemberDTO;

public class JoinServiceCon implements Command {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String ft = request.getParameter("ft");

		MemberDTO dto = new MemberDTO(id, pw, name, age,ft);
		MemberDAO dao = new MemberDAO();

		int cnt = dao.join(dto);

		if (cnt > 0) {
			System.out.println("회원가입 성공 !");

			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			response.sendRedirect("index.jsp");
		} else {
			System.out.println("회원가입 실패...");

		}

	}

}
