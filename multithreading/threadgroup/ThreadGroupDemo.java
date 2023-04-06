package com.miit.threadgroup;
//ThreadGroup creates a group of threads. It offers a convenient way to manage groups of threads as a unit. 

class ThreadDemo implements Runnable {
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Starting execution - Current Thread name: " + Thread.currentThread().getName());
	}
}

class ThreadGroupDemo {
	public static void main(String[] args) throws InterruptedException {

		ThreadGroup TG1 = new ThreadGroup("Parant Group"); // creating a thread group TG1
		ThreadGroup TG2 = new ThreadGroup(TG1, "Child Group"); // creating a thread group TG2
		
		System.out.println("First group name: " + TG1.getName());
		System.out.println("Second group name: " + TG2.getName());
		System.out.println("Parant group name: " + TG1.getParent().getName()); // fetch parent group name

		Thread T1 = new Thread(TG1, new ThreadDemo(), "one"); //constructor
		Thread T2 = new Thread(TG1, new ThreadDemo(), "two");
		Thread T3 = new Thread(TG1, new ThreadDemo(), "three");
		// tg1 is the thread group name, ThreadDemo is the class that implements
		// Runnable interface and "one", "two" and "three" are the thread names.

		Thread T4 = new Thread(TG2, new ThreadDemo(), "four");
		Thread T5 = new Thread(TG2, new ThreadDemo(), "five");

		T1.start();
		T1.join();
		T2.start();
		T2.join();
		T3.start();
		T3.join();
		T4.start();
		T4.join();
		T5.start();
		T5.join();

		// returns an estimate of the number of active groups in the thread group and
		// its subgroups.
		System.out.println("number of active groups in TG1: " + TG1.activeGroupCount());
		System.out.println("number of active groups in TG2: " + TG2.activeGroupCount());

		// returns an estimate of the number of active threads in the thread group and
		// its subgroups.
		System.out.println("number of active threads in TG1: " + TG1.activeCount());
		System.out.println("number of active threads in TG2: " + TG2.activeCount());

		// TG1.interrupt();

		//enumerate method used for copying active threads into a specified array.
		Thread[] tarray = new Thread[TG1.activeCount()];
		int count1 = TG1.enumerate(tarray);

		for (int i = 0; i < count1; i++) {
			System.out.println(tarray[i].getName() + " =====> Found");
		}
		
		//get max priority method
		System.out.println(TG1.getMaxPriority()); 

		TG1.list();
		TG2.list();

	}
}