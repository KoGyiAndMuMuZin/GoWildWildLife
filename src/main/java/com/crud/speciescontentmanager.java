package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.content.Species;
import com.content.enclosures;
import com.dbconnector.DBManager;

public class speciescontentmanager {
	public int insert(Species c) throws ClassNotFoundException, SQLException {
		int result=-1;
		//1. get connection
		DBManager dbMgr=new DBManager();//create object or instantiate class 
		Connection conn=dbMgr.getConnection();
		
		//2.prepare statement
		String sql="INSERT INTO `gowildwildlife`.` species`\r\n"
				+ "(`species_ type`,\r\n"
				+ "`species_group`,\r\n"
				+ "`lifestyle`,\r\n"
				+ "`status`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?,?,?)";
				
		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		//first and second parameters inserted 1. course name and course text
		pstmt.setString(1,c.getSpeciestype());
		pstmt.setString(2, c.getSpeciesgroup());
		pstmt.setString(3, c.getSpecislifestyle());
		pstmt.setString(4,c.getStatus());
		result=pstmt.executeUpdate();
		conn.close();
		
		return result;
	}
	public ArrayList<Species> selectAll() throws ClassNotFoundException, SQLException {
		ArrayList<Species> elements = new ArrayList<Species>();
		Species S;
		//1. get connection
		 DBManager dbMgr = new DBManager();
		 Connection conn = dbMgr.getConnection();
		
		 //2.prepare statement
		 String sql = "SELECT ` species`.`species_ID`,\r\n"
		 		+ "    ` species`.`species_ type`,\r\n"
		 		+ "    ` species`.`species_group`,\r\n"
		 		+ "    ` species`.`lifestyle`,\r\n"
		 		+ "    ` species`.`status`\r\n"
		 		+ "FROM `gowildwildlife`.` species`";
		 PreparedStatement pstmt=conn.prepareStatement(sql);
		 ResultSet rs = pstmt.executeQuery();
		 
		 while (rs.next()) {
			 S = new Species(rs.getInt("species_ID"),
					 rs.getString("species_ type"),
					 rs.getString("species_group"),
					 rs.getString("lifestyle"),
					 rs.getString("status"));
			 elements.add(S);
		 }
			 
		 conn.close();
		 return elements;
	}
public Species getById(int id) throws ClassNotFoundException, SQLException {
	Species S = null;
	//1. get connection
		DBManager dbMgr=new DBManager();
		Connection conn=dbMgr.getConnection();
		String sql = "SELECT ` species`.`species_ID`,\r\n"
				+ "    ` species`.`species_ type`,\r\n"
				+ "    ` species`.`species_group`,\r\n"
				+ "    ` species`.`lifestyle`,\r\n"
				+ "    ` species`.`status`\r\n"
				+ "FROM `gowildwildlife`.` species` where ` species`.`species_ID` = ? ";
		 PreparedStatement pstmt=conn.prepareStatement(sql);
		 pstmt.setInt(1, id);
		 ResultSet rs = pstmt.executeQuery();
		 
		 while (rs.next()) {
			 S = new Species(rs.getInt("species_ID"),
					 rs.getString("species_ type"),
					 rs.getString("species_group"),
					 rs.getString("lifestyle"),
					 rs.getString("status"));
		 }
			 
		conn.close();
		return S;
}
public int update(Species s) throws ClassNotFoundException, SQLException{
	
	int result=-1;
	
	//1. get connection
	DBManager dbMgr=new DBManager();
	Connection conn=dbMgr.getConnection();
	
	//2.prepare statement
	
	String sql = "UPDATE `gowildwildlife`.` species`\r\n"
			+ "SET\r\n"
			+ "`species_ type` = ?,\r\n"
			+ "`species_group` = ?,\r\n"
			+ "`lifestyle` = ?,\r\n"
			+ "`status` = ?\r\n"
			+ "WHERE `species_ID` = ?;";


	PreparedStatement pstmt=conn.prepareStatement(sql);
	
	// first and second paramters inserted 1. course name and course text
	
	pstmt.setInt(5, s.getSpeciesID());
	pstmt.setString(1, s.getSpeciestype());
	pstmt.setString(2, s.getSpeciesgroup());
	pstmt.setString(3, s.getSpecislifestyle());
	pstmt.setString(4, s.getStatus());
	
	
	
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
    sql = "DELETE FROM `gowildwildlife`.` species`\r\n"
    		+ "WHERE `species_ID` = ?;";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    //First parameter is the course id of the course entity
    pstmt.setInt(1, id);

    rowsDeleted = pstmt.executeUpdate();
    return rowsDeleted;
}
}

