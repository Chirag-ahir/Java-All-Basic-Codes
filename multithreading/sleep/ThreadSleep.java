package com.miit.sleep;

class ThreadSleepMethod implements Runnable {
	public void run() {
		try {
			System.out.println("I am printing before 1 second!");
			Thread.sleep(1000L);
			System.out.println("I am printing after 1 second!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadSleep {
	public static void main(String[] args) {

		Thread T1 = new Thread(new ThreadSleepMethod());

		T1.run();
		System.out.println("State of thread before start: " + T1.getState());

		T1.start();
		System.out.println("State of thread after start: " + T1.getState());

		// When a program calls the start() method, a new thread is created and then the
		// run() method is executed.
		// But if we directly call the run() method then no new thread will be created
		// and run() method will be
		// executed as a normal method call on the current calling thread itself and no
		// multi-threading will take place.

	}
}
