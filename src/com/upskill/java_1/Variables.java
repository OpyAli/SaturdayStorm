package com.upskill.java_1;

public class Variables {
	String country = "USA";
	static String region = "North America";

	public static void main(String[] args) {
		
		 Variables obj = new Variables();
		 obj.NY("Queens");
		 
		System.out.println(region);
		System.out.println(obj.country);

	}
	
	public void NJ() {
		
		String city = "Paterson";
		System.out.println(city);
		System.out.println(country);
	}
	
	public void NY(String county) {
		
		String city = "Jackson Heights";
		System.out.println(city);
		System.out.println(country);
		System.out.println(county);
	}
	
	public void CT() {
		
		String city = "Hartfort";
		System.out.println(city);
		System.out.println(country);
	}

}
