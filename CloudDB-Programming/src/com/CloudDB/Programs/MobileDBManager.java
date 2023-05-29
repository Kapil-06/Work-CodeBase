package com.CloudDB.Programs;

//Write a program to take new mobile data as input and add mobile to the DB table

import java.sql.*;
import java.util.*;

public class MobileDBManager {
	public static void main(String args[]) {
		
		int id, btry;
		String modnm, comp, ram, rom, cnvt, colr, scr, prosr;
		double prc, rtng;
		
		//System.out.println("driver connect successfully");
		Scanner sc=new Scanner(System.in);
		
		Connection con;
		PreparedStatement pst;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			pst=con.prepareStatement("insert into MOBILES values(?,?,?,?,?,?,?,?,?,?,?,?)");
			
			// Prompt the user for input 
			System.out.print("enter product id :");
			id=sc.nextInt();
			sc.nextLine();
			System.out.print("enter model name :");
			modnm=sc.nextLine();
			System.out.print("enter company :");
			comp=sc.nextLine();
			System.out.print("enter connectivity (4G/5G) :");
			cnvt=sc.nextLine();
			System.out.print("enter RAM :");
			ram=sc.nextLine();
			System.out.print("enter ROM :");
			rom=sc.nextLine();
			System.out.print("enter color :");
			colr=sc.nextLine();
			System.out.print("enter Screen :");
			scr=sc.nextLine();
			System.out.print("enter battery :");
			btry=sc.nextInt();
			sc.nextLine();
			System.out.print("enter processor :");
			prosr=sc.nextLine();
			System.out.print("enter price :");
			prc=sc.nextDouble();
			System.out.print("enter rating :");
			rtng=sc.nextDouble();
			
			// Set the parameter for insert query.
			pst.setInt(1,id);
			pst.setString(2, modnm);
			pst.setString(3, comp);
			pst.setString(4, cnvt);
			pst.setString(5, ram);
			pst.setString(6, rom);
			pst.setString(7, colr);
			pst.setString(8, scr);
			pst.setInt(9, btry);
			pst.setString(10, prosr);
			pst.setDouble(11, prc);
			pst.setDouble(12, rtng);
			
			pst.executeUpdate();
			System.out.println("Data addes successfully");
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
