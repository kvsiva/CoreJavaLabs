package com.demo.jdbc;
//program to read data from CLOB column

/* -------------------------------------------------------------------------------
create table lobs
( id number(2),
  resume  clob
);
--------------------------------------------------------------------------------- */

//This program assumes you have created a table given above and inserted a row with 
//ID 1 and some value for CLOB

import java.sql.*;
import java.io.*;

public class CLOBRead {
	public static void main(String args[]) {

		try {
			// load oracle driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// connect using OCI driver assuming program runs on the same
			// machine as Oracle9i
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "tiger");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from lobs where id = 1");
			rs.next();

			Clob clob = rs.getClob(2); // get lob from second column

			InputStream is = clob.getAsciiStream(); // get stream to read data
													// from lob

			int ch;

			while ((ch = is.read()) != -1)
				System.out.print((char) ch);

			rs.close();
			st.close();
			con.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	} // end of main

} // end of CLOBRead
