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
		String url = request.getParameter("url");
		if (url.equals("���̹�")){
			response.sendRedirect("http://www.naver.com");
		}
		else if (url.equals("����")){
			response.sendRedirect("http://www.daum.net");
		}
		else if (url.equals("����")){
			response.sendRedirect("http://www.google.com");
		}
		
		
		// sendRedirect : �� ������ �� ���������� �ٸ� �������� �̵��϶�� ����
		/* response.sendRedirect("http://www.naver.com"); */
	%>
</body>
</html>