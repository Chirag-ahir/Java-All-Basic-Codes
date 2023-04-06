package com.miit.daemon;

public class IsDaemon extends Thread{
	
	public void run() {
		System.out.println("User thread or Non-Daemon thread");
	}
	
	public static void main(String[] args) {
		
		IsDaemon T1 = new IsDaemon();
		T1.start();
		
		System.out.println(T1.getName() + " is a Daemon thread ? : " + T1.isDaemon());
	}
}
