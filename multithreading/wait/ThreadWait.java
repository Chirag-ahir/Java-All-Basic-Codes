package com.miit.wait;

public class ThreadWait {

	private static Object obj = new Object();

	public static void main(String[] args) throws InterruptedException {
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getState());
			System.out.println(Thread.currentThread().getName() + " Thread is woken after one second");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (obj) {
			obj.wait(2000);
			System.out.println(obj + " Object is in waiting state and woken after 2 seconds");
		}
	}

}
