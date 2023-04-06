package com.miit.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Java Thread pool represents a group of worker threads that are waiting for the job and reused many times.

public class ThreadPoolDemo {
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(2); //creating 2 fixed thread

		//First two thread will run in group
		MessageProcessor MP1 = new MessageProcessor(1);
		executor.execute(MP1);
		
		MessageProcessor MP2 = new MessageProcessor(2);
		executor.execute(MP2);
		
		//Third thread will run separately because threadpool size only 2
		MessageProcessor MP3 = new MessageProcessor(3);
		executor.execute(MP3);
		
		executor.shutdown(); //Rejects further new tasks
		//executor.shutdownNow(); //Immediately shutdown process
		
		while(!executor.isTerminated()) {}
		
		System.out.println("Submitted all tasks..");						
	}
}
