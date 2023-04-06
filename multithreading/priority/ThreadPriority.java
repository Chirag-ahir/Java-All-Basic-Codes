package com.miit.priority;

class ThreadPriority implements Runnable {

	public void run() {
		System.out.println("Inside run method");
	}

	public static void main(String[] args) {
		Thread T1 = new Thread(new ThreadPriority());
		Thread T2 = new Thread(new ThreadPriority());
		Thread T3 = new Thread(new ThreadPriority());

		// Getting priorities of each thread
		System.out.println(T1.getPriority());
		System.out.println(T2.getPriority());
		System.out.println(T3.getPriority() + "\n");

		// Setting priorities of each thread
		T1.setPriority(3);
		T2.setPriority(6);
		T3.setPriority(9);
		// T3.setPriority(13); // Will throw IllegelArgumentException

		System.out.println("t1 thread priority : " + T1.getPriority());
		System.out.println("t2 thread priority : " + T2.getPriority());
		System.out.println("t3 thread priority : " + T3.getPriority() + "\n");

		System.out.println("Currently Executing Thread : " + Thread.currentThread().getName());
		System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
	}
}
