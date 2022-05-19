package io.mk.java8.methodref;

interface Car {
	void horn();
}

public class MethodRef {

	// Referring this method, when interface method calls
	public void soundHorn() {
		System.out.println("Horning...");
	}

	public static void main(String[] args) {
		Car car = new MethodRef()::soundHorn;
		car.horn();
	}
}
