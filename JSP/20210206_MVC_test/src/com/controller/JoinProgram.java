package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Model1DAO;
import com.model.Model1DTO;

@WebServlet("/JoinProgram")
public class JoinProgram extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");

		//model1 dao 객체 생성을 해서 join() 값을 cnt로 채워준다.
		Model1DAO dao = new Model1DAO();
		Model1DTO dto = new Model1DTO(id, pw, name); //dto 객체를 통해서 id,pw,name을 넣어준다.
		int cnt = dao.join(dto);
		
		if(cnt > 0){
			System.out.print("업데이트 성공!");
			response.sendRedirect("main.jsp");
		}else{
			System.out.print("업데이트 실패!");
			response.sendRedirect("join.jsp");
		}

	}
}
