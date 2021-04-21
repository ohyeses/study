package kr.smhrd.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberDAO dao;
	
	@RequestMapping("/memberList.do")
	public String memberList(Model model) {
		
		List<MemberVO> list = dao.memberList();
		model.addAttribute("list", list);
		
		return "memberList";
	}
	
	@RequestMapping("/memberInsert.do")
	public String memberInsert() {
		
		
		return "";
	}
	
	@RequestMapping("/memberDelete.do")
	public String memberDelete() {
		
		
		return "";
	}
	
	@RequestMapping("/memberContent.do")
	public String memberContent() {
		
		
		return "";
	}
	
	@RequestMapping("/memberUpdate.do")
	public String memberUpdate() {
		
		
		return "";
	}
	
	
	@RequestMapping("/memberRegister.do")
	public String memberRegister() {
		
		
		return "";
	}
}
