<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="Ex11randomWinner.jsp">
	<fieldset>
	<legend>랜덤당첨작성</legend>
	주제 : <input type="text" name="topic"> <br>
	
	<%
	int num = Integer.parseInt(request.getParameter("num"));
	
	for(int i=0; i<num; i++){
		out.print("아이템"+ (i+1) + ":" + "<input type='text' name='item'>" + "<br>" );
	}
	%>
	
	<input type="submit" value="시작" >
	</fieldset>
	</form>
</body>
</html>