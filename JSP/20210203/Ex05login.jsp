<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
   String id = request.getParameter("id");
   String pw = request.getParameter("pw");
   
   if(id.equals("smart")&&pw.equals("123")){
      /* response.sendRedirect("ex05loginsuccess.jsp"); */
      
      //jsp 페이지로 넘겨줄 값
      request.setAttribute("id", id);
      
      //RequestDispatcher : 클라이언트로부터 최초에 들어온 요청 Jsp/Servlet 내에서
      //원하는 자원으로 요청(request, response)을 넘기는 역할
      RequestDispatcher rd = request.getRequestDispatcher("Ex05loginsuccess.jsp");
      
      rd.forward(request, response);
   }else{
      //redirect : 단순히 이동
      response.sendRedirect("Ex05loginfail.jsp");
   }
%>
</body>
</html>