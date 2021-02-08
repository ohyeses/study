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
	request.setCharacterEncoding("euc-kr");

	int row = Integer.parseInt(request.getParameter("row"));
	int col = Integer.parseInt(request.getParameter("col"));
	%>
	<h1><%=row + "층"%></h1>
	<h1><%=col + "층" %></h1>
	
	<table border="1">
	<% 
		for (int i = 0; i < row; i++) {
			out.print("<tr>");
			for (int j = 0; j < col; j++) {
				
				out.print("<td>" + j + "</td>");
			}
			out.print("</tr>");
		}
			%>
	</table>
</body>
</html>