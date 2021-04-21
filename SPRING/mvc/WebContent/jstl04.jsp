<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="kr.mem.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	List<MemberVO> list = new ArrayList<MemberVO>();
	MemberVO vo = new MemberVO();
	vo.setNum(1);
	vo.setName("홍길동");
	vo.setPhone("010-1111-1111");
	vo.setEmail("bit@naver.com");
	
	list.add(vo);
	list.add(vo);
	list.add(vo);
	list.add(vo);
	list.add(vo);
	
	request.setAttribute("list", list);
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
	<tr>
	<td>번호</td>
	<td>이름</td>
	<td>전화</td>
	<td>이메일</td>
	</tr>
	
	<c:forEach var="vo" items="${list}">
	<tr>
	<td>${vo.num}</td>
	<td>${vo.name}</td>
	<td>${vo.phone}</td>
	<td>${vo.email}</td>
	</tr>
	</c:forEach>
	</table>

</body>
</html>