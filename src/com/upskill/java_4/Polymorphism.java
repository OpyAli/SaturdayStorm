package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType {

	public static void main(String[] args) {
		car(6, "duel");
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();

	}
	
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		int rentalIncome = 25000;
		int sideHustle = 25000;
		int bonus = 25000;
		int calculateNewAnnuaLIncome = calculateAnnualIncome + rentalIncome + sideHustle + bonus;
		System.out.println("My Annual Income = " + calculateNewAnnuaLIncome);
	}
	
	public static void car() {
		
		System.out.println("My car is Tesla");
	}
	
	public static void car(int seat) {
		
		System.out.println("My car is Tesla! It has seat " +  seat);
	}
	
	public static void car(String color) {
		
		System.out.println("My car is Tesla! It has color " +  color);
		
	}
	
	public static void car(int wheel, String motor) {
		
		System.out.println("My car is Tesla! It has wheel " +  wheel + ", It has motor " + motor);
	}

}
