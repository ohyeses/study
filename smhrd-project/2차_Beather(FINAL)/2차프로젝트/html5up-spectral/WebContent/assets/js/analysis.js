
      Highcharts.chart('container1', {

         data : {
            table : 'datatable1'
         },
         chart : {
            type : 'column'
         },
         title : {
            text : 'NC 다이노스의 기온변화에 따른 승률'
         },
         yAxis : {
            allowDecimals : false,
            title : {
               text : 'count'
            }
         },
         tooltip : {
            formatter : function() {
               return '<b>' + this.series.name + '</b><br/>'
                     + this.point.y + ' '
                     + this.point.name.toLowerCase();
            }
         }
      });
      
      
 
      Highcharts.chart('container_h_nc', {
           chart: {
             type: 'column'
           },
           title: {
             text: 'NC 다이노스의 습도 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '0-20',
               '21-40',
               '41-60',
               '61-80',
               '81-100',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 빈도수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.001,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [9.0, 31.0, 38.0, 65.0, 22.0]

           }, {
             name: '2',
             data: [6,7,20,28,10]

           }, {
             name: '3',
             data: [1,2,6,3,4]

           }, {
             name: '4',
             data: [0,2,2,4,0]

           },
              {
               name : '5',
               data : [0,1,0,0,1]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,1,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0,0]
             }   
                   ]
         });
      
      
      Highcharts.chart('container_t_nc', {
           chart: {
             type: 'column'
           },
           title: {
             text: 'NC 다이노스의 기온 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '5-15',
               '16-24',
               '25-34',
               '35-45',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [11,77,76,1]

           }, {
             name: '2',
             data: [6,39,25,1]

           }, {
             name: '3',
             data: [1,7,8,0]

           }, {
             name: '4',
             data: [0,3,5,0]

           },
              {
               name : '5',
               data : [1,1,0,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,1,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0]
             }   
                   ]
         });
     
      
      Highcharts.chart('container2', {
         data : {
            table : 'datatable2'
         },
         chart : {
            type : 'column'
         },
         title : {
            text : '두산 베어스의 기온 변화에 따른 승률'
         },
         yAxis : {
            allowDecimals : false,
            title : {
               text : 'count'
            }
         },
         tooltip : {
            formatter : function() {
               return '<b>' + this.series.name + '</b><br/>'
                     + this.point.y + ' '
                     + this.point.name.toLowerCase();
            }
         }
      });
      
      
      Highcharts.chart('container_h_ds', {
           chart: {
             type: 'column'
           },
           title: {
             text: '두산 베어스의 습도 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '0-20',
               '21-40',
               '41-60',
               '61-80',
               '81-100',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [10,36,51,37,20]

           }, {
             name: '2',
             data: [8,10,15,22,7]

           }, {
             name: '3',
             data: [1,4,12,5,2]

           }, {
             name: '4',
             data: [1,1,3,2,2]

           },
              {
               name : '5',
               data : [0,1,2,1,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,1,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0,0]
             }   
                   ]
         });
      

      Highcharts.chart('container_t_ds', {
           chart: {
             type: 'column'
           },
           title: {
             text: '두산 베어스의 기온 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '5-15',
               '16-24',
               '25-34',
               '35-45',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [11,78,64,1]

           }, {
             name: '2',
             data: [1,27,33,1]

           }, {
             name: '3',
             data: [2,9,13,0]

           }, {
             name: '4',
             data: [1,5,3,0]

           },
              {
               name : '5',
               data : [0,4,0,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0]
             }   
                   ]
         });
      
      
      
      
      Highcharts.chart('container3', {
         data : {
            table : 'datatable3'
         },
         chart : {
            type : 'column'
         },
         title : {
            text : 'KT 위즈의 기온변화에 따른 승률'
         },
         yAxis : {
            allowDecimals : false,
            title : {
               text : 'count'
            }
         },
         tooltip : {
            formatter : function() {
               return '<b>' + this.series.name + '</b><br/>'
                     + this.point.y + ' '
                     + this.point.name.toLowerCase();
            }
         }
      });
      
         Highcharts.chart('container_h_kt', {
           chart: {
             type: 'column'
           },
           title: {
             text: 'KT 위즈의 습도 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '0-20',
               '21-40',
               '41-60',
               '61-80',
               '81-100',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [4,18,46,35,11]
         
           }, {
             name: '2',
             data: [2,6,6,8,6]
         
           }, {
             name: '3',
             data: [0,2,3,9,1]
         
           }, {
             name: '4',
             data: [0,2,1,0,1]
         
           },
              {
               name : '5',
               data : [0,0,0,2,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,0,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0,0]
             }   
                   ]
         });
               
      Highcharts.chart('container_t_kt', {
           chart: {
             type: 'column'
           },
           title: {
             text: 'KT 위즈의 기온 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '5-15',
               '16-24',
               '25-34',
               '35-45',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [5,58,50,1]

           }, {
             name: '2',
             data: [1,10,17,0]

           }, {
             name: '3',
             data: [1,8,6,0]

           }, {
             name: '4',
             data: [0,2,2,0]

           },
              {
               name : '5',
               data : [0,0,2,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0]
             }   
                   ]
         });
      
      
      
      
      
      Highcharts.chart('container4', {
         data : {
            table : 'datatable4'
         },
         chart : {
            type : 'column'
         },
         title : {
            text : 'LG 트윈스의 기온변화에 따른 승률'
         },
         yAxis : {
            allowDecimals : false,
            title : {
               text : 'count'
            }
         },
         tooltip : {
            formatter : function() {
               return '<b>' + this.series.name + '</b><br/>'
                     + this.point.y + ' '
                     + this.point.name.toLowerCase();
            }
         }
      });
      
 
      Highcharts.chart('container_h_lg', {
           chart: {
             type: 'column'
           },
           title: {
             text: 'LG 트윈스의 습도 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '0-20',
               '21-40',
               '41-60',
               '61-80',
               '81-100',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [9,27,47,38,11]

           }, {
             name: '2',
             data: [3,7,15,15,1]

           }, {
             name: '3',
             data: [1,2,2,5,1]

           }, {
             name: '4',
             data: [0,1,0,1,0]

           },
              {
               name : '5',
               data : [0,0,0,1,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,0,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0,0]
             }   
                   ]
         });
      

      Highcharts.chart('container_t_lg', {
           chart: {
             type: 'column'
           },
           title: {
             text: 'LG 트윈스의 기온 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '5-15',
               '16-24',
               '25-34',
               '35-45',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [11,53,67,1]

           }, {
             name: '2',
             data: [1,14,24,2]

           }, {
             name: '3',
             data: [1,4,6,0]

           }, {
             name: '4',
             data: [1,1,0,0]

           },
              {
               name : '5',
               data : [0,0,1,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0]
             }   
                   ]
         });
      
      
      
      
      
      
      
      Highcharts.chart('container5', {
         data : {
            table : 'datatable5'
         },
         chart : {
            type : 'column'
         },
         title : {
            text : 'KIA 타이거즈의 기온변화에 따른 승률'
         },
         yAxis : {
            allowDecimals : false,
            title : {
               text : 'count'
            }
         },
         tooltip : {
            formatter : function() {
               return '<b>' + this.series.name + '</b><br/>'
                     + this.point.y + ' '
                     + this.point.name.toLowerCase();
            }
         }
      });
      
      

      Highcharts.chart('container_h_kia', {
           chart: {
             type: 'column'
           },
           title: {
             text: 'KIA 타이거즈의 습도 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '0-20',
               '21-40',
               '41-60',
               '61-80',
               '81-100',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [10,34,58,45,20]

           }, {
             name: '2',
             data: [4,4,20,19,4]

           }, {
             name: '3',
             data: [2,1,7,4,2]

           }, {
             name: '4',
             data: [0,2,1,1,0]

           },
              {
               name : '5',
               data : [0,0,0,1,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,0,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0,0]
             }   
                   ]
         });
      
      Highcharts.chart('container_t_kia', {
           chart: {
             type: 'column'
           },
           title: {
             text: 'KIA 타이거즈의 기온 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '5-15',
               '16-24',
               '25-34',
               '35-45',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [12,63,92,0]

           }, {
             name: '2',
             data: [2,20,29,0]

           }, {
             name: '3',
             data: [1,4,11,0]

           }, {
             name: '4',
             data: [1,1,2,0]

           },
              {
               name : '5',
               data : [0,0,1,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,1,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0]
             }   
                   ]
         });
      
      
      
      Highcharts.chart('container6', {
         data : {
            table : 'datatable6'
         },
         chart : {
            type : 'column'
         },
         title : {
            text : '롯데 자이언츠의 기온변화에 따른 승률'
         },
         yAxis : {
            allowDecimals : false,
            title : {
               text : 'count'
            }
         },
         tooltip : {
            formatter : function() {
               return '<b>' + this.series.name + '</b><br/>'
                     + this.point.y + ' '
                     + this.point.name.toLowerCase();
            }
         }
      });
      
      

      Highcharts.chart('container_h_lotte', {
           chart: {
             type: 'column'
           },
           title: {
             text: '롯데 자이언츠의 습도 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '0-20',
               '21-40',
               '41-60',
               '61-80',
               '81-100',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [8,19,43,69,20]

           }, {
             name: '2',
             data: [0,4,23,26,6]

           }, {
             name: '3',
             data: [0,4,9,1,6]

           }, {
             name: '4',
             data: [0,1,2,3,0]

           },
              {
               name : '5',
               data : [0,0,0,0,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,1,1,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0,0]
             }   
                   ]
         });
      
    
      Highcharts.chart('container_t_lotte', {
           chart: {
             type: 'column'
           },
           title: {
             text: '롯데 자이언츠의 기온 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '5-15',
               '16-24',
               '25-34',
               '35-45',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [12,79,68,0]

           }, {
             name: '2',
             data: [1,39,19,0]

           }, {
             name: '3',
             data: [2,15,3,0]

           }, {
             name: '4',
             data: [1,2,3,0]

           },
              {
               name : '5',
               data : [0,0,0,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,2,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0]
             }   
                   ]
         });
      
      
      Highcharts.chart('container7', {
         data : {
            table : 'datatable7'
         },
         chart : {
            type : 'column'
         },
         title : {
            text : '삼성 라이온즈의 기온변화에 따른 승률'
         },
         yAxis : {
            allowDecimals : false,
            title : {
               text : 'count'
            }
         },
         tooltip : {
            formatter : function() {
               return '<b>' + this.series.name + '</b><br/>'
                     + this.point.y + ' '
                     + this.point.name.toLowerCase();
            }
         }
      });
      
     
      Highcharts.chart('container_h_ss', {
           chart: {
             type: 'column'
           },
           title: {
             text: '삼성 라이온즈의 습도 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '0-20',
               '21-40',
               '41-60',
               '61-80',
               '81-100',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [17,36,65,33,16]

           }, {
             name: '2',
             data: [10,24,24,12,11]

           }, {
             name: '3',
             data: [0,3,8,8,1]

           }, {
             name: '4',
             data: [0,1,3,2,0]

           },
              {
               name : '5',
               data : [0,0,1,0,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,0,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0,0]
             }   
                   ]
         });
      
      Highcharts.chart('container_t_ss', {
           chart: {
             type: 'column'
           },
           title: {
             text: '삼성 라이온즈의 기온 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '5-15',
               '16-24',
               '25-34',
               '35-45',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [9,69,88,1]

           }, {
             name: '2',
             data: [1,37,40,3]

           }, {
             name: '3',
             data: [0,11,9,0]

           }, {
             name: '4',
             data: [0,1,4,1]

           },
              {
               name : '5',
               data : [0,1,0,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0]
             }   
                   ]
         });
      
      
      
      
      
      
      
      Highcharts.chart('container8', {
         data : {
            table : 'datatable8'
         },
         chart : {
            type : 'column'
         },
         title : {
            text : 'SSG 랜더스의 기온변화에 따른 승률'
         },
         yAxis : {
            allowDecimals : false,
            title : {
               text : 'count'
            }
         },
         tooltip : {
            formatter : function() {
               return '<b>' + this.series.name + '</b><br/>'
                     + this.point.y + ' '
                     + this.point.name.toLowerCase();
            }
         }
      });
      
     
      Highcharts.chart('container_h_ssg', {
           chart: {
             type: 'column'
           },
           title: {
             text: 'SSG 랜더스의 습도 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '0-20',
               '21-40',
               '41-60',
               '61-80',
               '81-100',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [8,29,66,71,35]

           }, {
             name: '2',
             data: [3,4,27,43,21]

           }, {
             name: '3',
             data: [2,4,9,5,6]

           }, {
             name: '4',
             data: [0,4,1,2,0]

           },
              {
               name : '5',
               data : [0,4,0,1,1]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,1,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0,0]
             }   
                   ]
         });
      
      Highcharts.chart('container_t_ssg', {
           chart: {
             type: 'column'
           },
           title: {
             text: 'SSG 랜더스의 기온 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '5-15',
               '16-24',
               '25-34',
               '35-45',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [23,96,89,1]

           }, {
             name: '2',
             data: [13,47,38,0]

           }, {
             name: '3',
             data: [2,11,12,1]

           }, {
             name: '4',
             data: [0,4,3,0]

           },
              {
               name : '5',
               data : [3,2,1,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,1,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0]
             }   
                   ]
         });
      
      
      
      
      
      Highcharts.chart('container9', {
         data : {
            table : 'datatable9'
         },
         chart : {
            type : 'column'
         },
         title : {
            text : '한화 이글스의 기온변화에 따른 승률'
         },
         yAxis : {
            allowDecimals : false,
            title : {
               text : 'count'
            }
         },
         tooltip : {
            formatter : function() {
               return '<b>' + this.series.name + '</b><br/>'
                     + this.point.y + ' '
                     + this.point.name.toLowerCase();
            }
         }
      });
      
      Highcharts.chart('container_h_hw', {
           chart: {
             type: 'column'
           },
           title: {
             text: '한화 이글스의 습도 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '0-20',
               '21-40',
               '41-60',
               '61-80',
               '81-100',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [6,24,54,46,18]

           }, {
             name: '2',
             data: [0,8,17,16,4]

           }, {
             name: '3',
             data: [1,3,2,4,1]

           }, {
             name: '4',
             data: [0,1,2,1,1]

           },
              {
               name : '5',
               data : [0,0,1,0,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,0,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0,0]
             }   
                   ]
         });
      
      Highcharts.chart('container_t_hw', {
           chart: {
             type: 'column'
           },
           title: {
             text: '한화 이글스의 기온 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '5-15',
               '16-24',
               '25-34',
               '35-45',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [10,60,77,1]

           }, {
             name: '2',
             data: [2,17,26,0]

           }, {
             name: '3',
             data: [0,2,9,0]

           }, {
             name: '4',
             data: [0,2,3,0]

           },
              {
               name : '5',
               data : [0,0,1,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0]
             }   
                   ]
         });
      
      
      
      
      
      
      Highcharts.chart('container10', {
         data : {
            table : 'datatable10'
         },
         chart : {
            type : 'column'
         },
         title : {
            text : '키움 히어로즈의 기온변화에 따른 승률'
         },
         yAxis : {
            allowDecimals : false,
            title : {
               text : 'count'
            }
         },
         tooltip : {
            formatter : function() {
               return '<b>' + this.series.name + '</b><br/>'
                     + this.point.y + ' '
                     + this.point.name.toLowerCase();
            }
         }
      });
      
      
      Highcharts.chart('container_h_kw', {
           chart: {
             type: 'column'
           },
           title: {
             text: '키움 히어로즈의 습도 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '0-20',
               '21-40',
               '41-60',
               '61-80',
               '81-100',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [14,43,57,51,15]

           }, {
             name: '2',
             data: [3,19,30,24,11]

           }, {
             name: '3',
             data: [1,4,12,11,1]

           }, {
             name: '4',
             data: [2,3,2,5,2]

           },
              {
               name : '5',
               data : [0,0,0,0,1]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,1,0,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0,0]
             }   
                   ]
         });
      
      Highcharts.chart('container_t_kw', {
           chart: {
             type: 'column'
           },
           title: {
             text: '키움 히어로즈의 기온 변화에 따른 홈런 개수'
           },
          
           xAxis: {
             categories: [
               '5-15',
               '16-24',
               '25-34',
               '35-45',
             ],
             crosshair: true
           },
           yAxis: {
             min: 0,
             title: {
               text: '홈런 개수'
             }
           },
           tooltip: {
             headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
             pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
               '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
             footerFormat: '</table>',
             shared: true,
             useHTML: true
           },
           plotOptions: {
             column: {
               pointPadding: 0.01,
               borderWidth: 0
             }
           },
           series: [{
             name: '1',
             data: [9,77,93,1]

           }, {
             name: '2',
             data: [5,37,45,0]

           }, {
             name: '3',
             data: [3,9,17,0]

           }, {
             name: '4',
             data: [1,3,5,0]

           },
              {
               name : '5',
               data : [0,0,1,0]
               
               
             }   ,
             {
               name : '6',
               data : [0,0,1,0]
               
               
             } ,
                  {
               name : '7',
               data : [0,0,0,0]
             }   ,
                        {
               name : '8',
               data : [0,0,0,0]
             }   
                   ]
         });
      
      
      
  