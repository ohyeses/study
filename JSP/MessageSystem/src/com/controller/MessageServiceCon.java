package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Front.Command;
import com.model.MessageDAO;
import com.model.MessageDTO;

public class MessageServiceCon implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("EUC-KR");
		
		String send = request.getParameter("send");
		String receive = request.getParameter("receive");
		String message = request.getParameter("message");
		
		System.out.println(send);
		System.out.println(receive);
		System.out.println(message);
		
		MessageDAO dao = new MessageDAO();
		MessageDTO dto = new MessageDTO(send, receive,message);
		int cnt = dao.insert(dto);
		
		if(cnt>0) {
			System.out.println("메시지 전송 성공!");
		} else {
			System.out.println("메시지 전송 실패!");
		}
		
		response.sendRedirect("main.jsp");
	}

}
