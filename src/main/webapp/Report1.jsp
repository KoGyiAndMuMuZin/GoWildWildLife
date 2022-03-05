<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.crud.*" %>
<%@ page import="com.dbconnector.*" %>
<%@ page import="com.content.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Report 1</title>
<style >
table, th, td {
  border: 2px solid;
  
}
table{
width: 100%;
}
th {
  height: 50px;
}
</style>
</head>
<body>
<%
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	
	//select
	animalcontentmanager animalContentManager = new animalcontentmanager();
	ArrayList<Animals> animals = animalContentManager.selectAllAnimalsByKeeperName();
%>
<table>
<tr>
<th>Animal ID</th>
<th>Animal Name</th>
<th>Gender</th>
<th>Animal Year</th>
<th>Keeper ID</th>
<th>Keeper Name</th>
</tr>
<%
for(Animals eachAnimal:animals ){
%>
<tr>
<td><%=eachAnimal.getAnimalID() %></td>
<td><%=eachAnimal.getAnimalname() %></td>
<td><%=eachAnimal.getGenter() %></td>
<td><%=eachAnimal.getYear() %></td>
<td><%=eachAnimal.getKeeperID() %></td>
<td><%=eachAnimal.getKeepername() %></td>
</tr>
<%
} 
}
catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>
</table>
</body>
</html>