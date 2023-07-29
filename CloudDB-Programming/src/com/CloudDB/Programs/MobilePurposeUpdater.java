package com.CloudDB.Programs;

//Write a program to accept modelname and purpose, update all mobiles of the model with the purpose ( gaming/office/social, etc.)

import java.sql.*;
import java.util.*;

public class MobilePurposeUpdater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String modlnm;
		String prps;
		
		System.out.print("Enter Model name :");
		modlnm=sc.nextLine();
		System.out.println("Enter Mobile Purpose :");
		prps=sc.nextLine();
		
		purposeUpdate(modlnm,prps);
	}
	
	public static void purposeUpdate(String modelnm, String purpose) {
		Connection con;
		PreparedStatement pst;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			pst=con.prepareStatement("Update MOBILES set purpose=? where modelname=?");
			pst.setString(1, purpose);
			pst.setString(2, modelnm);
			int cnt=pst.executeUpdate();
			
			if(cnt>0) {
				System.out.println("Mobile Purpose Updated");
			}
			else {
				System.out.println("Purpose Not Update !!!!....");
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
