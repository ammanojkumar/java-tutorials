package io.java.thread;

public class SignalJoinTest {

	void processSignal(int id) {
		try {
			System.out.print("Signal:" + id + " opens..\t");
			Thread.sleep(2000);
			System.out.println("Signal:" + id + " closed");
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		SignalJoinTest thr = new SignalJoinTest();
		int i = 0;
		while (i++ < 8) {
			int j = i % 4 == 0 ? 4 : i % 4;
			Thread t = new Thread(() -> thr.processSignal(j));
			t.start();
			t.join();
		}
	}
}
