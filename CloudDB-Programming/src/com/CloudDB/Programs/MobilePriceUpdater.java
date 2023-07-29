package com.CloudDB.Programs;

//Write a program to accept prodid & new price and update price in the mobile data in the table if found else display "mobile does not exist"

import java.sql.*;
import java.util.*;

public class MobilePriceUpdater {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id;
		float price=0.0f;
		Connection con;
		PreparedStatement pst, pst1;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			pst=con.prepareStatement("select * from MOBILES where prodid=?");
			
			System.out.print("Enter product id :");
			id=sc.nextInt();
			
			/*  //We can also perform the operation using the following code : ---->
			System.out.print("enter product id :");
			id=sc.nextInt();
			System.out.print("enter new price :");
			price=sc.nextFloat();
			
			pst.setInt(1, empno);
			pst.setFloat(2,sal);
			
			int count=pst.executeUpdate();
			if(count>0) {
					System.out.println("price update successfully");
				}
				else {
					System.out.println("Failed to update price");
				}
			*/
			
			pst.setInt(1, id);
			rs=pst.executeQuery();
			
			if(rs.next()) 
			{
				pst1=con.prepareStatement("update MOBILES set price=? where prodid=?");
				System.out.print("enter new price :");
				price=sc.nextFloat();
				pst1.setFloat(1, price);
				pst1.setInt(2, id);
				int count=0;
				count=pst1.executeUpdate();	
				
				if(count>0) {
					System.out.println("price update successfully");
				}
				else {
					System.out.println("Failed to update price");
				}
			}
			else {
				System.out.println("Mobile not found !!!!");
			}	
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
