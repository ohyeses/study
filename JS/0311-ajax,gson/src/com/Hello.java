package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("비동기 통신 들어옴"); //출력 메시지
		
		
		String id = request.getParameter("id");// request 객체 -> 클라이언트가 요청한 데이터가 있는 객체
		System.out.println("보낸데이터 : " + id);
		
		//임의의 아이디를 설정한다 (예 : pbk)
		//보낸 아이디가 임의의 아이디와 일치하면 true를 반환
		//보낸 아이디가 임의의 아이디와 일치하지 않으면 false를 반환
		
		
		PrintWriter out = response.getWriter();// 출력할 때 글을 쓸 수 있는 객체 PrintWriter() -> 얘를 통해 응답
		
		if(id.equals("pbk")) {
			out.print("true");
		}else {
			out.print("false");
		}
		
		

		
		

	}

}
