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
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<link rel="stylesheet" href="team.css" />
<noscript>
	<link rel="styles\heet" href="assets/css/noscript.css" />
</noscript>
<style type="text/css">
.tab{
	display: flex;
	margin: 0px auto !important;
	display: inline-block !important;
	width: 1146px !important;
	margin-left: 225px !important;
}

</style>
</head>
<body class="landing is-preload">
	<!-- Page Wrapper -->
	<div id="page-wrapper">

		<!-- Header -->
		<%@ include file="header.jsp"%>
		
		<!-- 결과 유사도  -->
		<section id ="result_similarity">
			<h1> 피타고리안 승률과 비교</h1>
			<table>
				
				<thead>
					<tr>
						<th></th>
						<th colspan = '2'>2017</th>
						<th colspan = '2'>2018</th>
						<th colspan = '2'>2019</th>
						
					</tr>
					<tr>
						<th></th>
						<th>피타고리안</th>
						<th>머신러닝</th>
						<th>피타고리안</th>
						<th>머신러닝</th>
						<th>피타고리안</th>
						<th>머신러닝</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th> KIA </th>
						<td>0.580</td>
						<td>0.625</td>
						<td>0.503</td>
						<td>0.521</td>
						<td>0.422</td>
						<td>0.410</td>
					</tr>
					
					<tr>
						<th> 삼성 </th>
						<td>0.421</td>
						<td>0.478</td>
						<td>0.496</td>
						<td>0.511</td>
						<td>0.417</td>
						<td>0.385</td>
					</tr>
					<tr>
						<th> 두산 </th>
						<td>0.602</td>
						<td>0.550</td>
						<td>0.605</td>
						<td>0.656</td>
						<td>0.635</td>
						<td>0.590</td>
					</tr>
					<tr>
						<th> KT </th>
						<td>0.376</td>
						<td>0.356</td>
						<td>0.451</td>
						<td>0.470</td>
						<td>0.498</td>
						<td>0.515</td>
					</tr>
					<tr>
						<th> LG </th>
						<td>0.497</td>
						<td>0.492</td>
						<td>0.487</td>
						<td>0.492</td>
						<td>0.500</td>
						<td>0.521</td>
					</tr>
					<tr>
						<th> 키움 </th>
						<td>0.508</td>
						<td>0.510</td>
						<td>0.525</td>
						<td>0.517</td>
						<td>0.677</td>
						<td>0.572</td>
					</tr>
					<tr>
						<th> 한화 </th>
						<td>0.458</td>
						<td>0.404</td>
						<td>0.487</td>
						<td>0.553</td>
						<td>0.389</td>
						<td>0.382</td>
					</tr>
					<tr>
						<th> NC </th>
						<td>0.525</td>
						<td>0.606</td>
						<td>0.373</td>
						<td>0.419</td>
						<td>0.530</td>
						<td>0.540</td>
					</tr>
					<tr>
						<th> SSG </th>
						<td>0.475</td>
						<td>0.531</td>
						<td>0.553</td>
						<td>0.568</td>
						<td>0.568</td>
						<td>0.579</td>
					</tr>
					<tr>
						<th> 롯데 </th>
						<td>0.539</td>
						<td>0.547</td>
						<td>0.498</td>
						<td>0.518</td>
						<td>0.376</td>
						<td>0.341</td>
					</tr>
					
				</tbody>
			</table>
		
		</section>
		<hr>
		<!-- 분석 과정  -->
		<section id ="ana_process">
		<h1> 분석 과정</h1>
			<img src = "baseball/process.PNG" alt = "분석 과정">
		</section>
		<hr>
		<!-- 피타고리안  -->
		<section id ="pitagorian">
		<h1> 피타고리안 승률이란? </h1>
			<img src = "baseball/피타고리안.PNG" alt = "pitagorian">
			<p> " 대한야구협회 공식 야구 규칙 1조 2항 <b>"각 팀의 목적은 상대 팀보다 많이 득점하여 승리하는 데 있다"</b>에 
			의하여 피타고리안 승률 계산법이 고안 되었다. 야구 경기에서 발생하는 데이터를 분석하는 학문인 Sabermetrics의 
			창시자 Bill James가 제안한 피타고리안 승률은 이와같은 가정에서 시작한다. "한 구단이 마땅히 얻을 수 있는 승리는 
			득점과 실점에 영향을 받을 것이고 득점이 높고 실점이 낮다면 당연히 그 값은 커질 것이다". 
			이를 바탕으로 득점의 제곱을, 득점의 제곱과 실점의 제곱의 합으로 나누어 승률의 추정량을 고안하였고 
			피타고라스 정리와 유사하다는 이유에서 이를 피타고리안 승률이라 불렀다." </p> <br>
			<p style = "font-size: smaller"> <a href = "http://nrevival.tistory.com/39" > 출처 : http://nrevival.tistory.com/39 </a>
 		</section>
		
		<!-- Footer -->
		<%@ include file="footer.jsp"%>

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