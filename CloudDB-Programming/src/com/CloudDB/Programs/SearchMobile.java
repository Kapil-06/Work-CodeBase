package com.CloudDB.Programs;

//Write a program to accept modelname, search mobile in the table, show the mobile details if found else display "not found" message

import java.sql.*;
import java.util.*;

public class SearchMobile {
	public static void main(String[] args) {
		String modnm;
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			pst=con.prepareStatement("Select * from MOBILES where modelname=?");
			
			System.out.print("\n  enter model name :");
			modnm=sc.nextLine();
			pst.setString(1, modnm);
			rs=pst.executeQuery();
			if(rs.next()) {
				System.out.println("\n\tProduct id : "+rs.getInt("prodid"));
				System.out.println("\tModel name : "+rs.getString("modelname"));
				System.out.println("\tCompany : "+rs.getString("company"));
				System.out.println("\tconnectivity : "+rs.getString("connectivity"));
				System.out.println("\tRAM : "+rs.getString("ram"));
				System.out.println("\tROM : "+rs.getString("rom"));
				System.out.println("\tColor : "+rs.getString("color"));
				System.out.println("\tScreen : "+rs.getString("screen"));
				System.out.println("\tBattery : "+rs.getString("battery"));
				System.out.println("\tProcessor : "+rs.getString("processor"));
				System.out.println("\tPrice : "+rs.getDouble("price"));
				System.out.println("\tRating : "+rs.getDouble("rating"));
				//System.out.println("\tPurpose : "+rs.getString("purpose"));
			}
			else {
				System.out.println("\n \tMobile Not Found..!!!!");
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	
}
