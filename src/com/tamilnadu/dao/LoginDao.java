package com.tamilnadu.dao;

import com.tamilnadu.beans.LoginBean;

import java.sql.*;

public class LoginDao {
	
	static Connection currentCon = null;
	static ResultSet rs = null;
	public static LoginBean login(LoginBean bean) {
		//preparing some objects for connection 
		Statement stmt = null;
		String username = bean.getUsername();
		String password = bean.getPassword();
		String searchQuery = "select * from userdetails where username='" + username + "' and password='" + password + "'";
		
		// "System.out.println" prints in the console; Normally used to trace the process 
		System.out.println("Your user name is " + username);
		System.out.println("Your password is " + password);
		System.out.println("Query: "+searchQuery);
		
		try
		{
			//connect to DB 
			currentCon = DB.getConnection();
			stmt=currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean more = rs.next();
			
			// if user does not exist set the isValid variable to false 
			
			if (!more) {
				System.out.println("Sorry, you are not a registered user! Please sign up first");
				bean.setValid(false);
				}
			//if user exists set the isValid variable to true 
			
			else if (more) {
				String Name = rs.getString("Name");
				String Email = rs.getString("Email");
				System.out.println("Welcome " + Name);
				bean.setName(Name);
				bean.setEmail(Email);
				bean.setValid(true);
				}
			}
		catch (Exception ex) {
			System.out.println("Log In failed: An Exception has occurred! " + ex);
			}
		//some exception handling finally 
		{
			if (rs != null) {
				
				try
				{
					rs.close();
					}
				catch (Exception e) {}
				rs = null;
				}
			if (stmt != null) {
				
				try
				{
					stmt.close();
					}
				catch (Exception e) {}
				stmt = null;
				}
			if (currentCon != null) {
				
				try
				{
					currentCon.close();
					}
				catch (Exception e) { }
				currentCon = null;
				}
			}
		return bean;
		}
	}