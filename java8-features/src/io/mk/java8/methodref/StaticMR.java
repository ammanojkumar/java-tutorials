package io.mk.java8.methodref;

interface Printable {
	void printMsg();
}

public class StaticMR {

	static void printSomething() {
		System.out.println("printSomething static method.");

	}

	public static void main(String[] args) {
		Printable printalbe = StaticMR::printSomething;
		printalbe.printMsg();
	}
}
