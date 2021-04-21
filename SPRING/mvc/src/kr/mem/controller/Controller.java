package kr.mem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

public interface Controller {
	
	
	public String execute(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException;
}
