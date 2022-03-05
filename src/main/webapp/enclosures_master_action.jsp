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
String E_type = request.getParameter("type");
String E_location = request.getParameter("location");
out.print(E_type);
out.print(E_location);
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	out.println("Connection Successfully");
	enclosures c = new enclosures(E_type, E_location);
	enclosurescontentmanager e = new enclosurescontentmanager();
	int rowInserted = e.insert(c);
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