<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<!-- ��ũ��Ʈ�� ������ -->
	<table border="1">
		<tr>
		<%
		
		for (int i = 1; i <= 10; i++) {
			%> <td>" + <%=i %> +"</td> <%
		}
		%>
		</tr>

	</table>


<!-- 2. out ��ü ��� -->
	<table border="1">
		<tr>
		<%
		
		for (int i = 1; i <= 10; i++) {
			out.print("<td>" + i +"</td>"); // out ��ü jsp������ ���� ���ϰ� ��밡���� ����? Jsp�� �������� ��ȯ�Ǹ鼭 �ڵ����� ����ȴ�. (���尴ü)
		}
		%>
		</tr>

	</table>
</body>
</html>