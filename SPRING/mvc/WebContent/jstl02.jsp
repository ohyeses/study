<%@page import="kr.mem.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	MemberVO vo = new MemberVO();
	vo.setNum(1);
	vo.setName("홍길동");
	vo.setPhone("010-1111-1111");
	vo.setEmail("bit@naver.com");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="f" items="${str}">
	${f}<br>
</c:forEach>

</body>
</html>