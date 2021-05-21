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
		<section id="RegisterSection" class="wrapper style1 special"> 

			<h3>SIGN UP </h3>
			<div id="register">

				<form action="JoinServiceCon.do" method="post">
					<input type="text" placeholder="Email" name="id">
					<input type="password" placeholder="Password" name="pw">
                    <input type="text" placeholder="Name" name="name">
                    <input type="text" placeholder="Age" name="age">
					
					<select name = "ft" id = "ft">
                    	<option value="" disabled selected >응원하는 팀</option>
						<option value = "KIA 타이거즈"> 기아 타이거즈 </option>
						<option value = "두산 베어스"> 두산 베어스 </option>
						<option value = "LG 트윈스">  LG 트윈스 </option>
						<option value = "삼성 라이온즈"> 삼성 라이온즈 </option>
						<option value = "SK 와이번스"> SK 와이번스 </option>
						<option value = "한화 이글스"> 한화 이글스 </option>
						<option value = "NC 다이노스"> NC 다이노스 </option>
						<option value = "롯데 자이언츠"> 롯데 자이언츠 </option>
						<option value = "키움 히어로즈"> 키움 히어로즈 </option>
						<option value = "KT 위즈"> KT 위즈</option>
					</select>
					
					<button type="submit" value="login" class="button fit"> 회원가입 </button>
				
				</form>

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