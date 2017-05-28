package com.demo.jdbc;

//Program to get phone number of a employee 
//PreparedStatement interface

import java.sql.*;
import java.util.Scanner;

public class PSExample2 {

	public static void main(String args[]) {
		// check whether required parameter are passed
		/*if (args.length < 1) {
			System.out.println("PS2Example Name");
			System.exit(1);
		}*/

		try {
			// load oracle thin driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "tiger");

			// create a prepared statement statement object
			// Each ? represents a parameter
			PreparedStatement ps = con.prepareStatement("select PHONENO from phones where name=?");

			Scanner scn = new Scanner(System.in);
			System.out.println("Enter Name of Employee:");
		    String name = scn.nextLine();
		    
		    // set name
		 	ps.setString(1, args[0]);
  

			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				System.out.println("Phone Number of " + args[0] + ":" + resultSet.getInt(1));
			}

		} catch (Exception ex) {
			System.out.println("Error : " + ex);
		}

	} // end of main

} // end of TestConnection
