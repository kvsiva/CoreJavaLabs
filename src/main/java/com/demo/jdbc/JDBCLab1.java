package com.demo.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCLab1 {

	public static void main(String[] args) throws SQLException {
		// Using Statement and ResultSet
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			//String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "tiger");
			Statement statement = connection.createStatement();
			String sqlQuery = "select * from phones";
			ResultSet resultSet = statement.executeQuery(sqlQuery);
			while (resultSet.next()) {
				System.out.println("Name:"+resultSet.getString("NAME"));
				System.out.println("Phone No:"+resultSet.getInt("PHONENO"));
			}
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
