package com.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Front.Command;
import com.model.BoardDAO;
import com.model.BoardDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class WriterBoard implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String SaveDri = request.getServletContext().getRealPath("img");
		
		System.out.println(SaveDri);
		int MaxSize = 5 * 1024* 1024;
		
		System.out.println(SaveDri);
		
		MultipartRequest multi  = new MultipartRequest(request, SaveDri, MaxSize, "EUC-KR", new DefaultFileRenamePolicy());
				
		String title = multi.getParameter("title");
		String writer = multi.getParameter("writer");
		String fileName = URLEncoder.encode(multi.getFilesystemName("fileName"),"EUC-KR");
		String content = multi.getParameter("content");
		
		
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = new BoardDTO(title, writer, fileName, content);
		int cnt = dao.insert(dto);
		
		
		if(cnt>0) {
			System.out.println("업로드 성공!");
		}else {
			System.out.println("업로드 실패!");
		}
		
		response.sendRedirect("boardMain.jsp");
		
	}

}
