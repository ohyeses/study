<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!-- taglib 지시자 : 태그 라이브러리에서 태그를 가져와 사용할 수 있는 기능 제공(확장태그 ) ex)JSTL -->
    <!-- JSTL : JSP에서 유용하게 사용할 수 있는 기능을 만들어둔 커스텀 태그라이브러리, 스크립틀릿의 사용을 줄일 수 있다. -->
    <!-- prefix : 접두사 / jstl 태그 사용할 때 태그 이름 앞에 붙일 접두사 -->
    <!-- uri : 태그 라이브러리의 uri -->
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
		<th>값</th>
		<th>제곱값</th>
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