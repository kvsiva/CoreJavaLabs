package com.demo.jdbc;

//Program to update salary of an employee using 
//PreparedStatement interface

import java.sql.*;

public class PSExample {

	public static void main(String args[]) {
		// check whether required parameter are passed
		if (args.length < 2) {
			System.out.println("PSExample   empno  newsal");
			System.exit(1);
		}

		try {
			// load oracle thin driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "tiger");

			// create a prepared statement statement object
			// Each ? represents a parameter
			PreparedStatement ps = con.prepareStatement("update emp set sal  = ? where empno = ? ");

			// set salary
			ps.setInt(1, Integer.parseInt(args[1]));

			// set employ number
			ps.setInt(2, Integer.parseInt(args[0]));

			// execute update command
			int updcount = ps.executeUpdate();
			// check status
			if (updcount == 1)
				System.out.println("Updation is successful");
			else
				System.out.println("Updation is unsuccessful");
		} catch (Exception ex) {
			System.out.println("Error : " + ex);
		}

	} // end of main

} // end of TestConnection
