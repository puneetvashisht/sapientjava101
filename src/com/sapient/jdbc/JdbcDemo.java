package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Loaded d driver...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sapientdb1", "root", "root");
			System.out.println("Connected to DB...");
			PreparedStatement stmt = con.prepareStatement("select * from emp where salary > ?");
			stmt.setInt(1, 34500);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				
				System.out.println(rs.getString("name") + "  " + rs.getInt(2) + "  " + rs.getString(3));
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
