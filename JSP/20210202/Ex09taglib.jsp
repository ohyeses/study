<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!-- taglib ������ : �±� ���̺귯������ �±׸� ������ ����� �� �ִ� ��� ����(Ȯ���±� ) ex)JSTL -->
    <!-- JSTL : JSP���� �����ϰ� ����� �� �ִ� ����� ������ Ŀ���� �±׶��̺귯��, ��ũ��Ʋ���� ����� ���� �� �ִ�. -->
    <!-- prefix : ���λ� / jstl �±� ����� �� �±� �̸� �տ� ���� ���λ� -->
    <!-- uri : �±� ���̺귯���� uri -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>��</th>
		<th>������</th>
	</tr>
	<c:forEach var="x" begin="0" end="10" step="2">
	<tr>
	<td><c:out value="${x}"/></td>
	
	<td><c:out value="${x*x}"/></td>
	</tr>
</c:forEach>
</table>
</body>
</html>