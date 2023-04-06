package com.miit.synchronization;

class Label {
	void printTable(int n) {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class MyThread1 extends Thread {
	Label l;

	MyThread1(Label l) {
		this.l = l;
	}
	
	public void run() {
		l.printTable(5);
	}
}

class MyThread2 extends Thread {
	Label l;

	MyThread2(Label l) {
		this.l = l;
	}

	public void run() {
		l.printTable(10);
	}
}

public class SynchronizedBlock {
	public static void main(String[] args) {
		Label obj = new Label();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}

}
