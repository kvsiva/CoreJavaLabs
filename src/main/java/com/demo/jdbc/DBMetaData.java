package com.demo.jdbc;
//Program to display information about the database

import java.sql.*;

public class DBMetaData {
	public static void main(String args[]) {
		try {
			// load oracle driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// connect using Thin driver
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "tiger");
			// get metadata
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println("Product Name: " + dbmd.getDatabaseProductName());
			System.out.println("Product Version: " + dbmd.getDatabaseProductVersion());
			// Display list of available users (schemas)

			System.out.println("List of users of the database");
			ResultSet s = dbmd.getSchemas();
			while (s.next())
				System.out.println(s.getString(1));

			/* list of table of the user Scott */
			System.out.println("List of Table of user  SYSTEM");
			/*
			 * getTables(catalog, schema,tablename,tabletype)
			 */
			ResultSet tlist = dbmd.getTables(null, "SYSTEM", "%", null);
			// display name of all tables
			while (tlist.next()) {
				System.out.println(tlist.getString("TABLE_NAME"));
			}
		} // end of try
		catch (Exception ex) {
			System.out.println("Error : " + ex);
		}

	} // end of main
} // end of class
