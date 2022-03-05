package com.dbconnector;
import java.sql.*;
import com.content.*;
import com.crud.*;
import java.util.*;
public class DBManagerTest {
	public static void main(String[] args) {
		//select
		DBManager dbManager = new DBManager();
		try {
			dbManager.getConnection();
			System.out.println("Connection Successfully");
	        Keeper c = new Keeper(null, null, null, null, null);
	        c.setKeeperName("MuMuZin");
	        c.setKeeperDOB("2022-2-17");
	        c.setKeeperEmail("mumu@111");
	        c.setKeeperPhone("09-123456789");
	        c.setKeeperType("junior");
	        KeeperManager kmg = new KeeperManager();
	        int rowInserted = kmg.insert(c);
	        if (rowInserted==1) {
	        	System.out.print("Successfully insertd");
	        }
	        		
		}
		catch (ClassNotFoundException | SQLException e) {
			//tODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
