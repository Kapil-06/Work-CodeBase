package com.CloudDB.Programs;

//Write a program to show list of all mobile

import java.sql.*;

public class MobileList {
	public static void main(String[] args) {
		
		Connection con;
		Statement st;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			st=con.createStatement();
			rs=st.executeQuery("select * from MOBILES");
			
			System.out.printf("%-10s |    %-14s | %-8s | %-12s | %-4s |  %-5s|     %-15s|     %-15s| %-7s |    %-21s  |   %-9s | %-7s %n",
				    "ProductId", "Modelname", "Company", "Connectivity", "RAM", "ROM", "Color", "Screen", "Battery", "Processor", "Price", "Rating");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
				while (rs.next()) {
				    System.out.printf(" %-10s| %-17s | %-8s |    %-10s| %-4s | %-5s | %-18s | %-18s |  %-6d | %-24s  |  %-9s  |   %-7s %n",
				    	//	Retrieve the mobile data from the result set
				        rs.getInt("prodid"), 
				        rs.getString("modelname"), 
				        rs.getString("company"), 
				        rs.getString("connectivity"),
				        rs.getString("ram"), 
				        rs.getString("rom"), 
				        rs.getString("color"), 
				        rs.getString("screen"),
				        rs.getInt("battery"), 
				        rs.getString("processor"), 
				        rs.getFloat("price"), 
				        rs.getDouble("rating"));
				}
				con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
