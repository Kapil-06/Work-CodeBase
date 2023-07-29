package com.CloudDB.Programs;

//Write a program to accept prodid, display the mobile data and ask, "Do you want to delete?" if "yes" delete the mobile from the table

import java.sql.*;
import java.util.*;

public class MobileDeleter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int id;
		
		Connection con;
		PreparedStatement pst,pst1;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			pst=con.prepareStatement("Select * from MOBILES where prodid=?");
			
			System.out.print("Enter product id :");
			id=sc.nextInt();
			pst.setInt(1, id);
			rs=pst.executeQuery();
			System.out.println("\t\t\t\t--------------- Mobile Data --------------\n");
			// Print formatted table headers for displaying data
			System.out.printf("%-10s |    %-14s | %-8s | %-12s | %-4s |  %-5s|     %-15s|     %-15s| %-7s |    %-20s |    %-7s | %-7s%n",
				    "ProductId", "Modelname", "Company", "Connectivity", "RAM", "ROM", "Color", "Screen", "Battery", "Processor", "Price", "Rating");
			
			if(rs.next()){
				// Print formatted table headers for displaying data
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
				
				System.out.print("\ndo you want to delete this record(yes or no)? :");
				String str=sc.next();
				
				if(str.equalsIgnoreCase("yes")) {
					pst1=con.prepareStatement("delete from MOBILES where prodid=?");
					pst1.setInt(1, id);
					int count=pst1.executeUpdate();
					if(count==1) {
						System.out.println("Record deleted successfully!");
					}
				}
				
			}
			con.close();
			
		}
		catch(Exception e) {
			System.out.println();
		}
		
	}

}
