package com.CloudDB.Programs;

// Create a parameterized stored procedure to reduce the price of a company's products by a specified amount. Call the SP from a program.

import java.sql.*;
import java.util.*;

public class ReduceProductPrice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String cmpnm;
		float reduction;
		
		// Prompt the user for input 
		System.out.println("enter company name :");
		cmpnm=sc.nextLine();
		System.out.println("enter reduction price :");
		reduction=sc.nextFloat();
		
		priceReduce(cmpnm,reduction); // Invoke the priceReduce method
	}
	
	// Method implementation
	public static void priceReduce(String cmpnm,float reduction) {
		
		Connection con;
		CallableStatement cst;
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			 
			 cst=con.prepareCall("{call ReduceProductPrice(?,?)}"); //Call stored procedure to update customer information
			 
			 cst.setString(1, cmpnm); // Set the company name parameter for the stored procedure
			 cst.setFloat(2, reduction); // Set the reduction price parameter for the stored procedure
			 
			 cst.execute();
			 System.out.println("Price reduce successfully");
			 con.close();
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	}

}
