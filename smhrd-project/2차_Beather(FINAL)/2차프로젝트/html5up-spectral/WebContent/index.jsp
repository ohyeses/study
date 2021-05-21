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
		

		<!-- Banner -->
		<section id="banner">
			<%@ include file="header.jsp"%>
			<!-- <img src="baseball/bg1.png" alt="" /> -->
			<div class="inner">
				<h2> Welcome to Beather </h2>
				<% if (dto != null) { %>
					<p> <%=dto.getName() %>님, 환영합니다. </p>	
				<%}%>
				<p>
					<b style="font-size:18px;"> B</b>aseball + W<b style="font-size:18px;">eather</b> <br /> 
					<br />
				</p>
				<ul class="actions special">
					<% if (dto != null) { %>
					<li><a href="service.jsp" class="button primary">승률 예측하기</a></li>
					<%}%>
				</ul>
			</div>
			<a href="#two" class="more scrolly">Learn More</a>
		</section>
		

		
		<!-- 지역별 날씨 예보 -->
		<section id="two" class="wrapper style1 special">
			<div id="weathersection">
				<h3>| 지역별 날씨 예보 |</h3>
				<div class="content-dis"></div>
				<%@ include file="weather.jsp"%>
				
			</div>
		</section>
		
		<!-- TEAM RANKING -->
		<section id="three" class="wrapper style1 special">
			
			<div id = "teamranking">
			<h3> | TEAM RANKING |</h3>
			<div class= "content-dis"></div>
			<table>
				<thead>
					<tr>
						<th>순위</th>
						<th>팀명</th>
						<th>경기</th>
						<th>승</th>
						<th>패</th>
						<th>무</th>
						<th>승률</th>
						<th>게임차</th>
					
					</tr>
				</thead>
				<tbody>
					<tr>
						<th>1</th>
						<td><img src = "baseball/emblem_NC.png" alt= "NC"></td>
						<td>144</td>
						<td>83</td>
						<td>55</td>
						<td>6 </td>
						<td>0.601 </td>
						<td>-</td>
				
					</tr>
					<tr>
						<th>2</th>
						<td><img src = "baseball/emblem_KT.png" alt= "KT"></td>
						<td>144</td>
						<td>81</td>
						<td>62</td>
						<td>1</td>
						<td>0.566 </td>
						<td>4.5</td>
					
					</tr>
					<tr>
						<th>3</th>
						<td><img src = "baseball/emblem_OB.png" alt= "OB"></td>
						<td>144</td>
						<td>79</td>
						<td>61</td>
						<td>4</td>
						<td>0.564</td>
						<td>5.0</td>
					
					</tr>
					<tr>
						<th>4</th>
						<td><img src = "baseball/emblem_LG.png" alt= "LG"></td>
						<td>144</td>
						<td>79</td>
						<td>61</td>
						<td>4</td>
						<td>0.564 </td>
						<td>5.0</td>
				
					</tr>
					<tr>
						<th>5</th>
						<td><img src = "baseball/emblem_WO.png" alt= "WO"></td>
						<td>144</td>
						<td>80</td>
						<td>63</td>
						<td>1</td>
						<td>0.559 </td>
						<td>5.5</td>
					</tr>
					<tr>
						<th>6</th>
						<td><img src = "baseball/emblem_HT.png" alt= "HT"></td>
						<td>144</td>
						<td>73</td>
						<td>71</td>
						<td>0</td>
						<td>0.507</td>
						<td>13.0</td>
					</tr>
					<tr>
						<th>7</th>
						<td><img src = "baseball/emblem_LT.png" alt= "LT"></td>
						<td>144</td>
						<td>71</td>
						<td>72</td>
						<td>1</td>
						<td>0.497 </td>
						<td>14.5</td>
				
					</tr>
					<tr>
						<th>8</th>
						<td><img src = "baseball/emblem_SS.png" alt= "SS"></td>
						<td>144</td>
						<td>64</td>
						<td>75</td>
						<td>5</td>
						<td>0.460 </td>
						<td>19.5</td>
			
					</tr>
					<tr>
						<th>9</th>
						<td><img src = "baseball/emblem_SK.png" alt= "SK"></td>
						<td>144</td>
						<td>51</td>
						<td>92</td>
						<td>1</td>
						<td>0.357 </td>
						<td>34.5</td>
					
					</tr>
					<tr>
						<th>10</th>
						<td><img src = "baseball/emblem_HH.png" alt= "HH"></td>
						<td>144</td>
						<td>46</td>
						<td>95</td>
						<td>3</td>
						<td>0.326</td>
						<td>38.5</td>
		
					</tr>
			

				</tbody>
				</table>	
			</div>
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