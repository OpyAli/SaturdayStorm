package com.upskill.java_6;

public class MultiThreading {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			MultithreadingThread obj = new MultithreadingThread();
			obj.start();
			
			Thread obj2 = new Thread( new MultithreadingRunable());
			obj2.start();
		}

	}

}
