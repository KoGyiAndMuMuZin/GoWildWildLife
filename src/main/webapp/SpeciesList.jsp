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
<h1 style="text-align:center;">Species List</h1>
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
	speciescontentmanager S = new speciescontentmanager();
	ArrayList<Species> species = S.selectAll();
	
%>
<table style="width:100%">
	<tr>
	<th style="width:10%">Specie_ID</th>
	<th>Specie_Type</th>
	<th>Specie_Group</th>
	<th>LifeStyle</th>
	<th>Status</th>
	<th>Edit</th>
	<th>Delete</th>
	</tr>
<%
for(Species eachElement:species){
%>
<tr>
<td><%=eachElement.getSpeciesID() %></td>
<td><%=eachElement.getSpeciestype() %></td>
<td><%=eachElement.getSpeciesgroup() %></td>
<td><%=eachElement.getSpecislifestyle() %></td>
<td><%=eachElement.getStatus() %></td>
<td><a href="speciesUpdate.jsp?ID=<%=eachElement.getSpeciesID()%>">Edit</a></td>
<td><a href="speciesdeletedaction.jsp?ID=<%=eachElement.getSpeciesID()%>">Delete</a></td>
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