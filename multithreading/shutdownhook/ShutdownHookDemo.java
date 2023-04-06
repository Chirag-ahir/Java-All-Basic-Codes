package com.miit.shutdownhook;
//The shutdown hooks can be executed at runtime when the java virtual machine is shutting down normally or abruptly.
//SH is a special construct in Java which allows the developers to do a plug in of a piece of code which will be executed during the shutting down of java virtual machine.

class ShutdownThread extends Thread{
	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("The shut down hook is in progress !");
			Thread.sleep(2000);
			System.out.println("Shut down hook task completed...End of the program...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ShutdownHookDemo {
	public static void main(String[] args) {
		try {
			Runtime.getRuntime().addShutdownHook(new ShutdownThread()); //shutdown method
			System.out.println("Beginning of the thread program...");
			System.out.println("The wait time for the thread is two seconds...");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
