package com.demo.jdbc;

import java.sql.*;

public class EmpList {
	public static void main(String args[]) {
		try {
			// load driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// get a connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "tiger");
			// create a statement
			Statement st = con.createStatement();

			// execute a query- rs contains set of records retrieved
			ResultSet rs = st.executeQuery("select * from  hr.employees");

			// move to next record in the resultset.
			// next() returns false on EOF
			while (rs.next()) {
				// display empno and ename
				System.out.println(rs.getInt("employee_id") + " - " + rs.getString("first_name"));
			} // end of while

			rs.close();
			st.close();
			con.close();
		} // end of try
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	} // end of main
} // end of class
