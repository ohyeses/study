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
<legend>����Ȯ�����α׷�</legend>
<table>
<tr>
<td>�̸�</td> <td><%=name %></td>
</tr>
<tr>
<td>JAVA ����</td> <td><%=java %></td>
</tr>
<tr>
<td>WEB ����</td> <td><%=web %></td>
</tr>
<tr>
<td>IOT ����</td> <td><%=iot %></td>
</tr>
<tr>
<td>ANDROID����</td> <td><%=android %></td>
</tr>
<tr>
<td>���</td> <td><%=avg %></td>
</tr>
<tr>
<td>����</td> <td><h1><%=grade %></h1></td>
</tr>

</table>
</fieldset>
</body>
</html>