package io.java.thread;

public class DeadLock {

	public static void main(String[] args) {
		String s1 = "s1";
		String s2 = "s2";

		Runnable r1 = () -> {
			synchronized (s1) {
				System.out.println("Thread 1, locked s1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				synchronized (s2) {
				}
			}
		};

		Runnable r2 = () -> {
			synchronized (s2) {
				System.out.println("Thread 2, locked s2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				synchronized (s1) {
				}
			}
		};

		new Thread(r1).start();
		new Thread(r2).start();
	}
}
