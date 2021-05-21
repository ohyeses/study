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

	<!-- Page Wrapper -->
	<div id="page-wrapper">

		<!-- Header -->
		<%@ include file="header.jsp" %>

		<!-- One -->
		<section id="loginSection.do" class="wrapper style1 special"> 

			<h3>LOG IN </h3>
			<div id="login">

				<form action="LoginServiceCon.do" method="post">
					<input type="text" placeholder="Email" name="id">
					<input type="password" placeholder="Password" name="pw">
					<button type="submit" value="login" class="button fit"> 로그인 </button>
					<br><br>
					<a href = "register.jsp"> Register >> </a>
				</form>

			</div>
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