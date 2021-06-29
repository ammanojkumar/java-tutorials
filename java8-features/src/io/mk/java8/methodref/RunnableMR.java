package io.mk.java8.methodref;

public class RunnableMR {

	public void printnMsg() {
		System.out.println("Instance method..");
	}

	public static void main(String[] args) {
		Runnable runnable = new RunnableMR()::printnMsg;
		Thread t2 = new Thread(runnable);
		t2.start();
	}
}
