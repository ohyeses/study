<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 	��ũ��Ʋ���� ���� ���� -->
	<%
	int num1 = 10;
	%>

	<!-- ���𹮿��� ���� ���� -->
	<%!int num2 = 20;%>
	<!-- �޼ҵ� ���� -->
	<%!public int add(int num1, int num2) {
		return num1 + num2;
	}%>
	
	<!-- ȭ��󿡼� ����ϰ� ������ ǥ����, �޼ҵ� ȣ�Ⱑ�� -->
	<%=add(num1,num2) %>
</body>
</html>