package com.upskill.java_4;

public class Encapsulation {
	
	private int mobileNumber = 58634234;
	private int ssn = 564564;
	private String username = "upskill";
	private String password = "upskill123";
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String pass) {
		password = pass;
	}
	
	
	public int getMobileNumber () {
		return mobileNumber;
	}
	
	public void setSnn(int social) {
		ssn = social;
		
	}
	
	

	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		obj.getMobileNumber();
		obj.setSnn(345342);
		
	

	}

}
