package com.quinnox.payrollServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivity {
	public static final String URL = "jdbc:mysql://localhost:3306/payroll";
	public static final String user = "root";
	public static final String password = "Password@1";
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException  
	{
		System.out.println("Connecting to  Database...");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL, user,password);
		
		if(con.isValid(3))
		{
			System.out.println("Connected to Database.");
		}
		
		return con;
}
}
