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
	request.setCharacterEncoding("euc-kr");

	String name = request.getParameter("name");
	int java = Integer.parseInt(request.getParameter("java"));
	int web = Integer.parseInt(request.getParameter("web"));
	int iot = Integer.parseInt(request.getParameter("iot"));
	int android = Integer.parseInt(request.getParameter("android"));
	int sum = 0;
	float avg = 0;
	String grade = "";
	
	sum = java+web+iot+android;
	avg = sum/4;
	
	if(avg>95)
		grade = "A+";
	else if(avg>85)
		grade = "A";
	else if(avg>80)
		grade = "B+";
	else if(avg>70)
		grade = "C";
	else
		grade = "F";
%>


<fieldset>
<legend>학점확인프로그램</legend>
<table>
<tr>
<td>이름</td> <td><%=name %></td>
</tr>
<tr>
<td>JAVA 점수</td> <td><%=java %></td>
</tr>
<tr>
<td>WEB 점수</td> <td><%=web %></td>
</tr>
<tr>
<td>IOT 점수</td> <td><%=iot %></td>
</tr>
<tr>
<td>ANDROID점수</td> <td><%=android %></td>
</tr>
<tr>
<td>평균</td> <td><%=avg %></td>
</tr>
<tr>
<td>학점</td> <td><h1><%=grade %></h1></td>
</tr>

</table>
</fieldset>
</body>
</html>