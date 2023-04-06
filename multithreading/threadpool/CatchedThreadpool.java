package com.miit.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CatchedThreadpool {
	public static void main(String[] args) {

		ExecutorService executor = Executors.newCachedThreadPool();
		MessageProcessor MP1 = new MessageProcessor(1);

		// This thread pool creates new threads when required. If no thread is available
		// to execute the submitted task, then a new thread will be created.
		for (int i = 0; i <= 7; i++) {
			executor.execute(MP1);
		}

	}
}
