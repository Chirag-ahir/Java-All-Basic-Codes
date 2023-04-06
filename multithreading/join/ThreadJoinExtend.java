package com.miit.join;

class ThreadJoinExtend extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		ThreadJoinExtend t1 = new ThreadJoinExtend();
		ThreadJoinExtend t2 = new ThreadJoinExtend();
		ThreadJoinExtend t3 = new ThreadJoinExtend();
		
		t1.start();
		try {
			t1.join();
			System.out.println(t2.getState());
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}
