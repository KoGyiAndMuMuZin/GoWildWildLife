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
 int speciesid = Integer.valueOf(request.getParameter("ID"));

      speciescontentmanager scm = new speciescontentmanager();
           int rowsAffected;
            try {

                rowsAffected = scm.delete(speciesid);
                out.println("No of rows affected - " + rowsAffected);

             }catch (SQLException e){
                  out.println(e.getMessage());

              }
%>
</body>
</html>