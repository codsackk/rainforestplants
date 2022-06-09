package com.revature.models;

public class User {
	private int user_ID;
	private String username;
	private String password;
	//private double bank;
	public int getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int user_ID, String username, String password) {
		super();
		this.user_ID = user_ID;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [user_ID=" + user_ID + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
