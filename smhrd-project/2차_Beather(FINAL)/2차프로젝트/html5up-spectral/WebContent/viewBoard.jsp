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
	String num = request.getParameter("num");
    BoardDAO dao = new BoardDAO();
    BoardDTO dto1 = dao.selectOne(num);
	%>
	
	<!-- Page Wrapper -->
	<div id="page-wrapper">

		<!-- Header -->
		<%@ include file="header.jsp" %>

		<!-- One -->
		<section id="BoardSection" class="wrapper style1 special"> 
		
			<div id = "board">
            <table id="list">
               <tr>
                  <td>제목</td>
                  <td><%=dto1.getTitle() %></td>
               </tr>
               <tr>
                  <td>작성자</td>
                  <td><%=dto1.getWriter() %></td>
               </tr>
               <tr>
                  <td colspan="2">내용</td>
               </tr>
               <tr>
                  <td colspan="2">
                     <!-- 사진 출력하기 -->
            
                     <br>
                     <%=dto1.getContent() %>
                  </td>
               </tr>
               <tr>
                  <td colspan="2"><a href="board.jsp"><button>뒤로가기</button></a></td>
               </tr>
            </table>
         </div>
		
		</section>

		<!-- Footer -->
		<%@ include file="footer.jsp" %>

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