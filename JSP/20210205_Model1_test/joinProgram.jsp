<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	JDBC 코드
<%
	String db_id = "hr";
	String db_pw = "hr";
	String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
 	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String pw = request.getParameter("pw"); 
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	Connection conn = DriverManager.getConnection(db_url, db_id, db_pw);
	
	String sql = "insert into model1 values(?,?,?)";
	
	PreparedStatement psmt = conn.prepareStatement(sql);
	psmt.setString(1,id);
	psmt.setString(2,pw);
	psmt.setString(3,name);
	
	int cnt = psmt.executeUpdate();
	/* psmt.executeUpdate(); */
	
 	if (cnt > 0) {
		System.out.print("회원가입 성공!");
		response.sendRedirect("login.jsp");
	} else {
		System.out.print("회원가입 실패!");
	} 
	
	if (psmt != null) {
		psmt.close();
	}
	if (conn != null) {
		conn.close();
	}
%>
</body>
</html>