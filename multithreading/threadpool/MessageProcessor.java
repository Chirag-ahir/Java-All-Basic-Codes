package com.miit.threadpool;

public class MessageProcessor implements Runnable {

	int message;

	public MessageProcessor(int message) {
		this.message = message;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " Received message: " + message + "\n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " Acquired message: " + message + "\n");
	}
}
