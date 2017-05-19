package com.tamilnadu.beans;

public class LoginBean {
	
	private String username;
	private String password;
	private String name;
	private String email;
	public boolean valid;
	
	public String getName() {
		return name;
		}
	public void setName(String newName) {
		name = newName;
		}
	
	public String getEmail() {
		return email;
		}
	public void setEmail(String newEmail) {
		email = newEmail;
		}
	
	public String getPassword() {
		return password;
		}
	public void setPassword(String newPassword) {
		password = newPassword;
		}
	
	public String getUsername() {
		return username;
		}
	public void setUsername(String newUsername) {
		username = newUsername;
		}
	
	public boolean isValid() {
		return valid;
		}
	public void setValid(boolean newValid) {
		valid = newValid;
		}
	}