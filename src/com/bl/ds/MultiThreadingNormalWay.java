package com.bl.ds;

class MyRunnable implements Runnable {
	
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
}

public class MultiThreadingNormalWay {
	
public static void main(String[] args) {
	MyRunnable myRunnable = new MyRunnable();
	Thread thread = new Thread(myRunnable);
	thread.start();
	for (int i = 0; i < 10; i++) {
		System.out.println("Main Thread");
	}
	}
}
