package com.dbconnector;
import java.sql.*;
public class DBManager {
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		//Step1: DriverManager class to acquire JDBC connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step2:DB Connection URL with Server,Port, DB Name, SSL Connection type and Server Time Zone
		String dbUrl = "jdbc:mysql://localhost:3306/gowildwildlife?useSSL=true&serverTimezone=UTC";
		String dbUser = "root";
		String dbPass = "Admin1234";
	    connection = DriverManager.getConnection(dbUrl,dbUser,dbPass);
	    return connection;
		
	}
}

