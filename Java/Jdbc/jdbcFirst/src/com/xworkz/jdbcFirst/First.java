package com.xworkz.jdbcFirst;

import java.util.Collection;

public class First {

	public static void main(String[] args) {
		
		try {
			System.out.println("driver is loadded successfully");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Collection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select *from emp");
			while(rs.next())
				System.out.println(rs.getint(1)+" "+rs.getString(2)+ " "+rs.getString(3));
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
