package io.mk.java8.other;

interface Sports {
	default void printMyJob() {
		System.out.println("I'm a Sports");
	}

	static void print() {
		System.out.println("Static method in Sports");
	}
}

interface Entertainment {
	default void printMyJob() {
		System.out.println("I'll entertain people");
	}

	static void print() {
		System.out.println("Static method in Entertainment");
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
		Sports.print();
		Entertainment.print();
	}
}
