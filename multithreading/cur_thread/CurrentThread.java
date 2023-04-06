package com.miit.cur_thread;

class CurrentThread implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		Thread T1 = new Thread(new CurrentThread());
		T1.setName("Thread1");
		T1.start();
		
		//set name will set new name of our current thread
	}

}
