package com.miit.yield;

//Without yield(), though the output changes sometimes, but usually first all producer lines are printed and then all consumer lines.
//With using yield() method, both prints one line at a time and pass the chance to another thread, almost all the time.

class Producer implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Producer : Produced Item " + i);
			Thread.yield();
		}
	}
}

class Consumer implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Consumer : Consumer Item " + i);
			Thread.yield();
		}
	}
}

public class ThreadYield {
	public static void main(String[] args) {
		Thread T1 = new Thread(new Producer());
		Thread T2 = new Thread(new Consumer());

		// T1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(T1.getPriority());

		// T2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(T2.getPriority());

		T1.start();
		T2.start();
	}
}