package kr.mem.frontcontroller;

public class ViewResolver {
	public static String makeView(String viewname) {
		return "/WEB-INF/member/"+viewname+".jsp";
	}
}
