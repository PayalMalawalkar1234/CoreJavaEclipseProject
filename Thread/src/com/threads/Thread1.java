package com.threads;

public class Thread1 extends Thread {

	Thread1() {

	}

	Thread1(String name) {
		super(name);

	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread() + " " + i);

		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread1();
		Thread t3 = new Thread1();

		t1.start();
		try {
			t1.join(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();

		}

		t2.start();
	}
}
