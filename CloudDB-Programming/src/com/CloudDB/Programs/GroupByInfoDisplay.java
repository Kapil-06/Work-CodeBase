package com.CloudDB.Programs;

//Write a program to display group by information - brand, total models under the company, average price and average rating

import java.sql.*;
import java.util.*;

public class GroupByInfoDisplay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Connection con;
		Statement st;
		ResultSet rs;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");

			st = con.createStatement();
			rs = st.executeQuery(
					"SELECT company, COUNT(modelname) AS total_models, AVG(price) AS average_price, AVG(rating) AS average_rating FROM MOBILES GROUP BY company;");

			// Print formatted table headers for displaying data
			System.out.printf("  %-8s  | %-10s  | %-10s |  %10s  |%n", "Company", "Total models", "Avgerage price",
					"Average rating");
			System.out.print("------------------------------------------------------------------\n");

			while (rs.next()) {
				System.out.printf("  %-8s  |    %-10s | %-10s   |  %10s      |%n", // Print formatted table headers for displaying data

						rs.getString("company"), // Retrieve the company name from the result set
						rs.getString("total_models"), // Retrieve the totals models from the result set
						rs.getString("average_price"), // Retrieve the average price from the result set
						rs.getString("average_rating")); // Retrieve the average rating from the result set
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
