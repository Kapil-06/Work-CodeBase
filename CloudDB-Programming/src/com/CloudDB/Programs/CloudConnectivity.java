package com.CloudDB.Programs;

import java.sql.*;

public class CloudConnectivity {
	public static void main(String[] args) {
		
		Connection con;
		
		// Establishes a connection between the Java program and the MySQL database. 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			
			System.out.println("cloud connectivity is successfully");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
