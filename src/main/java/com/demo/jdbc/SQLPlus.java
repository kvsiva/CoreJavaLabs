package com.demo.jdbc;
/* Program to take an SQL command from user and execute it.

If command is a SELECT command then it
displays selected records.

If command is a DML command it displays number of
records updated.
*/

import java.sql.*;
import java.io.*;

public class SQLPlus {
	public static void main(String args[]) {
		try {
			// load jdbc odbc driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "tiger");

			Statement st = con.createStatement();

			// create a bufferedreader to read commands from
			// keyboard

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String cmd; // string to hold command

			while (true) {
				System.out.print("\nSQL>"); // display prompt
				cmd = br.readLine(); // read command from user
				if (cmd.equals("exit"))
					break;

				try {
					boolean result = st.execute(cmd);
					if (result) // command is a query
						displayResultSet(st.getResultSet());
					else {
						System.out.println("No. of rows updated : " + st.getUpdateCount());
					}
				} // end of try
				catch (Exception ex) {
					System.out.println("Error : " + ex.getMessage());
				}
			} // end of while
			st.close();
			con.close();

		} // end of outer try

		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	} // end of main

	// static method to dispaly the data of the given
	// ResultSet. It uses ResultSetMetaData interface

	public static void displayResultSet(ResultSet rs) throws Exception {
		ResultSetMetaData rsmd = rs.getMetaData();
		int nc = rsmd.getColumnCount();
		// print heading
		String heading = "";
		for (int i = 1; i <= nc; i++) {
			// add | to separate column headings
			if (i != 1)
				heading = heading + " | ";

			heading = heading + rsmd.getColumnName(i);
		} // end of for

		// display heading
		System.out.println(heading);

		// print data
		String data;
		// repeat until rs.next() returns false
		while (rs.next()) {
			// read data from the current record
			data = "";
			for (int i = 1; i <= nc; i++) {
				if (i != 1)
					data = data + " | ";
				data = data + rs.getString(i);
			}
			System.out.println(data);
		} // end of while
		rs.close();
	} // end of function displayResultSet
} // end of class
