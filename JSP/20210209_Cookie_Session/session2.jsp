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

	 Integer age = (Integer)(session.getAttribute("age")); //session�� ���尴ü 
	/* String age = (String)(session.getAttribute("age"));  */
	//session�� ���尴ü 	//session�� ������Ʈ ���·� ��ȯ -> String ���·� �ٿ�ĳ����
%>
<%=age %>�� �⼺�� ����.
</body>
</html>