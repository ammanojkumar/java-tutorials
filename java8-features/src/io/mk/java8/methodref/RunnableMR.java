package io.mk.java8.methodref;

public class RunnableMR {

	public void runRef() {
		System.out.println("Running runRef..");
	}

	public static void runRefStatic() {
		System.out.println("Running runRefStatic..");
	}

	public static void main(String[] args) {
		Runnable runnable = new RunnableMR()::runRef;
		Thread t1 = new Thread(runnable);
		t1.start();

		Runnable runnableStatic = RunnableMR::runRefStatic;
		Thread t2 = new Thread(runnableStatic);
		t2.start();
	}
}
