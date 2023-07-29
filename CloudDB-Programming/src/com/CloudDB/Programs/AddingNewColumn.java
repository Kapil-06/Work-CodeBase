package com.CloudDB.Programs;

//Add new column "purpose varchar(50)" to the mobiles table using alter query

import java.sql.*;

public class AddingNewColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		Statement st;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
			
			st=con.createStatement();
			int cnt=st.executeUpdate("ALTER TABLE MOBILES ADD COLUMN purpose VARCHAR(50)");
			
			System.out.println("Column added successfully");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
