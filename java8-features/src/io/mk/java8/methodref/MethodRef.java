package io.mk.java8.methodref;

interface Car {
	void horn();
}

public class MethodRef {

	public static void soundHorn() {
		System.out.println("Horning...");
	}

	public static void main(String[] args) {
		Car car = MethodRef::soundHorn;
		car.horn();
	}
}
