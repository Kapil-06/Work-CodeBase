package com.CloudDB.Programs;

//Write a program to accept ram and rom, display list of mobiles of the ram-rom storage space combination.

import java.sql.*;
import java.util.*;

public class MobileListByStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ram ,rom;
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			pst=con.prepareStatement("Select * from MOBILES where ram=? and rom=?");
			 
			System.out.print("Enter RAM with GB:");
			ram=sc.next();
			System.out.print("Enter Rom with Gb:");
			rom=sc.next();
			 
			pst.setString(1, ram);
			pst.setString(2, rom);
			 
			rs=pst.executeQuery();
			System.out.printf("%-10s |    %-14s | %-8s | %-12s | %-4s |  %-5s|     %-15s|     %-15s| %-7s |    %-20s |    %-7s | %-7s%n",
					    "ProductId", "Modelname", "Company", "Connectivity", "RAM", "ROM", "Color", "Screen", "Battery", "Processor", "Price", "Rating");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
			while(rs.next()) {
				System.out.printf(" %-10s| %-17s | %-8s |  %-12s| %-4s | %-5s | %-18s | %-18s |  %-6d | %-23s |  %-10f  | %-7f%n",
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
					        rs.getDouble("price"), 
					        rs.getDouble("rating"));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
