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
		//post ������� ������ ���۽� ���ڵ� �ϴ� ���(utf-8)
		request.setCharacterEncoding("euc-kr");
		// request : ����ڰ� �Է��� ���� �޾Ƽ� ó��
		String name = request.getParameter("name");
	%>
	
����ڰ� �Է��� �̸� : <%=name %>
</body>
</html>