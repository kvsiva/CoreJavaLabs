package com.demo.jdbc;

//program to display a picture taken from BLOB in a Framebased application

/* -------------------------------------------------------------------------------
create table players
(  name varchar2(20),
   photo blob 
);
------------------------------------------------------------------------------- */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;

public class DisplayBLOB extends JFrame implements ActionListener {
	Connection con;
	Statement st;
	ResultSet rs;

	JLabel lblimage = new JLabel();
	JLabel lblname = new JLabel();

	JButton btnNext, btnPrev;

	public static void main(String args[]) {
		new DisplayBLOB();
	}

	public ResultSet getResultSet() throws Exception {
		// load oracle driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// connect using OCI driver assuming program runs on the same machine as
		// Oracle9i
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "tiger");
		st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		rs = st.executeQuery("select name,photo from players");
		rs.next();
		return rs;
	}

	class WinCode extends WindowAdapter {
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
	}

	public DisplayBLOB() {

		super("Players");
		this.addWindowListener(new WinCode());

		try {
			rs = getResultSet();
			// create buttons
			btnNext = new JButton("Next");
			btnPrev = new JButton("Prev");

			btnNext.addActionListener(this);
			btnPrev.addActionListener(this);

			JPanel p = new JPanel();
			p.setLayout(new FlowLayout());
			p.add(btnPrev);
			p.add(btnNext);

			Container c = getContentPane();

			lblname.setHorizontalAlignment(SwingConstants.CENTER);
			lblimage.setHorizontalAlignment(SwingConstants.CENTER);

			c.add(lblname, "North");
			c.add(lblimage, "Center");

			c.add(p, "South");

			setSize(400, 400);
			setVisible(true);

			displayPlayer();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void displayPlayer() throws Exception {

		// display details of a player from current row in ResultSet

		lblname.setText(rs.getString(1));
		Blob photo = rs.getBlob(2);

		byte b[] = new byte[(int) photo.length()];

		InputStream is = photo.getBinaryStream();

		is.read(b);

		Toolkit tk = Toolkit.getDefaultToolkit();
		Image image = tk.createImage(b); // create an image from array of bytes
		Icon img = new ImageIcon(image);
		lblimage.setIcon(img);

	}

	public void actionPerformed(ActionEvent evt) {
		try {

			if (evt.getSource() == btnNext) {
				if (!rs.isLast()) // if not at the last row in resultset
					rs.next();
			} else {
				if (!rs.isFirst()) // if not at the first row in resultset
					rs.previous();
			}

			displayPlayer();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

} // end of DisplayBlob
