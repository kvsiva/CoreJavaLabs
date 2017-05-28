package com.demo.jdbc;

/* 
Program to take an SQL command from user and execute it.
Uses TableModel to display data in a table.
*/

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class JDBCLab2 extends JFrame implements ActionListener {
	JTable table;
	JTextField tfquery;
	JButton btn;

	public static void main(String args[]) {
		new JDBCLab2();
	}

	public JDBCLab2() {
		super("Query");
		tfquery = new JTextField(30);
		btn = new JButton("Execute");
		table = new JTable();
		JScrollPane sp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		Container c = getContentPane();
		JPanel tp = new JPanel(new FlowLayout());
		tp.add(tfquery);
		tp.add(btn);
		btn.addActionListener(this);

		c.add(tp, "North");
		c.add(sp);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {

		table.setModel(new TableData(tfquery.getText()));
		table.createDefaultColumnsFromModel();
	}

}

class TableData extends AbstractTableModel {
	Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData rsmd;
	int nrows;

	public TableData(String query) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "tiger");
			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = st.executeQuery(query);
			rsmd = rs.getMetaData();
			// get row count
			nrows = 0;
			while (rs.next()) {
				nrows++;
			}
			rs.beforeFirst();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public Object getValueAt(int row, int column) {
		try {
			rs.absolute(row + 1);
			return rs.getString(column + 1);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public int getColumnCount() {
		try {
			return rsmd.getColumnCount();
		} catch (Exception ex) {
		}
		return 0;
	}

	public int getRowCount() {
		return nrows;
	}

	public String getColumnName(int index) {

		try {
			return rsmd.getColumnName(index + 1);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public Class getColumnClass(int index) {
		return String.class;
	}

}
