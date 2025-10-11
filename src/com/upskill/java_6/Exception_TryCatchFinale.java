package com.upskill.java_6;

public class Exception_TryCatchFinale {
	
	public static void main(String[] args) {
		try {
			int[] ageStorm = new int[] {25, 35, 29, 32, 21};
			System.out.println("Student age = " + ageStorm[10]);
		} catch(Exception e){
			e.printStackTrace();
			System.out.println("Test Completed");
		}
		
		try {
			int num = Integer.parseInt("Test");
			
		} catch(NumberFormatException e){
			e.printStackTrace();
			System.out.println("Test complete");
			
		}
		
		try {
			
		} catch() {
			
		}
		
	}

}
