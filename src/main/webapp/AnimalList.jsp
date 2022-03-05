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
<title>Insert title here</title>
<style>
table,th, td {
  border-collapse: collapse;
  border: 1px solid;
  width:20%;
  height:30px;
}

</style>
</head>
<body>
<h1 style="text-align:center;">Animal List</h1>
<%
DBManager dbManager = new DBManager();
try {
	dbManager.getConnection();
	//Select
	animalcontentmanager S = new animalcontentmanager();
	ArrayList<Animals> animalList = S.selectAll();
	
%>
<table style="width:100%">
	<tr>
	<th style="width:10%">Animal ID</th>
	<th>Animal Name</th>
	<th>Animal Gender</th>
	<th>Year</th>
	<th>Enclosure ID</th>
	<th>Species ID</th>
	<th>Diet ID</th>
	<th>Keeper ID</th>
	
	</tr>
<%
for(Animals eachElement:animalList){
%>
<tr>
<td><%=eachElement.getAnimalID() %></td>
<td><%=eachElement.getAnimalname() %></td>
<td><%=eachElement.getGenter() %></td>
<td><%=eachElement.getYear() %></td>
<td><%=eachElement.getEnclosuresID() %>
<td><%=eachElement.getSpeciesID() %>
<td><%=eachElement.getDietID() %></td>
<td><%=eachElement.getKeeperID() %>
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