package com.demo.jdbc;

//Display details of EMP table and allow user to scroll 

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmployeeFrame extends JFrame implements ActionListener {
	ResultSet rs;
	JTextField txtempno, txtename, txtsal;

	JButton btnFirst = new JButton("First");
	JButton btnLast = new JButton("Last");

	JButton btnPrev = new JButton("Prev");
	JButton btnNext = new JButton("Next");

	public EmployeeFrame() {
		super("Employees");

		try {
			rs = getEmployees();
			createInterface();
			rs.next();
			displayRecord();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		setSize(300, 300);
		setVisible(true);

	} // end of constructor

	public void createInterface() {
		txtempno = new JTextField(10);
		txtename = new JTextField(30);
		txtsal = new JTextField(10);

		// setLayout to flow

		Container c = getContentPane();

		JPanel cp = new JPanel();

		cp.setLayout(new GridLayout(3, 2));

		cp.add(new JLabel("Employee Number"));
		cp.add(txtempno);
		cp.add(new JLabel("Employee Name"));
		cp.add(txtename);
		cp.add(new JLabel("Employee Salary"));
		cp.add(txtsal);

		c.add(cp, "Center");

		JPanel buttons = new JPanel();

		btnFirst.addActionListener(this);
		btnPrev.addActionListener(this);
		btnNext.addActionListener(this);
		btnLast.addActionListener(this);

		buttons.add(btnFirst);
		buttons.add(btnPrev);
		buttons.add(btnNext);
		buttons.add(btnLast);

		c.add(buttons, "South");

	}

	public ResultSet getEmployees() throws Exception {

		// load oracle driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// connect using Thin driver
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "tiger");

		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		return (st.executeQuery("select empno,ename,sal from emp"));

	}

	public void displayRecord() throws Exception {

		txtempno.setText(rs.getString(1));
		txtename.setText(rs.getString(2));
		txtsal.setText(rs.getString(3));

	}

	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == btnFirst) {
				rs.first();
				displayRecord();
			} else if (e.getSource() == btnLast) {
				rs.last();
				displayRecord();
			} else if (e.getSource() == btnNext && !rs.isLast()) {
				rs.next();
				displayRecord();
			} else if (e.getSource() == btnPrev && !rs.isFirst()) {
				rs.previous();
				displayRecord();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static void main(String args[]) {
		EmployeeFrame f = new EmployeeFrame();

	}

} // end of class
