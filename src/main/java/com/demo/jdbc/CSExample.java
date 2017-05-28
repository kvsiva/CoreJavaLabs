package com.demo.jdbc;

/*
Program to update salary of an employee using 
CallableStatement.

Make sure Oracle database has UPDATESALARY stored procedure before you 
run this program.

create or replace procedure UpdateSalary(p_empno number, p_sal number) as
 begin
    update emp set sal=p_sal where empno=p_empno;
    commit;
 end; 
*/

import java.sql.*;

public class CSExample {

	public static void main(String args[]) {
		if (args.length < 2) {
			System.out.println("CSExample   empno  newsal");
			System.exit(1);
		}

		try {
			// load oracle thin driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "tiger");

			CallableStatement cs = con.prepareCall("{call UpdateSalary(?,?)}");
			// set employ number
			cs.setInt(1, Integer.parseInt(args[0]));
			// set salary
			cs.setInt(2, Integer.parseInt(args[1]));
			// execute update command
			cs.executeUpdate();
			con.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex);
		}

	} // end of main

} // end of TestConnection
