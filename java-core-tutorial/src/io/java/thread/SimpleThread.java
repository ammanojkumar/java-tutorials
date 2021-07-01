package io.java.thread;

public class SimpleThread {

	synchronized void print(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SimpleThread st = new SimpleThread();
		new Thread(() -> st.print(5)).start();
		new Thread(() -> st.print(3)).start();
		new Thread(() -> st.print(8)).start();
	}
}
