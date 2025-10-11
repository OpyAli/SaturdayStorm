package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	@Override
	public void icar() {
		System.out.println("Tesla");		
		
	}

	@Override
	public void icolor() {
		System.out.println("Red");
		
	}

	@Override
	public int iseat() {
		return 7;
	}

	@Override
	public int iwheel() {
		return 4;
	}

	@Override
	public void idoor() {
		System.out.println(4);		
	}

}
