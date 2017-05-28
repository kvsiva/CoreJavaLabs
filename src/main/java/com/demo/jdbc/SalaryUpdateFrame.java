package com.demo.jdbc;

//Update salary using Frame

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SalaryUpdateFrame extends JFrame implements ActionListener {
	Connection con;
	PreparedStatement ps;
	JTextField tfEmpno, tfSal;
	JButton btnUpdate, btnExit;
	JLabel lblMsg;

	public SalaryUpdateFrame() {
		super("Employee Salary Update");
		try {
			// get connection
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "tiger");

			// create PreparedStatement

			ps = con.prepareStatement("update emp set sal  = ? where empno = ? ");

		} catch (Exception ex) {
		}
		// user interface

		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 1));

		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());

		tfEmpno = new JTextField(10);
		tfSal = new JTextField(10);

		p1.add(new JLabel("Employee Number"));
		p1.add(tfEmpno);

		p1.add(new JLabel("New Salary"));
		p1.add(tfSal);

		c.add(p1);

		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());

		lblMsg = new JLabel();

		p2.add(lblMsg);

		c.add(p2);

		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());

		btnUpdate = new JButton("Update");
		btnExit = new JButton("Exit");

		btnUpdate.addActionListener(this);
		btnExit.addActionListener(this);

		p3.add(btnUpdate);
		p3.add(btnExit);

		c.add(p3);

	}

	public void actionPerformed(ActionEvent evt) {

		if (evt.getSource() == btnExit)
			System.exit(0);

		int empno, sal;
		try {
			empno = Integer.parseInt(tfEmpno.getText());
			sal = Integer.parseInt(tfSal.getText());

			ps.setInt(1, sal);
			ps.setInt(2, empno);
			// execute update command
			int updcount = ps.executeUpdate();
			// check status
			if (updcount == 1)
				lblMsg.setText("Updation is successful");
			else
				lblMsg.setText("Invalid Employee Number.");

		} catch (Exception ex) {
			lblMsg.setText(ex.getMessage());
		}
	}

	public void finalize() {
		try {
			ps.close();
			con.close();
		} catch (Exception ex) {
		}
	}

	public static void main(String args[]) {
		SalaryUpdateFrame f = new SalaryUpdateFrame();
		f.setSize(500, 200);
		f.setVisible(true);
	} // end of main
} // end of class
