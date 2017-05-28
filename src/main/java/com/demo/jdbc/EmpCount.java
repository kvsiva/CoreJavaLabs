package com.demo.jdbc;

/*
Program to call a function using callable statement.

Make sure stored function GETEMPCOUNT is already created
in Oracle database before you run this program.

create or replace function GetEmpCount(p_deptno number) return number as
    v number(3);
     begin
       select count(*) into v from emp where deptno=p_deptno;
       return v;
     end;

*/
import java.sql.*;

public class EmpCount {

	public static void main(String args[]) {
		if (args.length < 1) {
			System.out.println("EmpCount   deptno");
			System.exit(1);
		}
		try {
			// load oracle thin driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "tiger");
			// create a callable statement
			CallableStatement cs = con.prepareCall("{?=call GetEmpCount(?)}");

			// specify the return type
			cs.registerOutParameter(1, Types.INTEGER);

			cs.setInt(2, Integer.parseInt(args[0]));

			// execute EMPCOUNT function
			cs.execute();
			// display the return value of the function
			System.out.println("No.of Employees : " + cs.getInt(1));
			cs.close();
			con.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex);
		}
	} // end of main

} // end of TestConnection
