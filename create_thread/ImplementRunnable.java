package com.miit.multi_threading;

//Implements Runnable interface
public class ImplementRunnable implements Runnable {

	public void run() {
		System.out.println("This is thread example");
	}

	public static void main(String[] args) {

		// Creating instance of class
		ImplementRunnable IR = new ImplementRunnable();

		// Creating instance of thread class
		Thread t1 = new Thread(IR);

		// Starting the thread
		t1.start();

		//Some thread methods
		System.out.println(t1.getState());
		System.out.println(t1.getName());
	}
}
