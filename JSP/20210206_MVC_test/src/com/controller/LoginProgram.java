package com.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Model1DAO;
import com.model.Model1DTO;

@WebServlet("/LoginProgram")
public class LoginProgram extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		Model1DAO dao = new Model1DAO();
		Model1DTO dto = new Model1DTO(id, pw);
		String name = dao.login(dto);
		
		if(name != null){
			System.out.print("�α��μ���!");
			/*
			 * response.sendRedirect("loginSuccess.jsp?name="+URLEncoder.encode(name,
			 * "EUC-KR"));
			 */
			
			// �α��� �������� ���� ��Ű ������ֱ�
//			Cookie cookie = new Cookie("name",URLEncoder.encode(name, "EUC-KR"));
//			response.addCookie(cookie);
			
			//�������� ������ֱ�
			HttpSession session = request.getSession();
			session.setAttribute("name", name); //Ű��-name(����X), value�� - name(����O)
			
			
			
			response.sendRedirect("loginSuccess.jsp");
		}else {
			System.out.print("�α��ν���!");
			response.sendRedirect("loginFail.jsp");
		}

	}

}
