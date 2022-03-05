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
<title>Keeper Master Action</title>
</head>
<body>
<%
String keeperName= request.getParameter("keepername");
String keeperDOB= request.getParameter("DOB");
String keeperEmail= request.getParameter("email");
String keeperPhone= request.getParameter("phone");
String keeperType= request.getParameter("type");
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	out.println("Connection Successfully");
	Keeper c = new Keeper(keeperName, keeperDOB, keeperEmail, keeperPhone, keeperType);
	KeeperManager kcm = new KeeperManager();
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