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
		System.out.println("�񵿱� ��� ����"); //��� �޽���
		
		
		String id = request.getParameter("id");// request ��ü -> Ŭ���̾�Ʈ�� ��û�� �����Ͱ� �ִ� ��ü
		System.out.println("���������� : " + id);
		
		//������ ���̵� �����Ѵ� (�� : pbk)
		//���� ���̵� ������ ���̵�� ��ġ�ϸ� true�� ��ȯ
		//���� ���̵� ������ ���̵�� ��ġ���� ������ false�� ��ȯ
		
		
		PrintWriter out = response.getWriter();// ����� �� ���� �� �� �ִ� ��ü PrintWriter() -> �긦 ���� ����
		
		if(id.equals("pbk")) {
			out.print("true");
		}else {
			out.print("false");
		}
		
		

		
		

	}

}
