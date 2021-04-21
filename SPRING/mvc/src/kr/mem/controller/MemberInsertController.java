package kr.mem.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mem.model.MemberDAO;
import kr.mem.model.MemberVO;

public class MemberInsertController implements Controller{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cpath = request.getContextPath(); //mvc
		
		// 1. 파라미터 수집(VO)
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setPass(pass);
		vo.setName(name);
		vo.setAge(age);
		vo.setPhone(phone);
		vo.setEmail(email);
		
		// 2. Model과 연동
		MemberDAO dao = new MemberDAO();
		int cnt = dao.memberInsert(vo);
		String view=null;
		if(cnt>0) {
			//성공->다음->리스트페이지()
			view="redirect:"+cpath+"/memberList.do";
		}
		
		
		return view;
	}

}
