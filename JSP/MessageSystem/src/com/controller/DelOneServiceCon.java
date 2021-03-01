package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Front.Command;
import com.model.MessageDAO;

public class DelOneServiceCon implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String num = request.getParameter("num");
		System.out.println(num);
		
		MessageDAO dao = new MessageDAO();
		int cnt = dao.deleteOne(num);
		
		
		if (cnt>0){
			System.out.println("삭제 성공!");
		} else {
			System.out.println("삭제 실패!");
		}
		
		response.sendRedirect("main.jsp#two");
		
	}

}
