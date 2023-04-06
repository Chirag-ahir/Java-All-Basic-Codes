package com.miit.Interrupt;

class InterruptThreadMethod implements Runnable {

	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " is running.");
		} catch (InterruptedException e) {
			System.out.println("Exception occured");
		}
	}
}

public class InterruptThread{
	public static void main(String[] args){
		
		Thread T1 = new Thread(new InterruptThreadMethod());
		Thread T2 = new Thread(new InterruptThreadMethod());
		T1.setName("Thread 1");
		T2.setName("Thread 2");
		
		T1.start();
		System.out.println("State of Thread 1 before interruption: " + T1.getState());
//		T1.interrupt();
//		System.out.println("State of Thread 1 after interruption: " + T1.getState());
		
		T2.start();
	}
}