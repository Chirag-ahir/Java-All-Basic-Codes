package com.miit.isAlive;
//The isAlive() method of thread class tests if the thread is alive. A thread is considered alive when the start() method of thread class has been called and the thread is not yet dead. This method returns true if the thread is still running and not finished.

public class IsAlive implements Runnable {

	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("is run() method isAlive: " + Thread.currentThread().isAlive());
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		Thread T1 = new Thread(new IsAlive());
		
		System.out.println("Before starting thread IsAlive: " + T1.isAlive());
		T1.start();
		System.out.println("After starting thread IsAlive: " + T1.isAlive() + "\n");
		
	}

}
