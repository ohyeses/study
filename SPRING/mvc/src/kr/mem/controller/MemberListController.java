package kr.mem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.mem.model.MemberDAO;
import kr.mem.model.MemberVO;

public class MemberListController implements Controller{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 회원전체 목록 가져오기
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.memberList();
		// View에 list 전달하도록 객체 바인딩
		request.setAttribute("list", list);
		// 다음 페이지 정보를 리턴해주기
		// return "/WEB-INF/member/memberList.jsp";
		return "memberList"; //View의 논리적인 이름
	}
}
