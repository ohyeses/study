<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>JSP ������</h1>
	
	<!-- ��ũ��Ʋ��(scriptlet) : jsp ���� �ȿ� java �ڵ带 �ۼ��ϱ� ���ؼ� ��� -->
	<% 
		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2;
	%>
	<!-- ǥ���� : �������� ����� ����ϱ� ���ؼ� ��� -->
�� �� : <%=sum %>
<%=sum+100 %>
<!-- �޼ҵ� ȣ�� ���� -->
<%=Math.sqrt(sum) %>
</body>
</html>