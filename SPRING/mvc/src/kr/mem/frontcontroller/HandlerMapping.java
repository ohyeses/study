package kr.mem.frontcontroller;

import java.util.HashMap;

import kr.mem.controller.Controller;
import kr.mem.controller.MemberContentController;
import kr.mem.controller.MemberDeleteController;
import kr.mem.controller.MemberInsertController;
import kr.mem.controller.MemberListController;
import kr.mem.controller.MemberRegisterController;
import kr.mem.controller.MemberUpdateController;

public class HandlerMapping {
	private HashMap<String,Controller> mappings;
	// 		KEY					VALUE
	// /memberList.do-->MemberListController
	// /memberInsert.do-->MemberInsertController
	// /memberDelete.do-->MemberDeleteController
	
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/memberList.do", new MemberListController());
		mappings.put("/memberInsert.do", new MemberInsertController());
		mappings.put("/memberDelete.do", new MemberDeleteController());
		mappings.put("/memberRegister.do", new MemberRegisterController());
		mappings.put("/memberContent.do", new MemberContentController());
		mappings.put("/memberUpdate.do", new MemberUpdateController());
	}
	
	public Controller getController(String key) {
		return mappings.get(key);
	}
}
