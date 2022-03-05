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
background-image:url('images/enclosure.jpg');
background-size:cover;
height:550px;
width:1300px;
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
margin-left:100px;
margin-top:40px;
}
 .btn{
 background-color:white;
 color:brown;
 font-size:18px;
 transition-duration: 0.5s;
 border-radius:80%;
 width: 80px;
 height: 45px;
 
 }
 .button5:hover {
  background-color:#4169E1;
  color: white;
}
label{
font-size :150%;
margin-top:50px;
}
input{
margin-top:45px;
margin-left:40px;
width:250px;
height:40px;
border:2px solid brown;
border-radius: 10px;
box-shadow: 2px 2px 3px brown;
}
</style>
</head>
<body>
<form action="enclosuresupdatedaction.jsp">
<%
int id = Integer.valueOf(request.getParameter("id"));
enclosurescontentmanager ecm = new enclosurescontentmanager();
try{
	enclosures E = ecm.getById(id);

%>
<label>Enclosures Id:</label><input type="text" name="Id"  value="<%=E.getEnclosursID() %>"required>
<br><br>
<label>Enclosures Type:</label><input type="text" name="type" value="<%=E.getType() %>"required>
<br><br>
<label>Enclosures Location:</label><input type="text" name="location" value="<%=E.getLocation() %>"required> 
<br><br>
<div class="btnAlign">
<input type="submit" value="Update" class="btn button5">
<input type="reset"value="Clear" class="btn button5">
<%
}
catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>
</div>
</form>
</body>
</html>