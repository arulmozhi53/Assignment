package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel name;
	private JLabel fullname;
	private JLabel lblcustomerid;

	private JTextField tname;
	private JLabel mno;
	private JTextField tfullname;
	private JLabel gender;
	private ButtonGroup gengp;
	private JLabel lblPostCode;
	private JLabel lbladd;

	private JTextArea tadd1;
	private JTextArea tadd_2;
	private JTextArea tadd_3;

	private JTextArea tcustomerid;

	private JTextArea tpostcode_1;

	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;

	private String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
	private String months[] = { "Jan", "feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sup", "Oct", "Nov", "Dec" };
	private String years[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005",
			"2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018",
			"2019" };

	// constructor, to initialize the components
	// with default values.
	public MyFrame() {
		setTitle("Customer Form");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Customer Information Form");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(429, 50);
		title.setLocation(124, 11);
		c.add(title);

		name = new JLabel("Short Name");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(126, 40);
		name.setLocation(34, 88);
		c.add(name);

		fullname = new JLabel("Full Name");
		fullname.setFont(new Font("Arial", Font.PLAIN, 20));
		fullname.setSize(100, 40);
		fullname.setLocation(34, 138);
		c.add(fullname);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
		c.add(tname);

		/*
		 * mno = new JLabel("Post code"); mno.setFont(new Font("Arial", Font.PLAIN,
		 * 20)); mno.setSize(100, 20); mno.setLocation(100, 150); c.add(mno);
		 */

		tfullname = new JTextField();
		tfullname.setFont(new Font("Arial", Font.PLAIN, 15));
		tfullname.setSize(190, 20);
		tfullname.setLocation(200, 150);
		c.add(tfullname);

		/*
		 * gender = new JLabel("Gender"); gender.setFont(new Font("Arial", Font.PLAIN,
		 * 20)); gender.setSize(100, 20); gender.setLocation(100, 200); c.add(gender);
		 */

		lblcustomerid = new JLabel("Customer ID");
		lblcustomerid.setFont(new Font("Arial", Font.PLAIN, 20));
		lblcustomerid.setSize(145, 22);
		lblcustomerid.setLocation(34, 198);
		c.add(lblcustomerid);

		JTextArea tcustomerid = new JTextArea();
		tcustomerid.setLineWrap(true);
		tcustomerid.setFont(new Font("Arial", Font.PLAIN, 15));
		tcustomerid.setBounds(200, 200, 200, 30);

		c.add(tcustomerid);

		getContentPane().add(tcustomerid);

		gengp = new ButtonGroup();

		lblPostCode = new JLabel("Post code");
		lblPostCode.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPostCode.setSize(100, 20);
		lblPostCode.setLocation(34, 291);
		c.add(lblPostCode);

		JTextArea tpostcode_1 = new JTextArea();
		tpostcode_1.setLineWrap(true);
		tpostcode_1.setFont(new Font("Arial", Font.PLAIN, 15));
		tpostcode_1.setBounds(200, 281, 200, 30);
		getContentPane().add(tpostcode_1);

		// Post code validation
		String postcode1 = tpostcode_1.toString();
		System.out.println("postcode1 :" + postcode1);
		String regex = "\\{6}?";
		System.out.println("Is the above post  code valid? " + postcode1.matches(regex));

		lbladd = new JLabel("Address 1");
		lbladd.setFont(new Font("Arial", Font.PLAIN, 20));
		lbladd.setSize(100, 20);
		lbladd.setLocation(34, 335);
		c.add(lbladd);

		tadd1 = new JTextArea();
		tadd1.setFont(new Font("Arial", Font.PLAIN, 15));
		tadd1.setSize(200, 30);
		tadd1.setLocation(200, 336);
		tadd1.setLineWrap(true);
		c.add(tadd1);

		/*
		 * term = new JCheckBox("Accept Terms And Conditions."); term.setFont(new
		 * Font("Arial", Font.PLAIN, 15)); term.setSize(250, 20); term.setLocation(150,
		 * 400); c.add(term);
		 */

		sub = new JButton("Add");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(88, 520);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Modify");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(217, 520);
		reset.addActionListener(this);
		c.add(reset);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(88, 527);
		c.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		c.add(resadd);

		JLabel lblAddress2 = new JLabel("Address 2");
		lblAddress2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAddress2.setBounds(34, 389, 100, 20);
		getContentPane().add(lblAddress2);

		JTextArea tadd_2 = new JTextArea();
		tadd_2.setLineWrap(true);
		tadd_2.setFont(new Font("Arial", Font.PLAIN, 15));
		tadd_2.setBounds(200, 390, 200, 30);

		c.add(tadd_2);

		getContentPane().add(tadd_2);

		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Arial", Font.PLAIN, 15));
		btnDelete.setBounds(329, 520, 100, 20);
		getContentPane().add(btnDelete);

		JTextArea tcity = new JTextArea();
		tcity.setLineWrap(true);
		tcity.setFont(new Font("Arial", Font.PLAIN, 15));
		tcity.setBounds(200, 240, 200, 30);
		getContentPane().add(tcity);

		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCity.setBounds(34, 245, 145, 22);
		getContentPane().add(lblCity);

		JLabel lblAddress_3 = new JLabel("Address 3");
		lblAddress_3.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAddress_3.setBounds(34, 439, 100, 20);
		getContentPane().add(lblAddress_3);

		JTextArea tadd_3 = new JTextArea();
		tadd_3.setLineWrap(true);
		tadd_3.setFont(new Font("Arial", Font.PLAIN, 15));
		tadd_3.setBounds(200, 431, 200, 30);
		getContentPane().add(tadd_3);

		term = new JCheckBox("Accept Terms And Conditions.");
		term.setFont(new Font("Arial", Font.PLAIN, 15));
		term.setSize(250, 20);
		term.setLocation(124, 480);
		c.add(term);

		setVisible(true);
	}

	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sub) {
			if (term.isSelected()) {
				String data1;
				String data = "Short Name : " + tname.getText() + "\n" + "Full name : " + tfullname.getText() + "\n"

						+ "Address 1 : " + tadd1.getText() + "\n"

				;

				// String data3 = "Address : " + tadd1.getText();
				tout.setText(data);
				tout.setEditable(false);
				// res.setText("Registration Successfully..");

			} else {
				tout.setText("");
				resadd.setText("");
				// res.setText("Please accept the" + " terms & conditions..");
			}
		}

		if (e.getSource() == sub) {
			if (term.isSelected()) {

				// String data1 = null;
				String data = "Short  Name : " + tname.getText() + "\n" + "Full name  : " + tfullname.getText() + "\n"
						+ "Address 1  : " + tadd1.getText() + "\n"

				;

				tout.setText(data);
				tout.setEditable(false);
				res.setText("Registration Successfully..");
			} else {
				tout.setText("");
				resadd.setText("");
				res.setText("Please accept the" + " terms & conditions..");
			}
		}

		else if (e.getSource() == reset) {
			String def = "";
			tname.setText(def);
			tadd1.setText(def);
			tfullname.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			resadd.setText(def);
		}
	}

	/*
	 * else if (e.getSource() == reset) { String def = ""; tname.setText(def);
	 * tadd1.setText(def); tfullname.setText(def); res.setText(def);
	 * tout.setText(def); term.setSelected(false); date.setSelectedIndex(0);
	 * month.setSelectedIndex(0); year.setSelectedIndex(0); resadd.setText(def); }
	 */
}

// Driver Code
class Registration {

	public static void main(String[] args) throws Exception {
		MyFrame f = new MyFrame();
	}
}