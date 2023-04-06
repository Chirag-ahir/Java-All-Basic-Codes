package com.miit.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newSingleThreadExecutor();
		MessageProcessor MP = new MessageProcessor(1);
		
		executor.execute(MP);
		executor.submit(MP);
		
		executor.shutdown();
//		<!--Interview question-->
//		What is the difference between executor.execute() and executer.submit() method in java thread pool?
//		Execute Method can accept only runnable task while Submit Method can accept both runnable and callable tasks.
//		Execute Method has a return type of void while Submit Method has a return type of Future.

	}

}
