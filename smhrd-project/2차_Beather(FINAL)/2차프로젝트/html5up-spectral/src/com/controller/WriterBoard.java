package com.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.front.Command;
import com.model.BoardDAO;
import com.model.BoardDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class WriterBoard implements Command {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		/*
		String saveDri = request.getServletContext().getRealPath("img");
		int maxSize = 5 * 1024 * 1024;
		String encoding = "utf-8";

		MultipartRequest multi = new MultipartRequest(request, saveDri, maxSize, encoding,
				new DefaultFileRenamePolicy());
		String filename = URLEncoder.encode(multi.getFilesystemName("fileName"), "EUC-KR");
		*/
		
		request.setCharacterEncoding("utf-8");
		
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		System.out.println(writer);
		System.out.println(title);
		System.out.println(content);
		
		BoardDTO dto = new BoardDTO(writer, title,  content);
		BoardDAO dao = new BoardDAO();
		
		int cnt = dao.add(dto);
		
		if (cnt > 0) {
			response.sendRedirect("board.jsp");
			System.out.print("행 추가 성공!");
		}else {
			response.sendRedirect("writerBoard.jsp");
			System.out.print("행 추가 실피!");
			
		}
	
	}


}
