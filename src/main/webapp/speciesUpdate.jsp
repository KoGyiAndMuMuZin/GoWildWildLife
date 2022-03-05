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
body{
background-image:url('images/species.jpg');
background-size:cover;
height:1300px;
width:1000px;
display:flex;
justify-content:center;
text-align:center;
position:absolute;
background-repeat: no-repeat;
}
form{
color:brown;
}
.btnAlign{
text-align:center;
margin-left:200px;
margin-top:50px;
}
 .btn{
 background-color:white;
 color:brown;
 font-size:20px;
 transition-duration: 0.5s;
 border-radius:80%;
 width: 100px;
 height: 60px;
 
 }
 .button5:hover {
  background-color:#00BFFF;
  color: white;
}
label{
font-size :150%;
margin-top:50px;
}
input{
margin-top:35px;
margin-left:30px;
width:150px;
height:30px;
border:2px solid brown;
border-radius: 10px;
box-shadow: 2px 2px 3px brown;
}
</style>
</head>
<body>
<form action="speciesupdatedaction.jsp">
<%
int id = Integer.valueOf(request.getParameter("ID"));
speciescontentmanager scm = new speciescontentmanager();
try{
	Species S = scm.getById(id);

%>
<label>Species ID:</label><input type="text" name="ID" value="<%= S.getSpeciesID()%>" required>
<br><br>
<label>Species Type:</label><input type="text" name="type" value="<%=S.getSpeciestype() %>" required>
<br><br>
<label>Species Group:</label><input type="text" name="group" value="<%=S.getSpeciesgroup() %>" required>
<br><br>
<label>Species Lifestyle:</label><input type="text" name="lifestyle" value="<%= S.getSpecislifestyle()%>" required>
<br><br>
<label>Species Status:</label><input type="text" name="status" value="<%=S.getStatus() %>" required>
<br><br>
<br>
<div class="btnAlign">
<input type="submit" value="Save" class="btn button5">
<input type="reset"value="Reset" class="btn button5">
</div>
</form>
<%
}
catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>
</body>
</html>