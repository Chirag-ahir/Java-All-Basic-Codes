package com.miit.exercise;

public class Test2 extends Thread {
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(getName() + " RUN:" + i);
		}
	}

	public static void main(String[] args) {
		Test2 mt1 = new Test2();
		mt1.start();
		Test2 mt2 = new Test2();
		mt2.start();
	}
}