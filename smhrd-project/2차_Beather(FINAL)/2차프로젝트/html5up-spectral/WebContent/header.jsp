<%@page import="com.model.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<%
		MemberDTO dto = (MemberDTO) session.getAttribute("ReturnDTO");
		
	%> 

	<header id="header" class="alt">
		<h1>
			<a href="index.html">Spectral</a>
		</h1>
		<nav id="nav">
			<ul>
				<li class="special"><a href="#menu" class="menuToggle"><span>Menu</span></a>
					<div id="menu">
						<ul>
							<li><a href="index.jsp">HOME</a></li>
							<li><a href="a.jsp">팀 별 분석</a></li>
							<li><a href="ServiceProcess.jsp">서비스 분석 과정</a></li>
							<% if (dto != null) { %>
								<li><a href="service.jsp">승부 예측 서비스</a></li>
								<li><a href="board.jsp">게시판</a></li>
								<li><a href = "update.jsp"> Update</a> </li>
							<%}else { %>
								<li><a href="register.jsp">Sign Up</a></li>
								<li><a href="login.jsp">Log In</a></li>
							<%} %>
							
						</ul>
					</div>
				</li>
			</ul>
		</nav>
	</header>
</body>
</html>