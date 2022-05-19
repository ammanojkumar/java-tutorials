package io.mk.java8.methodref;

interface Speakable {
	void doWelcome(String name);
}

class Welcome {
	// Referring this constructor, when calling the interface method
	Welcome(String name) {
		System.out.print("Welcome " + name);
	}
}

public class ConstructorMR {

	public static void main(String[] args) {
		Speakable hello = Welcome::new;
		hello.doWelcome("Manoj");
	}
}
