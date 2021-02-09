<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = null;
	Cookie[] cookies = request.getCookies();
	
	for (int i=0; i<cookies.length; i++){
		if(cookies[i].getName().equals("name")){
			name = URLDecoder.decode(cookies[i].getValue(), "EUC-KR");
		}
	}
	%>
	
	<%=name %>님 환영합니다.
</body>
</html>