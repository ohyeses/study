package com.model;

public class MemberDTO {
	
	private String id;
	private String password;
	private String name;
	private String age;
	private String ft;
	
	public MemberDTO(String id, String password, String name, String age) {

		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		
	}
		public MemberDTO(String id, String password, String name, String age, String ft) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.ft = ft;
	}
	
	public MemberDTO(String id, String password) {

		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getFt() {
		return ft;
	}

	public void setFt(String ft) {
		this.ft = ft;
	}

	
	

}
