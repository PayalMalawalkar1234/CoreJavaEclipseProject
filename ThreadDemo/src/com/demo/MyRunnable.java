package com.demo;

public class MyRunnable extends Runnable {
	@Override
	public void run() throws InterruptedException {
		// TODO Auto-generated method stub

		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);
		}

	}

}
