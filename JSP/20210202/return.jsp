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
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	String ope = request.getParameter("ope");
	int result=0;
	

 
  	if(ope.equals("+"))
 		result = num1+num2;
 	else if(ope.equals("-"))
 		result = num1-num2;
 	else if(ope.equals("*"))
 		result = num1*num2;
 	else if(ope.equals("/"))
 		result = num1/num2; 
 		
%>

<%=num1 + ope + num2  + "=" + result%>
</body>
</html>