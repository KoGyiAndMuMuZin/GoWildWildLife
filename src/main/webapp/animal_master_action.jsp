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
String A_name = request.getParameter("name");
String A_gender = request.getParameter("gender");
int A_year = Integer.valueOf(request.getParameter("year"));
int a_SID = Integer.valueOf(request.getParameter("SID"));
int a_DID = Integer.valueOf(request.getParameter("DID"));
int a_KID =Integer.valueOf(request.getParameter("KID"));
int a_EID = Integer.valueOf(request.getParameter("EID"));
out.print(A_name);
out.print(A_gender);
out.print(A_year);
out.print(a_SID);
out.print(a_DID);
out.print(a_KID);
out.print(a_EID);
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	out.println("Connection Successfully");
	Animals c = new Animals(A_name, A_gender, A_year, a_SID, a_DID, a_KID, a_EID );
	animalcontentmanager kcm = new animalcontentmanager();
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