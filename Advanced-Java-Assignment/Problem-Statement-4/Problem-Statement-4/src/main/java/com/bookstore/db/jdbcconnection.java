package com.bookstore.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcconnection {
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			if(con==null) {
				Class.forName("com.mysql.jdbc.Driver");
				con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","Ra@1611003010107");
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	
}
