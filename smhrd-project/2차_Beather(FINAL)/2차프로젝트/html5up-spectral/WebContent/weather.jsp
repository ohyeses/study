<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="com.model.WeatherDAO"%>
<%@page import="com.model.WeatherDTO"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css">


</style>
</head>
<body>
<%
	String name = (String)session.getAttribute("name"); 
	WeatherDAO dao = new WeatherDAO();
	ArrayList<WeatherDTO> weatherlist = dao.selectAllWeather();
%>
	
	
	<div class="main">
		<input type="radio" id="tab-1" name="show" checked /> 
		<input type="radio" id="tab-2" name="show" /> 
		<input type="radio" id="tab-3" name="show" /> 
		<input type="radio" id="tab-4" name="show" />
		<input type="radio" id="tab-5" name="show" />
		<input type="radio" id="tab-6" name="show" />
		<input type="radio" id="tab-7" name="show" />
		<input type="radio" id="tab-8" name="show" />
		
		<div class="tab">
			<label for="tab-1">서울 </label>
			<label for="tab-2">광주 </label>
			<label for="tab-3">부산 </label> 
			<label for="tab-4">창원 </label> 
			<label for="tab-5">인천 </label>
			<label for="tab-6">대전 </label>
			<label for="tab-7">대구 </label>
			<label for="tab-8">수원</label>
		</div>
		
		
		<div class="team_content">
			<div class="content-dis">
			<div class="Seoul">
				<table id="weather" class="weatherdata">
				<thead>
					<tr>
						<th>
							<%
							for (int i = 0; i < 7; i++) {
								
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
						for (int i = 0; i < 7; i++) {
							out.print("<td>" + weatherlist.get(i).getTemp() + "&#8451</td>");
						}
						%>

					</tr>
					<tr>
						<th>습도</th>
						<%
						for (int i = 0; i < 7; i++) {
							out.print("<td>" + weatherlist.get(i).getHumidity() + "%</td>");
						}
						%>
					</tr>
					<tr>
						<th>강수확률</th>
						<%
						for (int i = 0; i < 7; i++) {
							out.print("<td>" + weatherlist.get(i).getRainprob() + "%</td>");
						}
						%>
					</tr>

				</tbody>
				</table>			
			</div>
			
			</div>
			<div class="content-dis">
				<div class="Gwangju">
				<table id="weather" class="weatherdata">
				<thead>
					<tr>
						<th>
							<%
							for (int i = 7; i < 14; i++) {
								
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
						<th>예보(&#8451)</th>
						<%
						for (int i = 7; i < 14; i++) {
							out.print("<td>" + weatherlist.get(i).getTemp() + "&#8451</td>");
						}
						%>

					</tr>
					<tr>
						<th>습도</th>
						<%
						for (int i = 7; i < 14; i++) {
							out.print("<td>" + weatherlist.get(i).getHumidity() + "%</td>");
						}
						%>
					</tr>
					<tr>
						<th>강수확률</th>
						<%
						for (int i = 7; i < 14; i++) {
							out.print("<td>" + weatherlist.get(i).getRainprob() + "%</td>");
						}
						%>
					</tr>

				</tbody>
				</table>			
				</div>

			</div>
			
			<div class="content-dis">
				<div class="Busan">
				<table id="weather" class="weatherdata">
				<thead>
					<tr>
						<th>
							<%
							for (int i = 14; i < 21; i++) {
								
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
						<th>예보(&#8451)</th>
						<%
						for (int i = 14; i < 21; i++) {
							out.print("<td>" + weatherlist.get(i).getTemp() + "&#8451</td>");
						}
						%>

					</tr>
					<tr>
						<th>습도</th>
						<%
						for (int i = 14; i < 21; i++) {
							out.print("<td>" + weatherlist.get(i).getHumidity() + "%</td>");
						}
						%>
					</tr>
					<tr>
						<th>강수확률</th>
						<%
						for (int i = 14; i < 21; i++) {
							out.print("<td>" + weatherlist.get(i).getRainprob() + "%</td>");
						}
						%>
					</tr>

				</tbody>
				</table>			
				</div>
			
			</div>
			<div class="content-dis">
				<div class="Changwon">
				<table id="weather" class="weatherdata">
				<thead>
					<tr>
						<th>
							<%
							for (int i = 21; i < 28; i++) {
								
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
						<th>예보(&#8451)</th>
						<%
						for (int i = 21; i < 28; i++) {
							out.print("<td>" + weatherlist.get(i).getTemp() + "&#8451</td>");
						}
						%>

					</tr>
					<tr>
						<th>습도</th>
						<%
						for (int i = 21; i < 28; i++) {
							out.print("<td>" + weatherlist.get(i).getHumidity() + "%</td>");
						}
						%>
					</tr>
					<tr>
						<th>강수확률</th>
						<%
						for (int i = 21; i < 28; i++) {
							out.print("<td>" + weatherlist.get(i).getRainprob() + "%</td>");
						}
						%>
					</tr>

				</tbody>
				</table>			
				</div>
			
			</div>
			<div class="content-dis">
				<div class="Incheon">
				<table id="weather" class="weatherdata">
				<thead>
					<tr>
						<th>
							<%
							for (int i = 28; i < 35; i++) {
								
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
						<th>예보(&#8451)</th>
						<%
						for (int i = 28; i < 35; i++) {
							out.print("<td>" + weatherlist.get(i).getTemp() + "&#8451</td>");
						}
						%>

					</tr>
					<tr>
						<th>습도</th>
						<%
						for (int i = 28; i < 35; i++) {
							out.print("<td>" + weatherlist.get(i).getHumidity() + "%</td>");
						}
						%>
					</tr>
					<tr>
						<th>강수확률</th>
						<%
						for (int i = 28; i < 35; i++) {
							out.print("<td>" + weatherlist.get(i).getRainprob() + "%</td>");
						}
						%>
					</tr>

				</tbody>
				</table>			
				</div>
			
			</div>
			<div class="content-dis">
				<div class="Daejeon">
				<table id="weather" class="weatherdata">
				<thead>
					<tr>
						<th>
							<%
							for (int i = 35; i < 42; i++) {
								
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
						<th>예보(&#8451)</th>
						<%
						for (int i = 35; i < 42; i++) {
							out.print("<td>" + weatherlist.get(i).getTemp() + "&#8451</td>");
						}
						%>

					</tr>
					<tr>
						<th>습도</th>
						<%
						for (int i = 35; i < 42; i++) {
							out.print("<td>" + weatherlist.get(i).getHumidity() + "%</td>");
						}
						%>
					</tr>
					<tr>
						<th>강수확률</th>
						<%
						for (int i = 35; i < 42; i++) {
							out.print("<td>" + weatherlist.get(i).getRainprob() + "%</td>");
						}
						%>
					</tr>

				</tbody>
				</table>			
				</div>
			
			</div>
			<div class="content-dis">
				<div class="Daegu">
				<table id="weather" class="weatherdata">
				<thead>
					<tr>
						<th>
							<%
							for (int i = 42; i < 49; i++) {
								
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
						<th>예보(&#8451)</th>
						<%
						for (int i = 42; i < 49; i++) {
							out.print("<td>" + weatherlist.get(i).getTemp() + "&#8451</td>");
						}
						%>

					</tr>
					<tr>
						<th>습도</th>
						<%
						for (int i = 42; i < 49; i++) {
							out.print("<td>" + weatherlist.get(i).getHumidity() + "%</td>");
						}
						%>
					</tr>
					<tr>
						<th>강수확률</th>
						<%
						for (int i = 42; i < 49; i++) {
							out.print("<td>" + weatherlist.get(i).getRainprob() + "%</td>");
						}
						%>
					</tr>

				</tbody>
				</table>			
				</div>
			
			</div>
			<div class="content-dis">
				<div class="Suwon">
				<table id="weather" class="weatherdata">
				<thead>
					<tr>
						<th>
							<%
							for (int i = 49; i < 56; i++) {
								
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
						<th>예보(&#8451)</th>
						<%
						for (int i = 49; i < 56; i++) {
							out.print("<td>" + weatherlist.get(i).getTemp() + "&#8451</td>");
						}
						%>

					</tr>
					<tr>
						<th>습도</th>
						<%
						for (int i = 49; i < 56; i++) {
							out.print("<td>" + weatherlist.get(i).getHumidity() + "%</td>");
						}
						%>
					</tr>
					<tr>
						<th>강수확률</th>
						<%
						for (int i = 49; i < 56; i++) {
							out.print("<td>" + weatherlist.get(i).getRainprob() + "%</td>");
						}
						%>
					</tr>

				</tbody>
				</table>
							
				</div>
			
			</div>
			<p> * 위 날씨는 평균 경기 시간인 6시 기준으로 불러온 데이터 입니다 </p>

		</div>
	</div>
</body>
</html>