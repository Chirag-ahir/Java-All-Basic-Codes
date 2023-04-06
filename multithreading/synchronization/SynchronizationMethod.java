package com.miit.synchronization;

class Table{
	//Here we used synchronized keywords. It helps to execute a single thread at a time. It is not allowing another thread to execute until the first one is completed, after completion of the first thread it allowed the second thread. 
	synchronized void printTable(int n) {
		for(int i=1; i<=10; i++) {
			try {
				System.out.println(n*i);
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class Thread1 implements Runnable{
	Table T;
	Thread1(Table T){
		this.T = T;
	}
	public void run() {
		T.printTable(5);
	}
}

class Thread2 extends Thread{
	Table T;
	Thread2(Table T) {
		this.T = T;
	}
	public void run() {
		T.printTable(10);
	}
}

public class SynchronizationMethod {
	public static void main(String[] args) {
		
		Table obj = new Table();
		Thread T1 = new Thread(new Thread1(obj));
		Thread T2 = new Thread(new Thread2(obj));
		
		T1.start();
		T2.start();
	}
}
