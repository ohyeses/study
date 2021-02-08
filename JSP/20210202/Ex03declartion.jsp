<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 	스크립틀릿에 변수 선언 -->
	<%
	int num1 = 10;
	%>

	<!-- 선언문에서 변수 선언 -->
	<%!int num2 = 20;%>
	<!-- 메소드 선언 -->
	<%!public int add(int num1, int num2) {
		return num1 + num2;
	}%>
	
	<!-- 화면상에서 출력하고 싶을때 표현식, 메소드 호출가능 -->
	<%=add(num1,num2) %>
</body>
</html>