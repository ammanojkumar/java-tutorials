package io.java.thread;

class Ticket {

	boolean check = false;
	int pnr;

	public Ticket(int pnr) {
		super();
		this.pnr = pnr;
	}

	synchronized void processTicket() {
		try {
			notify(); // notifying payment wait
			System.out.println("Providing ticket: " + pnr + "\n");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void payment() {
		try {
			Thread.sleep(2000);
			notify(); // notifying fillDetail wait
			System.out.println("Paying for PNR: " + pnr);
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void fillDetail() {
		try {
			System.out.println("Filling up detail: " + pnr);
			wait();
			Thread.sleep(2000);
			notify(); // notifying provide wait
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class WaitNotifyTicketTest {

	public static void main(String[] args) throws Exception {
		for (int i = 1; i <= 5; i++) {
			Ticket tic = new Ticket(i);

			Thread t0 = new Thread(() -> tic.fillDetail());
			t0.start();

			Thread t1 = new Thread(() -> tic.payment());
			t1.start();

			Thread t2 = new Thread(() -> tic.processTicket());
			t2.start();
			t2.join();
		}
	}
}
