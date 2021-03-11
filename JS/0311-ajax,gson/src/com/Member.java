package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/Member")
public class Member extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8"); // �ѱ� ���� ����
		
		//�� ����� ���� ������ json���� ��� �����ش� 
		PrintWriter out = response.getWriter();// PrintWriter() ->�����͸� ���� �� �������� ���� �� �� �ִ� ��ü
		
		
		MemberDTO dto1 = new MemberDTO("pbk", 1234, "ȣ�ξƺ�"); //MemberDTO�� ������ش�
		MemberDTO dto2 = new MemberDTO("cty", 1234, "�����¾�"); 
		MemberDTO dto3 = new MemberDTO("lks", 1234, "�̱⼺�ְ�"); 
		MemberDTO dto4 = new MemberDTO("jh", 1234, "����������"); 
		MemberDTO dto5 = new MemberDTO("kdw", 1234, "������ġ"); 
		
		
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>(); // ��̸���Ʈ�� ��Ƶд�
		list.add(dto1); // dto1���� ����Ʈ�� �߰����ش�
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		
		Gson gson = new Gson();//GSON �� ����ϱ� ���� GSON ��ü�� �����
		String result = gson.toJson(list); //dto�� ������ json ���·� ��ȯ���ش�. ��ȯ���� String.
		
		
		System.out.println(result);
		out.print(result); // json���� ��ȯ�� result�� �����ش�
		
		// gson array -> json ��ü�� ������ ������ ���� ��
		
		
		// �ڹٿ��� �ֵ���ǥ�� ���ڿ��� �ν��ϱ� ���� Ư����ȣ�� ����
		// \ -> ���� �ֵ���ǥ�� �ν��ϱ� ���ؼ� ���
		// �� \ ->  ���� ��ȯ���ִ� json ���̺귯���� ����, dto�� ������ json���� �ٲ��ش�.
		
		
		
	
	}

}
