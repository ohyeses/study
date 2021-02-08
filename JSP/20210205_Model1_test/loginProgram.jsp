<%@page import="java.net.URLEncoder"%>
<%@page import="java.sql.ResultSet"%>
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
<%
	String db_id = "hr";
	String db_pw = "hr";
	String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
 	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = null;
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	Connection conn = DriverManager.getConnection(db_url, db_id, db_pw);
	
	String sql = "select name from model1 where id=? and pw=?";
	
	PreparedStatement psmt = conn.prepareStatement(sql);
	psmt.setString(1,id);
	psmt.setString(2,pw);
	
	ResultSet rs = psmt.executeQuery();
	
	if(rs.next()){
		name = rs.getString("name");
	}
	
	if(name !=null){
		response.sendRedirect("loginSuccess.jsp?name="+URLEncoder.encode(name, "EUC-KR"));
	}else{
		response.sendRedirect("loginFail.jsp");
	}

	if(rs!=null){
		rs.close();
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