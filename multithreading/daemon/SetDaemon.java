package com.miit.daemon;

class SetDaemonMethod implements Runnable {

	public void run() {
		// Checking whether the thread is Daemon or not
		if (Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName() + " is Daemon thread");
		}

		else {
			System.out.println(Thread.currentThread().getName() + " is User thread");
		}
	}
}

public class SetDaemon {

	public static void main(String[] args) {

		Thread T1 = new Thread(new SetDaemonMethod());
		Thread T2 = new Thread(new SetDaemonMethod());
		
		T1.setName("Thread T1");
		T2.setName("Thread T2");

		T1.setDaemon(true);
		T1.start();

		T2.start();
		//T2.setDaemon(true); //Will throw Runtime error: IllegalThreadStateException We can't put setDaemon after start the thread.

	}
}
