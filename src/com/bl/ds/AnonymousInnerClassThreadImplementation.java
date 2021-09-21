package com.bl.ds;

public class AnonymousInnerClassThreadImplementation {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread");
				}

			}
		};
		Thread thread = new Thread(runnable);
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
