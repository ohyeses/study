package com.model;

public class BoardDTO {

	private int num;
	private String writer;
	private String title;
	private String content;
	private String send_date;

	public BoardDTO(int num, String writer,String title, String content, String send_date) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.send_date = send_date;
	}

	public BoardDTO(String writer, String title, String content) {
		super();
		this.writer = writer;
		this.title = title;
		this.content = content;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSend_date() {
		return send_date;
	}

	public void setSend_date(String send_date) {
		this.send_date = send_date;
	}

}
