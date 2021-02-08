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
		//post 방식으로 데이터 전송시 인코딩 하는 방법(utf-8)
		request.setCharacterEncoding("euc-kr");
		// request : 사용자가 입력한 값을 받아서 처리
		String name = request.getParameter("name");
	%>
	
사용자가 입력한 이름 : <%=name %>
</body>
</html>