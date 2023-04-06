//https://dotnettutorials.net/lesson/multithreading-exercises-in-java/
package com.miit.exercise;

public class Test1 extends Thread {
	public void run() {
		for (int i = 0; i <= 50; i++) {
			System.out.println("Run: " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Test1 T1 = new Test1();
		T1.run();
		T1.start();
		for (int i = 0; i <= 50; i++) {
			System.out.println("Main: " + i);
		}
	}
}
