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
      
      //jsp �������� �Ѱ��� ��
      request.setAttribute("id", id);
      
      //RequestDispatcher : Ŭ���̾�Ʈ�κ��� ���ʿ� ���� ��û Jsp/Servlet ������
      //���ϴ� �ڿ����� ��û(request, response)�� �ѱ�� ����
      RequestDispatcher rd = request.getRequestDispatcher("Ex05loginsuccess.jsp");
      
      rd.forward(request, response);
   }else{
      //redirect : �ܼ��� �̵�
      response.sendRedirect("Ex05loginfail.jsp");
   }
%>
</body>
</html>