<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<!-- 스크립트릿 여러개 -->
	<table border="1">
		<tr>
		<%
		
		for (int i = 1; i <= 10; i++) {
			%> <td>" + <%=i %> +"</td> <%
		}
		%>
		</tr>

	</table>


<!-- 2. out 객체 사용 -->
	<table border="1">
		<tr>
		<%
		
		for (int i = 1; i <= 10; i++) {
			out.print("<td>" + i +"</td>"); // out 객체 jsp에서는 선언 안하고 사용가능한 이유? Jsp가 서블릿으로 변환되면서 자동으로 선언된다. (내장객체)
		}
		%>
		</tr>

	</table>
</body>
</html>