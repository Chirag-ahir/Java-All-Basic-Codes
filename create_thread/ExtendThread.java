package com.miit.multi_threading;

public class ExtendThread extends Thread{
	
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("Thread method demo");
			
			try {
				System.out.println("thread is going to sleep");
				ExtendThread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ExtendThread ET = new ExtendThread();
		System.out.println("Getstate1"+ET.getState());
		ET.start();
		System.out.println("Getstate2"+ET.getState());
		System.out.println("Getstate3"+ET.getState());
		System.out.println("thread Name"+ET.getName());
		System.out.println("thread Priority"+ET.getPriority());
		System.out.println("getstate5"+ET.getState());
	}
	
}
