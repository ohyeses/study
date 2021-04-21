package kr.mem.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mem.model.MemberDAO;
import kr.mem.model.MemberVO;

public class MemberUpdateController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cpath = request.getContextPath(); //mvc
		
		//1. 파라미터수집(VO)
		int num=Integer.parseInt(request.getParameter("num"));
		int age=Integer.parseInt(request.getParameter("age"));
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		
		MemberVO vo = new MemberVO();
		vo.setNum(num);
		vo.setAge(age);
		vo.setPhone(phone);
		vo.setEmail(email);
		// POJO->Service
		MemberDAO dao = new MemberDAO();
		int cnt = dao.memberUpdate(vo);
		String view = null;
		if(cnt>0) {
			//성공->다음페이지->리스트페이지(/mvc/memberList.do)
			view="redirect:"+cpath+"/memberList.do";
		}
		
		return view;
	}

}
