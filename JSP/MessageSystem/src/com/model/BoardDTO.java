package com.model;

public class BoardDTO {
	private int num;
	private String title;
	private String writer;
	private String fileName;
	private String content;
	private String date;
	
	public BoardDTO(int num, String title, String writer, String fileName, String content, String date) {
		this.num = num;
		this.title = title;
		this.writer = writer;
		this.fileName = fileName;
		this.content = content;
		this.date = date;
	}
	
	public BoardDTO(String title, String writer, String fileName, String content) {
		this.title = title;
		this.writer = writer;
		this.fileName = fileName;
		this.content = content;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
