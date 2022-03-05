<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.dbconnector.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.content.*" %>
<%@ page import="com.crud.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String S_type = request.getParameter("type");
String S_group = request.getParameter("group");
String S_lifestyle = request.getParameter("lifestyle");
String S_status = request.getParameter("status");
out.print("S_type");
out.print("S_group");
out.print("S_lifestyle");
out.print("S_status");
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	out.println("Connection Successfully");
	Species c = new Species(S_type, S_group, S_lifestyle, S_status);
	speciescontentmanager kcm = new speciescontentmanager();
	int rowInserted = kcm.insert(c);
	if(rowInserted==1){
		out.print("Successfully insertd");
	}
	
}
catch (SQLException e) {
	e.printStackTrace();
}
%>
</body>
</html>