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

	 Integer age = (Integer)(session.getAttribute("age")); //session은 내장객체 
	/* String age = (String)(session.getAttribute("age"));  */
	//session은 내장객체 	//session은 오브젝트 형태로 반환 -> String 형태로 다운캐스팅
%>
<%=age %>는 기성쌤 나이.
</body>
</html>