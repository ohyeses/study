<%@page import="com.model.BoardDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<!--
	Spectral by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>

<head>
	<title>Spectral by HTML5 UP</title>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" href="assets/css/main.css" />
	<noscript>
		<link rel="stylesheet" href="assets/css/noscript.css" />
	</noscript>
</head>

<body class="landing is-preload">
	<% 
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardDTO> list = dao.selectAll();
	%>
	
	<!-- Page Wrapper -->
	<div id="page-wrapper">

		<!-- Header -->
		<%@ include file="header.jsp" %>

		<!-- One -->
		<section id="BoardSection" class="wrapper style1 special"> 

			<h3>게시판</h3>
			<% if ( list.size() == 0 ) {%>
					<h4 class = "boardcenter"> 현재 작성된 계시물이 없습니다.. </h4>
			<%}else {%>
			<div id="board">
				<table id = "list">
					<tr>
						<td>번호</td>
						<td>작성자(userID)</td>
						<td>제목</td>
						<td>날짜</td>
					</tr>
					<% for(int i = 0; i < list.size(); i++) { %>

					<tr>
						<td><%=i+1 %></td>
						<td> <%=list.get(i).getWriter() %> </td> 
						<td> <a href= "viewBoard.jsp?num=<%=list.get(i).getNum()%>"> <%= list.get(i).getTitle() %> </a></td>
						<td><%=list.get(i).getSend_date() %></td>
					</tr>
					<%} %>
					
				</table>

			</div>
			<%} %>
			<a href="writerBoard.jsp">
				<button id="writer">작성하러가기</button>
			</a>
		</section>

		<!-- Footer -->
		<footer>
			<%@ include file="footer.jsp" %>
		</footer>
	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/jquery.scrolly.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>

</html>