<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
	<legend>랜덤당첨결과</legend>
	
	<%
		String topic = request.getParameter("topic");
		String [] item = request.getParameterValues("item");
		int rd_num = item.length;
		Random rd = new Random();
		int random = rd.nextInt(rd_num);
		String item_random = request.getParameterValues("item")[random];
		
		// 랜덤객체 생성
/* 		Random rd = new Random();
		out.print("<p>" + rd.nextInt(item.length)+"</p>");
		String result = item[rd.nextInt(item.length)]; */
		
	%>
	
	 <%= topic + "<br>" + item_random %>
	
	</fieldset>
</body>
</html>