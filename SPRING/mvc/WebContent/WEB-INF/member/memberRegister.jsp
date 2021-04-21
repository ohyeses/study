<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
</head>
<body>
- 회원가입 -
<form action="<c:url value='/memberInsert.do'/>" method="post">
<table class="table table-bordered" style="undefined;table-layout: fixed; width: 560px">
<colgroup>
<col style="width: 197px">
<col style="width: 363px">
</colgroup>
<thead>
  <tr>
    <th class="tg-c3ow">아이디</th>
    <th class="tg-0pky"><input type="text" name="id"/></th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-c3ow">비밀번호</td>
    <td class="tg-0pky"><input type="text" name="pass"/></td>
  </tr>
  <tr>
    <td class="tg-c3ow">이름</td>
    <td class="tg-0pky"><input type="text" name="name"/></td>
  </tr>
  <tr>
    <td class="tg-c3ow">나이</td>
    <td class="tg-0pky"><input type="text" name="age"/></td>
  </tr>
  <tr>
    <td class="tg-baqh">전화번호</td>
    <td class="tg-0lax"><input type="text" name="phone"/></td>
  </tr>
  <tr>
    <td class="tg-baqh">이메일</td>
    <td class="tg-0lax"><input type="text" name="email"/></td>
  </tr>
  <tr>
    <td class="tg-0lax" colspan="2">
    	<input type="submit" value="가입" class="btn btn-succeess"/>
    	<input type="submit" value="취소" class="btn btn-warning"/>
    </td>
  </tr>
</tbody>
</table>
</form>
</body>
</html>