package com.crud;
import java.util.*;
import com.content.*;
import com.dbconnector.*;
import java.sql.*;

public class animalcontentmanager {
	public int insert(Animals c) throws ClassNotFoundException, SQLException {
		int result=-1;
		//1. get connection
		DBManager dbMgr=new DBManager();//create object or instantiate class 
		Connection conn=dbMgr.getConnection();
		
		//2.prepare statement
		String sql="INSERT INTO `gowildwildlife`.`animal`\r\n"
				+ "(`Animal_Name`,\r\n"
				+ "`genter`,\r\n"
				+ "`year`,\r\n"
				+ "`enclosures_ID`,\r\n"
				+ "`species_ID`,\r\n"
				+ "`diet_ID`,\r\n"
				+ "`keepers_ID`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?,?,?,?,?,?)";
				
		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		//first and second parameters inserted 1. course name and course text
		pstmt.setString(1, c.getAnimalname());
		pstmt.setString(2, c.getGenter());
		pstmt.setInt(3, c.getYear());
		pstmt.setInt(4, c.getEnclosuresID());
		pstmt.setInt(5, c.getSpeciesID());
		pstmt.setInt(6, c.getDietID());
		pstmt.setInt(7, c.getKeeperID());
		result=pstmt.executeUpdate();
		conn.close();
		
		return result;
		 
		
	}
	public ArrayList<Animals> selectAllAnimalsByKeeperName() throws ClassNotFoundException, SQLException{
		ArrayList<Animals> AnimalList = new ArrayList<Animals>();
		Animals animal;
		//1. get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		//2. prepare statement
		String sql ="select animal.Animal_ID, animal.Animal_Name, animal.genter, animal.year, animal.keepers_ID, keepers.name\r\n"
				+ "from animal left join keepers on animal.keepers_ID = keepers.keepers_ID;";
		PreparedStatement pstmt =conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		//populate the array list from the record of the table_html
		while (rs.next()) {
			 animal = new Animals(rs.getInt("Animal_ID"),
					rs.getString("Animal_Name"),
					rs.getString("genter"),
					rs.getInt("year"),
					rs.getInt("keepers_ID"),
					rs.getString("name"));
			AnimalList.add(animal);//add entity object into collection
		}
		conn.close();
		return AnimalList;
	}
	public ArrayList<Animals> selectTotalAnimalCount() throws ClassNotFoundException, SQLException{
		ArrayList<Animals> AnimalList = new ArrayList<Animals>();
		Animals animal;
		//1. get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		//2. prepare statement
		String sql ="select keepers.name, count(animal.Animal_ID) as totalAnimal from\r\n"
				+ " animal left join keepers on animal.keepers_ID=keepers.keepers_ID group by keepers.keepers_ID;";
		PreparedStatement pstmt =conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		//populate the array list from the record of the table_html
		while (rs.next()) {
			 animal = new Animals(rs.getString("name"),
					rs.getInt("totalAnimal"));
			AnimalList.add(animal);//add entity object into collection
		}
		conn.close();
		return AnimalList;
	}
	public ArrayList<Animals> selectAll() throws ClassNotFoundException, SQLException{
		ArrayList<Animals> AnimalList = new ArrayList<Animals>();
		Animals animal;
		//1. get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		//2. prepare statement
		String sql ="SELECT `animal`.`Animal_ID`,\r\n"
				+ "    `animal`.`Animal_Name`,\r\n"
				+ "    `animal`.`genter`,\r\n"
				+ "    `animal`.`year`,\r\n"
				+ "    `animal`.`enclosures_ID`,\r\n"
				+ "    `animal`.`species_ID`,\r\n"
				+ "    `animal`.`diet_ID`,\r\n"
				+ "    `animal`.`keepers_ID`\r\n"
				+ "FROM `gowildwildlife`.`animal`;\r\n";
		PreparedStatement pstmt =conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		//populate the array list from the record of the table_html
		while (rs.next()) {
			 animal = new Animals(rs.getInt("Animal_ID"),
					 rs.getString("Animal_Name"),
					 rs.getString("genter"),
					 rs.getInt("year"),
					 rs.getInt("enclosures_ID"),
					 rs.getInt("species_ID"),
					 rs.getInt("diet_ID"),
					 rs.getInt("keepers_ID"));
			AnimalList.add(animal);//add entity object into collection
		}
		conn.close();
		return AnimalList;
	}
}
