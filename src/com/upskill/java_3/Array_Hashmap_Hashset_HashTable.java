package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {

		int age = 30;
		
		int[] ageStorm = new int[] {25, 30, 18, 28, 32};
		
		
		String[] nameStorm = new String[] {"Opy", "Anzia", "Sabiha"};
		
		
		for (int i=0; i<=nameStorm.length - 1; i++ ) {
			System.out.println(nameStorm[i]);
		}
		
		int[][] ageStorm2D = new int[][] { {25, 30, 18, 28, 32}, 
										   {24, 31, 19, 24}};	  
        
		System.out.println("Student Age 2D : " + ageStorm2D[1][1]);
		

		HashMap<String, String> Capital = new HashMap<String, String>();
		Capital.put("Canada", "Ottawa");
		Capital.put("France", "Paris");
		Capital.put("Japan", "Tokyo");
		Capital.put("Egypt", "Cairo");
		
		System.out.println("HashMap Capital: " + Capital.get("Japan"));
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("Canada", "North America");
		Region.put("France", "Europe");
		Region.put("Japan", "Asia");
		Region.put("Egypt", "Africa");
		
		System.out.println("Hashtable Region: " + Region.get("Japan"));
		
		HashSet<String> car = new HashSet<String>();
		car.add("Lexus");
		car.add("Acura");
		car.add("Infinity");
		car.add("Toyota");
		
		System.out.println("Car: " + car);
		
		
		
		
		}
	}

