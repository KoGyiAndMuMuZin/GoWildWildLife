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
<h1 style="text-align:center;">Enclosure List</h1>
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
<%
DBManager dbManager = new DBManager();
try {
	dbManager.getConnection();
	//Select
	enclosurescontentmanager E = new enclosurescontentmanager();
	ArrayList<enclosures> enclosure = E.selectAll();
	
%>
<table style="width:100%">
	<tr>
	<th style="width:10%">Enclosure_ID</th>
	<th>Enclosure_Type</th>
	<th>Enclosure_Location</th>
	<th>Edit</th>
	<th>Delete</th>
	</tr>
<%
for(enclosures eachElement:enclosure){
%>
<tr>
<td><%=eachElement.getEnclosursID()%></td>
<td><%=eachElement.getType()%></td>
<td><%=eachElement.getLocation()%></td>
<td><a href="EnclosuresUpdate.jsp?id=<%=eachElement.getEnclosursID()%>">Edit</a></td>
<td><a href="enclosuresdeletedaction.jsp?id=<%=eachElement.getEnclosursID()%>">Delete</a></td>
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