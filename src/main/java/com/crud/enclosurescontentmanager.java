package com.crud;
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.content.enclosures;
import com.dbconnector.DBManager;

public class enclosurescontentmanager {
	public int insert(enclosures c) throws ClassNotFoundException, SQLException {
		int result=-1;
		//1. get connection
		DBManager dbMgr=new DBManager();//create object or instantiate class 
		Connection conn=dbMgr.getConnection();
		
		//2.prepare statement
		String sql="INSERT INTO `gowildwildlife`.`enclosures`\r\n"
				+ "(\r\n"
				+ "`type`,\r\n"
				+ "`location`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?)";
				
		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		//first and second parameters inserted 1. course name and course text
		pstmt.setString(1, c.getType());
		pstmt.setString(2, c.getLocation());
		
		
		result=pstmt.executeUpdate();
		conn.close();
		
		return result;
		 
	}
	public ArrayList<enclosures> selectAll() throws ClassNotFoundException, SQLException {
		ArrayList<enclosures> elements = new ArrayList<enclosures>();
		enclosures E;
		//1. get connection
		 DBManager dbMgr = new DBManager();
		 Connection conn = dbMgr.getConnection();
		
		 //2.prepare statement
		 String sql = "SELECT `enclosures`.`enclosures_ID`,\r\n"
		 		+ "    `enclosures`.`type`,\r\n"
		 		+ "    `enclosures`.`location`\r\n"
		 		+ "FROM `gowildwildlife`.`enclosures`";
		 PreparedStatement pstmt=conn.prepareStatement(sql);
		 ResultSet rs = pstmt.executeQuery();
		 
		 while (rs.next()) {
			 E = new enclosures(rs.getInt("enclosures_ID"),
					 rs.getString("type"),
					 rs.getString("location"));
			 elements.add(E);
		 }
			 
		 conn.close();
		 return elements;
	}
public enclosures getById(int id) throws ClassNotFoundException, SQLException {
	enclosures E = null;
	//1. get connection
		DBManager dbMgr=new DBManager();
		Connection conn=dbMgr.getConnection();
		String sql = "SELECT `enclosures`.`enclosures_ID`,\r\n"
		 		+ "    `enclosures`.`type`,\r\n"
		 		+ "    `enclosures`.`location`\r\n"
		 		+ "FROM `gowildwildlife`.`enclosures` where `enclosures`.`enclosures_ID` = ? ";
		 PreparedStatement pstmt=conn.prepareStatement(sql);
		 pstmt.setInt(1, id);
		 ResultSet rs = pstmt.executeQuery();
		 
		 while (rs.next()) {
			 E = new enclosures(rs.getInt("enclosures_ID"),
					 rs.getString("type"),
					 rs.getString("location"));
		 }
			 
		conn.close();
		return E;
}
public int update(enclosures e) throws ClassNotFoundException, SQLException{
	
	int result=-1;
	
	//1. get connection
	DBManager dbMgr=new DBManager();
	Connection conn=dbMgr.getConnection();
	
	//2.prepare statement
	
	String sql = "UPDATE `gowildwildlife`.`enclosures`\r\n"
			+ "SET\r\n"
			+ "`type` = ?,\r\n"
			+ "`location` = ?\r\n"
			+ "WHERE `enclosures_ID` = ?";


	PreparedStatement pstmt=conn.prepareStatement(sql);
	
	// first and second paramters inserted 1. course name and course text
	
	pstmt.setInt(3, e.getEnclosursID());
	pstmt.setString(1, e.getType());
	pstmt.setString(2, e.getLocation());
	
	
	
	//3.execute statement
	
	result = pstmt.executeUpdate();
	
	return result;
	
}
public int delete (int id) throws SQLException, ClassNotFoundException {
    int rowsDeleted = -1;
    String sql ;
	//1. get Connection
	DBManager dbMgr = new DBManager();
	Connection conn = dbMgr.getConnection();
	
	//2. prepare the statement 
    sql = "DELETE FROM `gowildwildlife`.`enclosures`\r\n"
    		+ "WHERE `enclosures_ID` = ?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    //First parameter is the course id of the course entity
    pstmt.setInt(1, id);

    rowsDeleted = pstmt.executeUpdate();
    return rowsDeleted;
}
}
