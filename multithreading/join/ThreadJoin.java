package com.miit.join;

class ThreadJoin1 implements Runnable {
	public void run() {
		System.out.println("First task started");
		System.out.println("Sleeping for 2 seconds");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("First task completed");
	}
}

class ThreadJoin2 implements Runnable{
	public void run() {
		System.out.println("Second task completed");
	}
}

public class ThreadJoin{
	public static void main(String[] args) throws InterruptedException {
		
		Thread T1 = new Thread(new ThreadJoin1());
		Thread T2 = new Thread(new ThreadJoin2());
		
		T1.start();
		T1.join(); //comment T2 in the waiting state
		
		T2.start();
		
		//By using the join method thread 2 will not execute untill thread 1 completely execute. Using join the currently running thread(T2) will block until the Thread instance(T1) has finished executing.
	}
}