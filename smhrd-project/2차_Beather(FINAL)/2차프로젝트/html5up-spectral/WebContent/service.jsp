<%@page import="com.model.BoardDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.BoardDAO"%>
<%@page import="com.model.WeatherDAO"%>
<%@page import="com.model.WeatherDTO"%>

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
	<link rel="stylesheet" href="assets/css/noscript.css" />
</noscript>
<style type="text/css">
</style>
<!-- Scripts -->
<script type="text/javascript" src="assets/js/jquery.min.js"></script>

</head>

<body class="landing is-preload">
<% 
	String name = (String) session.getAttribute("name");
	WeatherDAO dao = new WeatherDAO();
	ArrayList<WeatherDTO> weatherlist = dao.selectAllWeather();
	String pre = request.getParameter("predict"); 
	String current_day = weatherlist.get(0).getDay();
	String current_year = current_day.subSequence(0, 4).toString();
	String current_month = current_day.subSequence(4, 6).toString();
	int current_day1 = Integer.parseInt(current_day.subSequence(6, 8).toString());
	
%>


	<!-- Page Wrapper -->
	<div id="page-wrapper">

		<!-- Header -->
		<%@ include file="header.jsp"%>
		
		
		<!-- 승률 예측하기 -->
		<section id="service" class="wrapper style1 special">
			<h3>| INPUT VALUE | </h3>
			
			<!-- <form action="http://localhost:9000/beather" method="POST">  -->
			<%--  --%>
				<!-- Step 1  -->
				
				<div id="step1">
					<label for="date">STEP 1. 날짜 선택하기 </label>
					<input type="date" id="select_day" name="select_day" 
							min = "<%=current_year%>-<%=current_month%>-<%=current_day1%>" required>
				</div>
				
				<img src = "images/icon-arrow-down.png" alt = "chevron">
				<!-- Step 2  -->
				<div class = "content_dis"> </div>
				<div id="step2">
					<label for="location">STEP 2. 지역 선택하기 </label>
					<!-- onclick = "TeamKindChange(this)" -->
					<select id="location" name="location" onclick = "TeamKindChange(this)" required>
						<option value="" disabled selected>지역 선택</option>
						<option value="서울">서울</option>
						<option value="광주">광주</option>
						<option value="부산">부산</option>
						<option value="창원">창원</option>
						<option value="인천">인천</option>
						<option value="대전">대전</option>
						<option value="대구">대구</option>
						<option value="수원">수원</option>
					</select>
					
				</div>
				<img src = "images/icon-arrow-down.png" alt = "chevron">
				<!-- Step 3  -->
				<div id = "step3">
					<label for="home_away">STEP 3. 팀 선택하기 </label> 
					<div class = "left_home">
						<p> <br>HOME TEAM <p> 
						<select name="home_team" id="home_team" required>
							<option value="" disabled selected>팀 선택</option>
							<!-- <option value="KIA">기아 타이거즈</option>
							<option value="DU">두산 베어스</option>
							<option value="LG">LG 트윈스</option>
							<option value="SL">삼성 라이온즈</option>
							<option value="SK">SSG 랜더스</option>
							<option value="HE">한화 이글스</option>
							<option value="NC">NC 다이노스</option>
							<option value="GI">롯데 자이언츠</option>
							<option value="KH">키움 히어로즈</option>
							<option value="KT">KT 위즈</option>   -->
						</select>
						
					</div>
			
					<div class = "right_away">
						<p> <br> AWAY TEAM</p> 
						<select name="away_team" id="away_team" required>
							<option value="" disabled selected>팀 선택</option>
							<option value="KIA">기아 타이거즈</option>
							<option value="DU">두산 베어스</option>
							<option value="LG">LG 트윈스</option>
							<option value="SL">삼성 라이온즈</option>
							<option value="SK">SSG 랜더스</option>
							<option value="HE">한화 이글스</option>
							<option value="NC">NC 다이노스</option>
							<option value="GI">롯데 자이언츠</option>
							<option value="KH">키움 히어로즈</option>
							<option value="KT">KT 위즈</option>
						</select>
					</div>
					<input type="button" value = "예측하기" id = "submit">
				</div>
				
				
				<vr/>
				<!-- </form> -->
				
			</section>
			
			<section id = service_result class="wrapper style1 special">
				<h3> | BEATHER PREDICTION |</h3>
				<div id ="weather_table">
				
				<table>
					<thead>
						<tr>
							<th>
								<%
								for (int i = 0; i < 3; i++) {

									String day = weatherlist.get(i).getDay();
									String year = day.subSequence(0, 4).toString();
									String month = day.subSequence(4, 6).toString();
									String day1 = day.subSequence(6, 8).toString();
									out.print("<th>" + month + "/" + day1 + "</th>");
								}
								%>
							</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<th>예보(&#8451) </th>
								
							<%
							//맑음(1), 구름많음(3), 흐림(4)
							String img_name ="";
							String alt ="";
							for(int i = 0; i < 3; i++) {
								if(weatherlist.get(i).getSky().equals("1")) {
									img_name = "baseball/맑음.PNG";
									alt = "맑음";
								}else if(weatherlist.get(i).getSky().equals("3")) {
									img_name = "baseball/구름많음.png";
									alt = "구름많음";
								}else if(weatherlist.get(i).getSky().equals("4")) {
									img_name = "baseball/흐림.png";
									alt = "흐림";
								}
								out.print("<td><img src =" + img_name + "><br>" +
										weatherlist.get(i).getTemp() + "&#8451 </td>");
							}
							%>

						</tr>
						<tr>
							<th>습도</th>
							<%
							for (int i = 0; i < 3; i++) {
								out.print("<td>" + weatherlist.get(i).getHumidity() + "%</td>");
							}
							%>
						</tr>
						<tr>
							<th>강수확률</th>
							<%
							for (int i = 49; i < 52; i++) {
								out.print("<td>" + weatherlist.get(i).getRainprob() + "%</td>");
							}
							%>
						</tr>
					</tbody>
				</table>
			</div>
				<div id = "result">
					<div class = "home">
						<img name = "homeimg" src = ""> <br>
						<label class = "home_result"></label>
					</div>
					<div class = "vs">
						<img src = "baseball/vs.png" alt = "vs">
					</div>
					<div class = "away">
						<img name = "awayimg" src = ""> <br>
						<label class = "away_result"></label>
					</div>
					
				</div>
				<div id = "result_text"> 
					<p>예측 결과가 없습니다.</p>
				</div>
				
				
				<input type="button" value = "다른 경기 예측" onclick = "window.location.reload()">
			</section>
		
		<!-- Footer -->

		<%@ include file="footer.jsp"%>

	</div>
	
	<script>
	function TeamKindChange(e) {
		var seoul = ["두산 베어스","LG 트윈스","키움 히어로즈"];
		var gwangju = ["기아 타이거즈"];
		var busan = ["롯데 자이언츠"];
		var changwon = ["NC 다이노스"];
		var daegu = ["삼성 라이온즈"];
		var daejeon = ["한화 이글스"];
		var incheon = ["SSG 랜더스"];
		var suwon = ["KT 위즈"];
		
		var target = document.getElementById("home_team");
		
		if (e.value == "서울") {
			var d = seoul;
		}else if (e.value == "광주") {
			var d = gwangju;
		}else if (e.value == "부산") {
			var d = busan;
		}else if (e.value == "창원") {
			var d = changwon;
		}else if (e.value == "대구") {
			var d = daegu;
		}else if (e.value == "대전") {
			var d = daejeon;
		}else if (e.value == "인천") {
			var d = incheon;
		}else if (e.value == "수원") {
			var d = suwan;
		}
		target.options.length = 0;
		for (x in d) {
			var opt = document.createElement("option");
			opt.value = d[x];
			opt.innerHTML = d[x];
			
			target.appendChild(opt);
			if(d[x] == "두산 베어스") {
				opt.setAttribute('value','DU');
			}else if (d[x] == "LG 트윈스") {
				opt.setAttribute('value','LG');
			}else if (d[x] == "키움 히어로즈") {
				opt.setAttribute('value', 'KH');
			}else if (d[x] == "기아 타이거즈") {
				opt.setAttribute('value', 'KIA');
			}else if (d[x] == "롯데 자이언츠") {
				opt.setAttribute('value', 'GI');
			}else if (d[x] == "NC 다이노스") {
				opt.setAttribute('value', 'NC');
			}else if (d[x] == "삼성 라이온즈") {
				opt.setAttribute('value', 'SL');
			}else if (d[x] == "한화 이글스") {
				opt.setAttribute('value', 'HE');
			}else if (d[x] == "SSG 랜더스") {
				opt.setAttribute('value', 'SK');
			}else if (d[x] == "KT 위즈") {
				opt.setAttribute('value', 'KT');
			}
			
		}
 	}
	</script>

	<script>
		var con = document.getElementById('result_text');
		var con1 = document.getElementById('result');
		$('#submit').click(function(){
			var select_day = document.getElementById('select_day').value;
			var location = document.getElementById('location').value;
			var home_team = document.getElementById('home_team').value;
			var away_team = document.getElementById('away_team').value;

			//텍스트 스타일 감추기
			con.style.display = 'none';
			con1.style.display = 'block';
			$.ajax({
				url:'http://127.0.0.1:9005/home',
				type:'POST',
				dataType: 'json',
				data: {"select_day": select_day,
			        "location": location,
			        "home_team": home_team},
				success: function(data) {
					//python에서 값 가져오기 
					var result = data.key1;
				
					var home_result = "";
					var away_result = "";
					var img = "";
					var img1= "";
					if(result == '1') {
						home_result = "WIN";
						away_result = "LOOSE";
					}else {
						home_result = "LOOSE";
						away_result = "WIN";
					}
					
					if(home_team == "KIA") {
						img = 'baseball/emblem_HT.png';
					}else if (home_team == "DU") {
						img = 'baseball/emblem_OB.png';
					}else if (home_team == "LG") {
						img = 'baseball/emblem_LG.png';
					}else if (home_team == "SL") {
						img = 'baseball/emblem_SS.png';
					}else if (home_team == "SK") {
						img = 'baseball/emblem_SK.png';
					}else if (home_team == "HE") {
						img = 'baseball/emblem_HH.png';
					}else if (home_team == "NC") {
						img = 'baseball/emblem_NC.png';
					}else if (home_team == "GI" ) {
						img = 'baseball/emblem_LT.png';
					}else if (home_team == "KH") {
						var img = 'baseball/emblem_WO.png';
					}else if (home_team == "KT") {
						img = 'baseball/emblem_KT.png';
					}
					
					if(away_team == "KIA") {
						img1 = 'baseball/emblem_HT.png';
					}else if (away_team == "DU") {
						img1 = 'baseball/emblem_OB.png';
					}else if (away_team == "LG") {
						img1 = 'baseball/emblem_LG.png';
					}else if (away_team == "SL") {
						img1= 'baseball/emblem_SS.png';
					}else if (away_team == "SK") {
						img1 = 'baseball/emblem_SK.png';
					}else if (away_team == "HE") {
						img1 = 'baseball/emblem_HH.png';
					}else if (away_team == "NC" ) {
						img1 = 'baseball/emblem_NC.png';
					}else if (away_team == "GI") {
						img1 = 'baseball/emblem_LT.png';
					}else if (away_team == "KH") {
						img1 = 'baseball/emblem_WO.png';
					}else if (away_team == "KT") {
						img1 = 'baseball/emblem_KT.png';
					}
					
					document.homeimg.src = img;
					document.awayimg.src = img1;


					$('.home_text').replaceWith(home_team);
					$('.away_text').replaceWith(away_team);
				
					$('.home_result').replaceWith(home_result);
					$('.away_result').replaceWith(away_result);
					/* Style */
					$('.home').css('font-style','italic'); 
					$('.away').css('font-style','italic');
					$('.home').css('font-size','20px'); 
					$('.away').css('font-size','20px');
					$('.home').css('font-weight','bold'); 
					$('.away').css('font-weight','bold');
					
					if( home_result == "WIN") {
						$('.home').css('color','#FF392E'); 
					}else if (home_result == "LOOSE") {
						$('.home').css('color','#7792CB'); 
					}
					if( away_result == "WIN") {
						$('.away').css('color','#FF392E'); 
					}else if ( away_result == "LOOSE") {
						$('.away').css('color','#7792CB'); 
					}
				},
				error: function(e){
					//console.log(e)
					alert('값을 확인해 주세요.');
					
				}
			})
		});
	</script>
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