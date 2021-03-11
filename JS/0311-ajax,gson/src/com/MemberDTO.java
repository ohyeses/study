package com;

public class MemberDTO {
	private String id;
	private int pw;
	private String nick;
	
	public MemberDTO(String id, int pw, String nick) {
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}

	//alt + shift + s -> generate Getters and Setters 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	
	
}
