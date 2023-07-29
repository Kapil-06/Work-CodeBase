package com.CloudDB.Programs;

//Write a program to accept company like "samsung" and display list of mobiles of that category in the ascending order of price

import java.sql.*;
import java.util.*;

public class MobileCatlog {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		String cmpny;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			pst=con.prepareStatement("Select * from MOBILES where company=? ORDER BY price ASC");
			
			System.out.print("Enter company name :");
			cmpny=sc.nextLine();
			
			pst.setString(1, cmpny); // Set the company name parameter for select query.
			rs=pst.executeQuery();
			
			// Print formatted table headers for displaying data
			System.out.printf("  %-10s |    %-10s    |   %-10s    %n", "productId", "Company", "Price");
			System.out.println(" ---------------------------------------------");
			while (rs.next()) {
			    System.out.printf("    %-8s |    %-10s    |  %-10s    %n", // Print formatted table headers for displaying data.
			    		// Retrieve the data from the result set
			    		rs.getInt("prodid"), 
			    		rs.getString("company"), 
			    		rs.getFloat("price"));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}		
	}
}
