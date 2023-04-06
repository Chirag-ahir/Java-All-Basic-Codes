package com.miit.shutdownhook;

public class ShutdownHookAnonymous {
	public static void main(String[] args) {

		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("Shutdownhook completed...");
			}
		});

		System.out.println("Now main sleeping... press ctrl+c to exit");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
