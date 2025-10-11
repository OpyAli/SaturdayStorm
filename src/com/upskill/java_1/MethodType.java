package com.upskill.java_1;

public class MethodType extends Variables{
	
/* 	Types of Methods
	 
		1.Void Method
		2.Static Method
		3.Return Type Method  
 */

	public static int hourlyIncome = 65;
	
	public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		
		weeklyIncomeStatic();
		
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
		System.out.println("My Monthly Income = " + obj.nameReturn());
	}
	
	//void Method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
	
	//static Method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
	
	//return Type Method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 40;
		return calculateMonthlyIncome;
	}
	
	//return Type Method
	public String nameReturn(){
		String name = "Anzia";
		return name;
	}
}
