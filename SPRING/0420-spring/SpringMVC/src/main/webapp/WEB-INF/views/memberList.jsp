<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>
<%@ page import="kr.smhrd.model.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script type="text/javascript">
  	function goForm() {
  		//회원가입페이지로 요청
  		location.href="<c:url value='/memberRegister.do'/>";
  	}
  	
  	function goDel(num){
  		// 삭제 누르면 번호를 넘겨줌. 회원삭제페이지로 요청 get(querystring:KEY=VALUE~~~)
  		location.href="<c:url value='/memberDelete.do'/>?num="+num; // num=2
  	}
  </script>
  
</head>
<body>
	- 회원리스트 -

	<table class="table table-hover table-bordered">
		<tr>
			<td>번호</td>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>이름</td>
			<td>나이</td>
			<td>전화번호</td>
			<td>이메일</td>
			<td>삭제</td>
		</tr>

		<c:forEach var="vo" items="${list}">
		<tr>
			<td>${vo.num}</td>
			<td><a href="<c:url value='/memberContent.do'/>?num=${vo.num}">${vo.id}</a></td>
			<td>${vo.pass}</td>
			<td>${vo.name}</td>
			<td>${vo.age}</td>
			<td>${vo.phone}</td>
			<td>${vo.email}</td>
			<td><input type ="button" value="삭제" class="btn btn-warning" onclick="goDel(${vo.num})"></td>
		</tr>
		</c:forEach>
		
		
		<tr>
		<td colspan="8" align="right"><input type="button" value="회원가입" class="btn btn-primary" onclick="goForm()"/></td>
		</tr>
	</table>
</body>
</html>