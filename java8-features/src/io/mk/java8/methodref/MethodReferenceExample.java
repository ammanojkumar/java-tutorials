package io.mk.java8.methodref;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Car {
	void action();
}

class Audi {
	public void soundHorn() {
		System.out.println("Horning...");
	}

	public void startEngine() {
		System.out.println("Engine starting...");
	}
}

public class MethodReferenceExample {

	static void callMethodReference1() {
		List<String> list = Arrays.asList(new String[] { "one", "two", "three", "four", "five" });
		list.forEach(str -> System.out.print(str)); // Lambda
		list.forEach(System.out::println); // Method Reference
	}

	static void callMethodReference2() {
		Car car = new Audi()::soundHorn;
		car.action();
		
		Car car2 = new Audi()::startEngine;
		car2.action();
	}

	public static void main(String[] args) {
		callMethodReference1();
		callMethodReference2();
	}
}
