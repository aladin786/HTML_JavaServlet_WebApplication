package com.tamilnadu.dao;

import java.sql.*;

public class DB {
	
	static Connection con;
	static String url;
	public static Connection getConnection() {
		
		try
		{
			String url = "jdbc:mysql://localhost:3307/loginpage";
			// assuming "DataSource" is your DataSource name 
			
			Class.forName("com.mysql.jdbc.Driver");
			
			try
			{
				con = DriverManager.getConnection(url,"root","test");
				// assuming your SQL Server's username is "username" 
				// and password is "password" 
				}
			catch (SQLException ex) {
				ex.printStackTrace();
				}
			}
		catch(ClassNotFoundException e) {
			System.out.println(e);
			}
		return con;
		}
	}