package com.jdbcp.pr;

import java.sql.*;

public class NewDatabase {
	public static void main(String[] args) {
//		String url = "jdbc:mysql://localhost:3306/user_data";
		String url = "jdbc:mysql://localhost:3306/Hospital";
		String user = "root";
		String password = "A#@21jja$y2";

		try {
			// Load JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish connection
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to database!");

			// Create statement
			Statement stmt = conn.createStatement();

			// Create table if not exists
			String sql = "CREATE TABLE IF NOT EXISTS patient (" +
						 "id INT PRIMARY KEY AUTO_INCREMENT, " +
						 "name VARCHAR(100), " +
						 "age INT, " +
						 "disease VARCHAR(100))";
			stmt.executeUpdate(sql);

			// Optionally insert sample data
			String insertSql = "INSERT INTO patient (name, age, disease) VALUES ('Gojo', 23, 'Lungs')";
			stmt.executeUpdate(insertSql);

			// Query the student table
			ResultSet rs = stmt.executeQuery("SELECT * FROM patient");

			// Process result
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id") + 
								   ", Name: " + rs.getString("name") + 
								   ", Age: " + rs.getInt("age") + 
								   ", Course: " + rs.getString("disease"));
			}

			// Close connections
			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
