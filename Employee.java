package com.greatlearning.model;

public class Employee {
	private String fname;
	private String lname;
	private String emailid;
	private String password;
	public Employee(String fname, String lname) {
		
		this.fname = fname;
		this.lname = lname;
	}
	
	public Employee() {}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
