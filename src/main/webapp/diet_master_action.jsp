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
String diettype = request.getParameter("type");
int numberoffeeds = Integer.valueOf(request.getParameter("nooffeeds"));
out.print(diettype);
out.print(numberoffeeds);
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	out.println("Connection Successfully");
	Diet c = new Diet(diettype, numberoffeeds);
 	dietcontentmanager kcm = new dietcontentmanager();
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