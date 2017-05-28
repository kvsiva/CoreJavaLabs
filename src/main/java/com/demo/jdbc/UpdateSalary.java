package com.demo.jdbc;

import java.sql.*;

public class UpdateSalary {

	public static void main(String args[]) {

		try {
			//load type4 driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "tiger");
			// create a statement object
			Statement st = con.createStatement();
			String cmd = "update HR.EMPLOYEES set salary=50000  where EMPLOYEE_ID = 100";

			// execute update command, and store record count
			// in result variable
			int result = st.executeUpdate(cmd);
			if (result == 1)
				System.out.println(" Updation is successful");
			else
				System.out.println(" Updation is unsuccessful");
		} catch (Exception ex) {
			System.out.println("Error : " + ex);
		}
	} // end of main
} // end of UpdateSalary
