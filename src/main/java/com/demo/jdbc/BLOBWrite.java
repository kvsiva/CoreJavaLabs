package com.demo.jdbc;

//program to write a picture into BLOB column 

/* -------------------------------------------------------------------------------
create table players
(  name varchar2(20),
   photo blob 
);
--------------------------------------------------------------------------------- */

//call program by passing name of the player and image file as parameters.
//Example :  java  BLOBWrite zidane zidane.jpg

import java.sql.*;
import java.io.*;

public class BLOBWrite {
	public static void main(String args[]) {

		try {
			// load oracle driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "tiger");
			con.setAutoCommit(false);

			PreparedStatement ps = con.prepareStatement("insert into players values(?,?)");

			File picfile = new File(args[1]);
			FileInputStream is = new FileInputStream(picfile);

			ps.setString(1, args[0]);
			ps.setBinaryStream(2, is, (int) picfile.length());

			ps.executeUpdate();

			con.commit();

			ps.close();
			con.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	} // end of main

} // end of BLOBWrite
