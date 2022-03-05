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
</head>
<body>
<%
int id = Integer.valueOf(request.getParameter("ID"));
String type = request.getParameter("type");
String group = request.getParameter("group");
String lifestyle = request.getParameter("lifestyle");
String status = request.getParameter("status");
speciescontentmanager scm = new speciescontentmanager ();
Species specie = new Species (id,type,group,lifestyle,status);
int rowsAffected;
try {

    rowsAffected = scm.update(specie);
    out.println("No of rows affected - " + rowsAffected);

}catch (SQLException e){
    out.println(e.getMessage());

}
%>
</body>
</html>