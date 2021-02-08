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
      String id = request.getParameter("id");
   %>
   <%=id %>님 환영합니다!
   <a href="ex05login.html">로그아웃</a>
</body>
</html>