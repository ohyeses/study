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
<link rel="stylesheet" href="team.css" />
<noscript>
   <link rel="stylesheet" href="assets/css/noscript.css" />
</noscript>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/data.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/accessibility.js"></script>

</head>
<body class="landing is-preload">
   <!-- Page Wrapper -->
   <div id="page-wrapper">

      <!-- Header -->
      <%@ include file="header.jsp"%>
		<div class="main">
			<input type="radio" id="tab-1" name="show" checked /> 
			<input type="radio" id="tab-2" name="show" /> 
			<input type="radio" id="tab-3" name="show" />
			<input type="radio" id="tab-4" name="show" /> 
			<input type="radio" id="tab-5" name="show" /> 
			<input type="radio" id="tab-6" name="show" /> 
			<input type="radio" id="tab-7" name="show" /> 
			<input type="radio" id="tab-8" name="show" /> 
			<input type="radio" id="tab-9" name="show" /> 
			<input type="radio" id="tab-10" name="show" />
	
	         <div class="tab">
	            <label for="tab-1" onclick = "currentSlide(1)">NC 다이노스 </label>
	            <label for="tab-2" onclick = "currentSlide(4)">두산 베어스</label>
	            <label for="tab-3" onclick = "currentSlide(7)">KT 위즈</label>
	            <label for="tab-4" onclick = "currentSlide(10)">LG 트윈스 </label> 
	            <label for="tab-5" onclick = "currentSlide(13)">KIA 타이거즈</label>
	            <label for="tab-6" onclick = "currentSlide(16)">롯데 자이언츠</label>
	            <label for="tab-7" onclick = "currentSlide(19)">삼성 라이온즈</label>
	            <label for="tab-8" onclick = "currentSlide(22)">SSG 랜더스</label> 
	            <label for="tab-9" onclick = "currentSlide(25)">한화 이글스</label>
	            <label for="tab-10" onclick = "currentSlide(28)">키움 히어로즈</label>
	         </div>
			<div class = "team_content">
				<div class = "content-dis" >
					<div class = "NC">
					<div class = "slideshow-container">
					    <div class="mySlides fade">
							<figure class="highcharts-figure">
		                     <div id="container1"></div>
		                     <p class="highcharts-description">위 그래프를 통해, NC 다이노스는 섭씨
		                        20-25도 일 때 우수한 성적을 거둔 것을 알 수 있습니다.</p>
		
		                     <table id="datatable1" class="teamdata" style="display: none;">
		                        <thead>
		                           <tr>
		                              <th></th>
		                              <th>loose</th>
		                              <th>win</th>
		                           </tr>
		                        </thead>
		                        <tbody>
		                           <tr>
		                              <th>5~10</th>
		                              <td>14</td>
		                              <td>7</td>
		                           </tr>
		                           <tr>
		                              <th>10~15</th>
		                              <td>42</td>
		                              <td>35</td>
		                           </tr>
		                           <tr>
		                              <th>15~20</th>
		                              <td>85</td>
		                              <td>111</td>
		                           </tr>
		                           <tr>
		                              <th>20~25</th>
		                              <td>196</td>
		                              <td>186</td>
		                           </tr>
		                           <tr>
		                              <th>25~30</th>
		                              <td>96</td>
		                              <td>126</td>
		                           </tr>
		                           <tr>
		                              <th>30~35</th>
		                              <td>36</td>
		                              <td>33</td>
		                           </tr>
		
		                        </tbody>
		                     </table>
	                  		</figure>
				
						</div>
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_h_nc"></div>
									<p class="highcharts-description">
										습도를 0에서 100까지 5구간으로 나눴을 때 NC 다이노스의 홈런 빈도수는 1~2개를 기록했다. <br>
										추가적으로, 습도가 평균 (40~60℃) 이거나 그 이상 (60~80℃) 일 때 NC의 홈런 빈도수가 전반적으로
										높았으며, 반대로, 습도가 낮을 때 (0~20℃)는 홈런빈도 수가 다른 습도에 비해 낮게 기록됐다.
									</p>
							</figure>
						</div>
						<div class="mySlides fade">
							<figure class="highcharts-figure">
							<div id="container_t_nc"></div>
							<p class="highcharts-description">
								온도를 5에서 45까지 4구간으로 나눴을 때 NC 다이노스의 홈런빈도수는 1~2개를 기록했다. <br>
								추가적으로, 온도가 16~24℃ 이거나 25~34℃ 일 때 온도의 홈런 빈도수가 전반적으로 높았으며, <br>
								반대로, 온도가 높거나 (35~45℃) 낮을 때 (0~15℃)는 홈런 빈도수가 다른 온도에 비해 낮게 기록됐다.
					        </p>
					        </figure>
						</div>
				
						<a class="prev" onclick="plusSlides(-1)">&#10094;</a>
						<a class="next" onclick="plusSlides(1)">&#10095;</a>
						
					</div>
					<br>
			
				</div>
				</div>
			
				<div class = "content-dis">
					<div class = "DS">
					<div class = "slideshow-container">
					    <div class="mySlides fade">
							<figure class="highcharts-figure">
		                     <div id="container2"></div>
		                     <p class="highcharts-description">
		                     위 그래프를 통해, 두산 베어스는 섭씨 20 - 25도 일 때 승률이 높았으며 기온이 낮을 때(5-10)
		                      성적이 저조한 것으로 보인다.</p>

		                     <table id="datatable2" class="teamdata" style="display: none;">
		                        <thead>
		                           <tr>
		                              <th></th>
		                              <th>loose</th>
		                              <th>win</th>
		                           </tr>
		                        </thead>
		                        <tbody>
		                           <tr>
		                              <th>5~10</th>
		                              <td>14</td>
		                              <td>21</td>
		                           </tr>
		                           <tr>
		                              <th>10~15</th>
		                              <td>32</td>
		                              <td>41</td>
		                           </tr>
		                           <tr>
		                              <th>15~20</th>
		                              <td>82</td>
		                              <td>117</td>
		                           </tr>
		                           <tr>
		                              <th>20~25</th>
		                              <td>147</td>
		                              <td>224</td>
		                           </tr>
		                           <tr>
		                              <th>25~30</th>
		                              <td>174</td>
		                              <td>193</td>
		                           </tr>
		                           <tr>
		                              <th>30~35</th>
		                              <td>24</td>
		                              <td>46</td>
		                           </tr>
		                           <tr>
		                              <th>35~40</th>
		                              <td>0</td>
		                              <td>4</td>
		                           </tr>
		
		                        </tbody>
		                     	</table>
		                  </figure>
				
						</div>
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_h_ds"></div>
								<p class="highcharts-description">
									습도를 0에서 100까지 5구간으로 나눴을 때 두산 베어스의 홈런 빈도수는 1~2개를 기록했다. <br>
									추가적으로, 습도가 평균 (40~60℃) 이거나 그 이상 (60~80℃) 일 때 두산의 홈런 빈도수가 전반적으로
									높았으며, 반대로, 습도가 낮을 때 (0~20℃)는 홈런빈도 수가 다른 습도에 비해 낮게
									기록됐다.
								</p>
							</figure>
						</div>
						
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_t_ds"></div>
									<p class="highcharts-description">
									온도를 5에서 45까지 4구간으로 나눴을 때 두산 베어스의 홈런빈도수는 1~2개를 기록했다. <br>
									추가적으로, 온도가 16~24℃ 이거나 25~34℃ 일 때 온도의 홈런 빈도수가 전반적으로 높았으며, <br>
									반대로, 온도가 높거나 (35~45℃) 낮을 때 (0~15℃)는 홈런 빈도수가 다른 온도에 비해 낮게 기록됐다.
									</p>
							</figure>
						</div>
				
						<a class="prev" onclick="plusSlides(-1)">&#10094;</a>
						<a class="next" onclick="plusSlides(1)">&#10095;</a>
						
					</div>
					<br>
					
				</div>
			</div>
			<!-- KT -->
			<div class = "content-dis">
					<div class = "KT">
					<div class = "slideshow-container">
					    <div class="mySlides fade">
							<figure class="highcharts-figure">
		                     <div id="container3"></div>
		                     <p class="highcharts-description">
		                     위 그래프를 통해, 두산 베어스는 섭씨 20 - 25도 일 때 승률이 높았으며 기온이 낮을 때(5-10)
		                      성적이 저조한 것으로 보인다.</p>
									<table id="datatable3" class="teamdata" style="display: none;">
										<thead>
											<tr>
												<th></th>
												<th>loose</th>
												<th>win</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<th>6~10</th>
												<td>13</td>
												<td>7</td>
											</tr>
											<tr>
												<th>10~15</th>
												<td>27</td>
												<td>19</td>
											</tr>
											<tr>
												<th>15~20</th>
												<td>72</td>
												<td>46</td>
											</tr>
											<tr>
												<th>20~25</th>
												<td>156</td>
												<td>97</td>
											</tr>
											<tr>
												<th>25~30</th>
												<td>112</td>
												<td>93</td>
											</tr>
											<tr>
												<th>30~35</th>
												<td>33</td>
												<td>16</td>
											</tr>
											<tr>
												<th>35~40</th>
												<td>2</td>
												<td>0</td>
											</tr>

										</tbody>
									</table>
								</figure>
				
						</div>
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_h_kt"></div>
			                     <p class="highcharts-description">
			                        습도를 0에서 100까지 5구간으로 나눴을 때 KT 위즈의 홈런 빈도수는 1~2개를 기록했다. <br>
			                        추가적으로, 습도가 평균 (40~60℃) 이거나 그 이상 (60~80℃) 일 때 KT의 홈런 빈도수가 전반적으로
			                        높았으며,반대로, 습도가 낮을 때 (0~20℃)는 홈런빈도 수가 다른 습도에 비해 낮게
			                        기록됐다.
			
			                     </p>
							</figure>
						</div>
						
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_t_kt"></div>
								<p class="highcharts-description">
									온도를 5에서 45까지 4구간으로 나눴을 때 KT 위즈의 홈런빈도수는 1~2개를 기록했다. <br>
									추가적으로, 온도가 16~24℃ 이거나 25~34℃ 일 때 온도의 홈런 빈도수가 전반적으로 높았으며, <br>
									반대로, 온도가 높거나 (35~45℃) 낮을 때 (0~15℃)는 홈런 빈도수가 다른 온도에 비해 낮게 기록됐다.
								</p>
							</figure>
						</div>
				
						<a class="prev" onclick="plusSlides(-1)">&#10094;</a>
						<a class="next" onclick="plusSlides(1)">&#10095;</a>
						
					</div>
					<br>
					
				</div>
			</div>
			<!-- LG -->
			<div class = "content-dis">
					<div class = "LG">
					<div class = "slideshow-container">
					    <div class="mySlides fade">
							<figure class="highcharts-figure">
		                     <div id="container4"></div>
		                     <p class="highcharts-description">
		                     위 그래프를 통해, 두산 베어스는 섭씨 20 - 25도 일 때 승률이 높았으며 기온이 낮을 때(5-10)
		                      성적이 저조한 것으로 보인다.</p>
									<table id="datatable4" class="teamdata" style="display: none;">
										<thead>
											<tr>
												<th></th>
												<th>loose</th>
												<th>win</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<th>5~10</th>
												<td>9</td>
												<td>9</td>
											</tr>
											<tr>
												<th>10~15</th>
												<td>40</td>
												<td>39</td>
											</tr>
											<tr>
												<th>15~20</th>
												<td>113</td>
												<td>94</td>
											</tr>
											<tr>
												<th>20~25</th>
												<td>176</td>
												<td>176</td>
											</tr>
											<tr>
												<th>25~30</th>
												<td>168</td>
												<td>185</td>
											</tr>
											<tr>
												<th>30~35</th>
												<td>44</td>
												<td>42</td>
											</tr>
											<tr>
												<th>35~40</th>
												<td>2</td>
												<td>0</td>
											</tr>

										</tbody>
									</table>
								</figure>
				
						</div>
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_h_lg"></div>
								<p class="highcharts-description">
									습도를 0에서 100까지 5구간으로 나눴을 때 LG 트윈스의 홈런 빈도수는 1~2개를 기록했다. <br>
									추가적으로, 습도가 평균 (40~60℃) 이거나 그 이상 (60~80℃) 일 때 LG의 홈런 빈도수가 전반적으로
									높았으며, <br> 반대로, 습도가 낮을 때 (0~20℃)는 홈런빈도 수가 다른 습도에 비해 낮게
									기록됐다.
								</p>
							</figure>
						</div>
						
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_t_lg"></div>
								<p class="highcharts-description">
									온도를 5에서 45까지 4구간으로 나눴을 때 LG 트윈스의 홈런빈도수는 1~2개를 기록했다. <br>
									추가적으로, 온도가 16~24℃ 이거나 25~34℃ 일 때 온도의 홈런 빈도수가 전반적으로 높았으며, <br>
									반대로, 온도가 높거나 (35~45℃) 낮을 때 (0~15℃)는 홈런 빈도수가 다른 온도에 비해 낮게 기록됐다.
								</p>
							</figure>
						</div>
				
						<a class="prev" onclick="plusSlides(-1)">&#10094;</a>
						<a class="next" onclick="plusSlides(1)">&#10095;</a>
						
					</div>
					<br>
					
				</div>
			</div>
			
			<!-- LG -->
			<div class = "content-dis">
					<div class = "KIA">
					<div class = "slideshow-container">
					    <div class="mySlides fade">
							<figure class="highcharts-figure">
		                     <div id="container5"></div>
		                     <p class="highcharts-description">
		                     위 그래프를 통해, 두산 베어스는 섭씨 20 - 25도 일 때 승률이 높았으며 기온이 낮을 때(5-10)
		                      성적이 저조한 것으로 보인다.</p>
									<table id="datatable5" class="teamdata" style="display: none;">
										<thead>
											<tr>
												<th></th>
												<th>loose</th>
												<th>win</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<th>5~10</th>
												<td>14</td>
												<td>14</td>
											</tr>
											<tr>
												<th>10~15</th>
												<td>25</td>
												<td>32</td>
											</tr>
											<tr>
												<th>15~20</th>
												<td>97</td>
												<td>84</td>
											</tr>
											<tr>
												<th>20~25</th>
												<td>208</td>
												<td>176</td>
											</tr>
											<tr>
												<th>25~30</th>
												<td>183</td>
												<td>163</td>
											</tr>
											<tr>
												<th>30~35</th>
												<td>39</td>
												<td>47</td>
											</tr>


										</tbody>
									</table>
								</figure>
				
						</div>
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_h_kia"></div>
									<p class="highcharts-description">
										습도를 0에서 100까지 5구간으로 나눴을 때 KIA 타이거즈의 홈런 빈도수는 1~2개를 기록했다. <br>
										추가적으로, 습도가 평균 (40~60℃) 이거나 그 이상 (60~80℃) 일 때 기아의 홈런 빈도수가 전반적으로
										높았으며, 반대로, 습도가 낮을 때 (0~20℃)는 홈런빈도 수가 다른 습도에 비해 낮게
										기록됐다.
									</p>
							</figure>
						</div>
						
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_t_kia"></div>
									<p class="highcharts-description">
										온도를 5에서 45까지 4구간으로 나눴을 때 KIA 타이거즈의 홈런빈도수는 1~2개를 기록했다. <br>
										추가적으로, 온도가 16~24℃ 이거나 25~34℃ 일 때 온도의 홈런 빈도수가 전반적으로 높았으며, <br>
										반대로, 온도가 낮을 때 (0~15℃)는 홈런 빈도수가 다른 온도에 비해 낮게 기록됐고, <br>
										온도가 높을 때(35~45℃)는 홈런 수가 거의 없음을 보여준다.

									</p>
							</figure>
						</div>
				
						<a class="prev" onclick="plusSlides(-1)">&#10094;</a>
						<a class="next" onclick="plusSlides(1)">&#10095;</a>
						
					</div>
					<br>
				
				</div>
			</div>
			<!-- Lotte -->
			<div class = "content-dis">
					<div class = "Lotte">
					<div class = "slideshow-container">
					    <div class="mySlides fade">
							<figure class="highcharts-figure">
		                     <div id="container6"></div>
		                     <p class="highcharts-description">
		                     위 그래프를 통해, 두산 베어스는 섭씨 20 - 25도 일 때 승률이 높았으며 기온이 낮을 때(5-10)
		                      성적이 저조한 것으로 보인다.</p>
									<table id="datatable6" class="teamdata" style="display: none;">
										<thead>
											<tr>
												<th></th>
												<th>loose</th>
												<th>win</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<th>5~10</th>
												<td>12</td>
												<td>12</td>
											</tr>
											<tr>
												<th>10~15</th>
												<td>41</td>
												<td>38</td>
											</tr>
											<tr>
												<th>15~20</th>
												<td>113</td>
												<td>115</td>
											</tr>
											<tr>
												<th>20~25</th>
												<td>217</td>
												<td>196</td>
											</tr>
											<tr>
												<th>25~30</th>
												<td>160</td>
												<td>125</td>
											</tr>
											<tr>
												<th>30~35</th>
												<td>21</td>
												<td>29</td>
											</tr>


										</tbody>
									</table>
								</figure>
				
						</div>
						<div class="mySlides fade">
							<figure class="highcharts-figure">
									<div id="container_h_lotte"></div>
									<p class="highcharts-description">
										습도를 0에서 100까지 5구간으로 나눴을 때 롯데 자이언츠의 홈런 빈도수는 1~2개를 기록했다. <br>
										추가적으로, 습도가 평균 (40~60℃) 이거나 그 이상 (60~80℃) 일 때 롯데의 홈런 빈도수가 전반적으로
										높았으며, 반대로, 습도가 낮을 때 (0~20℃)는 홈런빈도 수가 다른 습도에 비해 낮게
										기록됐다.
									</p>
							</figure>
						</div>
						
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_t_lotte"></div>
									<p class="highcharts-description">
										온도를 5에서 45까지 4구간으로 나눴을 때 롯데 자이언츠의 홈런빈도수는 1~2개를 기록했다. <br>
										추가적으로, 온도가 16~24℃ 이거나 25~34℃ 일 때 온도의 홈런 빈도수가 전반적으로 높았으며, 
										반대로, 온도가 낮을 때 (0~15℃)는 홈런 빈도수가 다른 온도에 비해 낮게 기록됐고,
										온도가 높을 때(35~45℃)는 홈런 수가 거의 없음을 보여준다.
									</p>
							</figure>
						</div>
				
						<a class="prev" onclick="plusSlides(-1)">&#10094;</a>
						<a class="next" onclick="plusSlides(1)">&#10095;</a>
						
					</div>
					<br>
				
				</div>
			</div>
			
			<!-- SS -->
			<div class = "content-dis">
					<div class = "SS">
					<div class = "slideshow-container">
					    <div class="mySlides fade">
							<figure class="highcharts-figure">
		                     <div id="container7"></div>
		                     <p class="highcharts-description">
		                     위 그래프를 통해, 두산 베어스는 섭씨 20 - 25도 일 때 승률이 높았으며 기온이 낮을 때(5-10)
		                      성적이 저조한 것으로 보인다.</p>
									<table id="datatable7" class="teamdata" style="display: none;">
										<thead>
											<tr>
												<th></th>
												<th>loose</th>
												<th>win</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<th>5~10</th>
												<td>10</td>
												<td>9</td>
											</tr>
											<tr>
												<th>10~15</th>
												<td>37</td>
												<td>31</td>
											</tr>
											<tr>
												<th>15~20</th>
												<td>84</td>
												<td>87</td>
											</tr>
											<tr>
												<th>20~25</th>
												<td>161</td>
												<td>195</td>
											</tr>
											<tr>
												<th>25~30</th>
												<td>170</td>
												<td>182</td>
											</tr>
											<tr>
												<th>30~35</th>
												<td>51</td>
												<td>61</td>
											</tr>
											<tr>
												<th>35~40</th>
												<td>2</td>
												<td>0</td>
											</tr>


										</tbody>
									</table>
							</figure>
				
						</div>
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_h_ss"></div>
									<p class="highcharts-description">
										습도를 0에서 100까지 5구간으로 나눴을 때 삼성 라이온즈의 홈런 빈도수는 1~2개를 기록했다. <br>
										추가적으로, 습도가 평균 (40~60℃) 이거나 그 이상 (60~80℃) 일 때 삼성의 홈런 빈도수가 전반적으로
										높았으며, 반대로, 습도가 낮을 때 (0~20℃)는 홈런빈도 수가 다른 습도에 비해 낮게
										기록됐다.
									</p>
							</figure>
						</div>
						
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_t_ss"></div>
									<p class="highcharts-description">
										온도를 5에서 45까지 4구간으로 나눴을 때 삼성 라이온즈의 홈런빈도수는 1~2개를 기록했다. <br>
										추가적으로, 온도가 16~24℃ 이거나 25~34℃ 일 때 온도의 홈런 빈도수가 전반적으로 높았으며, 
										반대로, 온도가 낮을 때 (0~15℃)는 홈런 빈도수가 다른 온도에 비해 낮게 기록됐고, 
										온도가 높을 때(35~45℃)는 홈런 수가 거의 없음을 보여준다.
									</p>
							</figure>
						</div>
				
						<a class="prev" onclick="plusSlides(-1)">&#10094;</a>
						<a class="next" onclick="plusSlides(1)">&#10095;</a>
						
					</div>
					<br>
			
				</div>
			</div>
			
			<!-- SSG -->
			<div class = "content-dis">
					<div class = "SSG">
					<div class = "slideshow-container">
					    <div class="mySlides fade">
							<figure class="highcharts-figure">
		                     <div id="container8"></div>
		                     <p class="highcharts-description">
		                     위 그래프를 통해, 두산 베어스는 섭씨 20 - 25도 일 때 승률이 높았으며 기온이 낮을 때(5-10)
		                      성적이 저조한 것으로 보인다.</p>
									<table id="datatable8" class="teamdata" style="display: none;">
										<thead>
											<tr>
												<th></th>
												<th>loose</th>
												<th>win</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<th>5~10</th>
												<td>17</td>
												<td>34</td>
											</tr>
											<tr>
												<th>10~15</th>
												<td>43</td>
												<td>51</td>
											</tr>
											<tr>
												<th>15~20</th>
												<td>86</td>
												<td>90</td>
											</tr>
											<tr>
												<th>20~25</th>
												<td>197</td>
												<td>209</td>
											</tr>
											<tr>
												<th>25~30</th>
												<td>145</td>
												<td>150</td>
											</tr>
											<tr>
												<th>30~35</th>
												<td>36</td>
												<td>35</td>
											</tr>


										</tbody>
									</table>
								</figure>
						</div>
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_h_ssg"></div>
									<p class="highcharts-description">
										습도를 0에서 100까지 5구간으로 나눴을 때 SSG 랜더스의 홈런 빈도수는 1~2개를 기록했다. <br>
										추가적으로, 습도가 평균 (40~60℃) 이거나 그 이상 (60~80℃) 일 때 SSG 랜더스의 홈런 빈도수가
										전반적으로 높았으며, 반대로, 습도가 낮을 때 (0~20℃)는 홈런빈도 수가 다른 습도에 비해
										낮게 기록됐다.
									</p>
							</figure>
						</div>
						
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_t_ssg"></div>
									<p class="highcharts-description">
										온도를 5에서 45까지 4구간으로 나눴을 때 SSG 랜더스의 홈런빈도수는 1~2개를 기록했다. <br>
										추가적으로, 온도가 16~24℃ 이거나 25~34℃ 일 때 온도의 홈런 빈도수가 전반적으로 높았으며, 
										반대로, 온도가 낮을 때 (0~15℃)는 홈런 빈도수가 다른 온도에 비해 낮게 기록됐고,
										온도가 높을 때(35~45℃)는 홈런 수가 거의 없음을 보여준다.
									</p>
							</figure>
						</div>
				
						<a class="prev" onclick="plusSlides(-1)">&#10094;</a>
						<a class="next" onclick="plusSlides(1)">&#10095;</a>
						
					</div>
					<br>
			
				</div>
			</div>
			
			<!-- HW -->
			<div class = "content-dis">
					<div class = "HW">
					<div class = "slideshow-container">
					    <div class="mySlides fade">
							<figure class="highcharts-figure">
		                     <div id="container9"></div>
		                     <p class="highcharts-description">
		                     위 그래프를 통해, 두산 베어스는 섭씨 20 - 25도 일 때 승률이 높았으며 기온이 낮을 때(5-10)
		                      성적이 저조한 것으로 보인다.</p>
									<table id="datatable9" class="teamdata" style="display: none;">
										<thead>
											<tr>
												<th></th>
												<th>loose</th>
												<th>win</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<th>5~10</th>
												<td>20</td>
												<td>6</td>
											</tr>
											<tr>
												<th>10~15</th>
												<td>33</td>
												<td>23</td>
											</tr>
											<tr>
												<th>15~20</th>
												<td>92</td>
												<td>79</td>
											</tr>
											<tr>
												<th>20~25</th>
												<td>202</td>
												<td>161</td>
											</tr>
											<tr>
												<th>25~30</th>
												<td>207</td>
												<td>158</td>
											</tr>
											<tr>
												<th>30~35</th>
												<td>59</td>
												<td>38</td>
											</tr>
											<tr>
												<th>35~40</th>
												<td>0</td>
												<td>2</td>
											</tr>


										</tbody>
									</table>
								</figure>
						</div>
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_h_hw"></div>
									<p class="highcharts-description">
										습도를 0에서 100까지 5구간으로 나눴을 때 한화 이글스의 홈런 빈도수는 1~2개를 기록했다. <br>
										추가적으로, 습도가 평균 (40~60℃) 이거나 그 이상 (60~80℃) 일 때 한화의 홈런 빈도수가 전반적으로
										높았으며, 반대로, 습도가 낮을 때 (0~20℃)는 홈런빈도 수가 다른 습도에 비해 낮게
										기록됐다.
									</p>
							</figure>
						</div>
						
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_t_hw"></div>
									<p class="highcharts-description">
										온도를 5에서 45까지 4구간으로 나눴을 때 한화 이글스의 홈런빈도수는 1~2개를 기록했다. <br>
										추가적으로, 온도가 16~24℃ 이거나 25~34℃ 일 때 온도의 홈런 빈도수가 전반적으로 높았으며, 
										반대로, 온도가 낮을 때 (0~15℃)는 홈런 빈도수가 다른 온도에 비해 낮게 기록됐고,
										온도가 높을 때(35~45℃)는 홈런 수가 거의 없음을 보여준다.
									</p>
							</figure>
						</div>
				
						<a class="prev" onclick="plusSlides(-1)">&#10094;</a>
						<a class="next" onclick="plusSlides(1)">&#10095;</a>
						
					</div>
					<br>
			
				</div>
			</div>
			
			<!-- KW -->
			<div class = "content-dis">
					<div class = "KW">
					<div class = "slideshow-container">
					    <div class="mySlides fade">
							<figure class="highcharts-figure">
		                     <div id="container10"></div>
		                     <p class="highcharts-description">
		                     위 그래프를 통해, 두산 베어스는 섭씨 20 - 25도 일 때 승률이 높았으며 기온이 낮을 때(5-10)
		                      성적이 저조한 것으로 보인다.</p>
									<table id="datatable10" class="teamdata" style="display: none;">
										<thead>
											<tr>
												<th></th>
												<th>loose</th>
												<th>win</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<th>5~10</th>
												<td>13</td>
												<td>17</td>
											</tr>
											<tr>
												<th>10~15</th>
												<td>31</td>
												<td>42</td>
											</tr>
											<tr>
												<th>15~20</th>
												<td>97</td>
												<td>98</td>
											</tr>
											<tr>
												<th>20~25</th>
												<td>163</td>
												<td>203</td>
											</tr>
											<tr>
												<th>25~30</th>
												<td>157</td>
												<td>197</td>
											</tr>
											<tr>
												<th>30~35</th>
												<td>47</td>
												<td>45</td>
											</tr>

										</tbody>
									</table>
								</figure>
						</div>
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_h_kw"></div>
									<p class="highcharts-description">
										습도를 0에서 100까지 5구간으로 나눴을 때 키움 히어로즈의 홈런 빈도수는 1~2개를 기록했다. <br>
										추가적으로, 습도가 평균 (40~60℃) 이거나 그 이상 (60~80℃) 일 때 키움의 홈런 빈도수가 전반적으로
										높았으며, 반대로, 습도가 낮을 때 (0~20℃)는 홈런빈도 수가 다른 습도에 비해 낮게
										기록됐다.

									</p>
							</figure>
						</div>
						
						<div class="mySlides fade">
							<figure class="highcharts-figure">
								<div id="container_t_kw"></div>
									<p class="highcharts-description">
										온도를 5에서 45까지 4구간으로 나눴을 때 키움 히어로즈의 홈런빈도수는 1~2개를 기록했다. <br>
										추가적으로, 온도가 16~24℃ 이거나 25~34℃ 일 때 온도의 홈런 빈도수가 전반적으로 높았으며, <br>
										반대로, 온도가 낮을 때 (0~15℃)는 홈런 빈도수가 다른 온도에 비해 낮게 기록됐고,
										온도가 높을 때(35~45℃)는 홈런 수가 거의 없음을 보여준다.
									</p>
							</figure>
						</div>
				
						<a class="prev" onclick="plusSlides(-1)">&#10094;</a>
						<a class="next" onclick="plusSlides(1)">&#10095;</a>
						
					</div>
					<br>
				
				</div>
			</div>
		</div>
		
		
		
		
		<!-- Footer -->
	      <footer>
	         <%@ include file="footer.jsp"%>
	      </footer>
	</div>
	<script>
		var slideIndex = 1;
		showSlides(slideIndex);
	
		function plusSlides(n) {
		  showSlides(slideIndex += n);
		}
	
		function currentSlide(n) {
		  showSlides(slideIndex = n);
		}
	
		function showSlides(n) {		  
		 var slides = document.getElementsByClassName("mySlides");

		  if (n > slides.length) {slideIndex = 1}    
		  if (n < 1) {slideIndex = slides.length}
		  for (i = 0; i < slides.length; i++) {
			  slides[i].style.display = "none";  
		  }
		  
		  slides[slideIndex-1].style.display = "block";  
		}
	</script>
	<script src="assets/js/analysis.js"></script>
	<script src="assets/js/analysis.js"></script>
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/jquery.scrolly.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>
</body>
</html>