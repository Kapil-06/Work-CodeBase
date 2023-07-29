package com.CloudDB.Programs;

//Take field as an input like rom and display all mobiles in the descending order of the that field.

import java.sql.*;
import java.util.*;

public class MobilesDescendingField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rom;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ROM with GB :");
		rom=sc.nextLine();
		
		descByRom(rom);
	}
	public static void descByRom(String rom) {
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			pst=con.prepareStatement("Select * from MOBILES where rom=? ORDER BY rom DESC");
			pst.setString(1, rom);
			
			rs=pst.executeQuery();
			
			System.out.printf("  %-10s |   %-15s   |   %-8s |  %-8s|%n","Company","Model","ROM","RAM","Price");
			System.out.println("------------------------------------------------------------");
			
			while(rs.next()) {
				System.out.printf("  %-10s | %-17s   |   %-8s |  %-8s|%n",
						rs.getString("company"),
						rs.getString("modelname"),
						rs.getString("rom"),
						rs.getString("ram"),
						rs.getDouble("price"));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
