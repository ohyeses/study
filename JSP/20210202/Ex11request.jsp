<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action ="Ex11score.jsp" method="post">
	<fieldset>
	<legend>학점확인 프로그램</legend>
	<table width="500" align="center">
	<tr>
	<td>이름</td><td><input type="text" name="name"></td>
	</tr>
	<tr>
	<td>자바점수</td><td><input type="text" name="java"></td>
	</tr>
	<tr>
	<td>WEB 점수</td><td><input type="text" name="web"></td>
	</tr>
	<tr>
	<td>IOT점수</td><td><input type="text" name="iot"></td>
	</tr>
	<tr>
	<td>ANDROID 점수</td><td><input type="text" name="android"></td>
	</tr>
	<tr>
	<td></td><td><input type="submit" ></td>
	</tr>
	</table>
	</fieldset>
	</form>
	
</body>
</html>