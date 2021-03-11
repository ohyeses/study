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

		response.setCharacterEncoding("UTF-8"); // 한글 깨짐 방지
		
		//한 사람에 대한 정보를 json으로 묶어서 보내준다 
		PrintWriter out = response.getWriter();// PrintWriter() ->데이터를 보낼 때 서블릿에서 글을 쓸 수 있는 객체
		
		
		MemberDTO dto1 = new MemberDTO("pbk", 1234, "호두아빠"); //MemberDTO를 만들어준다
		MemberDTO dto2 = new MemberDTO("cty", 1234, "지존태양"); 
		MemberDTO dto3 = new MemberDTO("lks", 1234, "이기성최고"); 
		MemberDTO dto4 = new MemberDTO("jh", 1234, "정형데이터"); 
		MemberDTO dto5 = new MemberDTO("kdw", 1234, "동원참치"); 
		
		
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>(); // 어레이리스트에 담아둔다
		list.add(dto1); // dto1부터 리스트에 추가해준다
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		
		Gson gson = new Gson();//GSON 을 사용하기 위해 GSON 객체를 만든다
		String result = gson.toJson(list); //dto를 담으면 json 형태로 변환해준다. 반환값은 String.
		
		
		System.out.println(result);
		out.print(result); // json으로 변환된 result를 돌려준다
		
		// gson array -> json 객체를 여러개 보내고 싶을 때
		
		
		// 자바에서 쌍따옴표는 문자열을 인식하기 위한 특수기호를 쓴다
		// \ -> 순수 쌍따옴표를 인식하기 위해서 사용
		// ㄴ \ ->  쉽게 변환해주는 json 라이브러리를 쓴다, dto를 넣으면 json으로 바꿔준다.
		
		
		
	
	}

}
