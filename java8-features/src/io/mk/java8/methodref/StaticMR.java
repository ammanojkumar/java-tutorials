package io.mk.java8.methodref;

interface Questionable {
	void askQuestion();
}

public class StaticMR {

	static void askYourName() {
		System.out.println("What is your name?");
	}

	static void askYourAge() {
		System.out.println("How old are you?");
	}

	public static void main(String[] args) {
		Questionable question1 = StaticMR::askYourName;
		question1.askQuestion();

		Questionable question2 = StaticMR::askYourAge;
		question2.askQuestion();
	}
}
