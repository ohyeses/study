<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="a" value="10" />
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="i" begin="1" end="5" step="1">
		<font size="${i}">JSP = [JSTL+EL]</font>
		<br>
	</c:forEach>

	<c:if test="${a%2==0}">
짝수입니다.
</c:if>

	<c:if test="${a%2==1}">
홀수입니다.
</c:if>


	<c:choose>
		<c:when test="${a%2==0}">
		짝수입니다
		</c:when>

		<c:when test="${a%2!=0}">
		홀수입니다.
		</c:when>

		<c:otherwise>
		일치하는 조건이 없는 경우 실행
		</c:otherwise>

	</c:choose>

</body>
</html>