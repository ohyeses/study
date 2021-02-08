<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>JSP 페이지</h1>
	
	<!-- 스크립틀릿(scriptlet) : jsp 문서 안에 java 코드를 작성하기 위해서 사용 -->
	<% 
		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2;
	%>
	<!-- 표현식 : 브라우저에 결과값 출력하기 위해서 사용 -->
총 합 : <%=sum %>
<%=sum+100 %>
<!-- 메소드 호출 가능 -->
<%=Math.sqrt(sum) %>
</body>
</html>