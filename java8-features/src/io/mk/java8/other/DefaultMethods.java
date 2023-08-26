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
		System.out.println("My name is Football");
		Sports.super.printMyJob();
		Entertainment.super.printMyJob();
	}
}

class Cricket implements Sports, Entertainment {

	@Override
	public void printMyJob() {
		System.out.println("My name is Cricket");
		Sports.super.printMyJob();
		Entertainment.super.printMyJob();
	}
}

public class DefaultMethods {
	public static void main(String[] args) {
		Sports sports = new Football();
		sports.printMyJob();

		Sports cricket = new Cricket();
		cricket.printMyJob();

		Sports.print();
		Entertainment.print();
	}
}
