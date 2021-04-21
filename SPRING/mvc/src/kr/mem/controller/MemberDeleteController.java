package kr.mem.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mem.model.MemberDAO;

public class MemberDeleteController implements Controller{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cpath = request.getContextPath(); //mvc
		
		int num=Integer.parseInt(request.getParameter("num"));//파라미터 수집
		MemberDAO dao = new MemberDAO();
		System.out.println("-0---------------");
		int cnt = dao.memberDelete(num);
		System.out.println("-1---------------");
		String view=null;
		if(cnt>0) {
			//성공->다음->리스트페이지()
			view="redirect:"+cpath+"/memberList.do";
		}
		
		return view;
	}

}
