package io.mk.java8.funtionalIntf;

interface Sports {
	default void printMyJob() {
		System.out.println("I'm a Sports");
	}
}

interface Entertainment {
	default void printMyJob() {
		System.out.println("I'll entertain people");
	}
}

class Football implements Sports, Entertainment {

	@Override
	public void printMyJob() {
		Sports.super.printMyJob();
		Entertainment.super.printMyJob();
		System.out.println("My name is Football");
	}

}

public class DefaultMethods {
	public static void main(String[] args) {
		Sports sports = new Football();
		sports.printMyJob();
	}
}
