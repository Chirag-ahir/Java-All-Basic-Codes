package com.miit.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(5);
		MessageProcessor MP1 = new MessageProcessor(1);
		
		//here group of 5 theread will run in chunk, other 2 thread will run seperately.
		for(int i=1;i<=7;i++) {
			executor.execute(MP1);
		}
		
	}
}
