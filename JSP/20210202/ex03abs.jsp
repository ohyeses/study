<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%!
	public String abs(int num){
		String result = "";
		if (num<0)
			result = (num + "�� ���밪 : " + num *-1);
		else
			result = (num + "�� ���밪 : " + num);
		
		return result;
}
%>

<%=abs(5) %>
<br>
<%=abs(-5) %>
</body>
</html>