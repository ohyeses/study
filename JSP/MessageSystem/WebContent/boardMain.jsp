<%@page import="com.model.BoardDTO"%>
<%@page import="com.model.BoardDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>Forty by HTML5 UP</title>
		<meta charset="utf-8" />
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		<link rel="stylesheet" href="assets/css/board.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
		
</head>
<body>		
<%
	BoardDAO dao = new BoardDAO();
	ArrayList<BoardDTO> list = dao.select();
%>

			<div id="board">
				<table id = "list">
					<tr>
					<td>번호</td>
					<td>제목</td>
					<td>작성자</td>
					<td>시간</td>
					</tr>
					
					
				<%
				if (list !=null) {
				%>
				<%for (int i = 0; i<list.size(); i++){ %>
						<tr>
							<td><%=i+1%></td>
							<td><a href = "viewBoard.jsp?num=<%=list.get(i).getNum()%>"><%=list.get(i).getTitle()%></a></td>
							<td><%=list.get(i).getWriter()%></td>
							<td><%=list.get(i).getDate() %></td>
						</tr>
					
					<%}} %>
					
				</table>
				
				<a href="main.jsp"><button id="writer">홈으로가기</button></a>
				<a href="writerBoard.jsp"><button id="writer">작성하러가기</button></a>
			</div>



</body>
</html>