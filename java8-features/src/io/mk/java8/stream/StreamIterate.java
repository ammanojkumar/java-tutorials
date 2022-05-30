package io.mk.java8.stream;

import java.util.stream.Stream;

public class StreamIterate {

	public static void main(String[] args) {
		executeIterates();
	}

	private static void executeIterates() {
		System.out.println("Even numbers:");
		Stream.iterate(1, n -> n + 1).filter(n -> n % 2 == 0).limit(10).forEach(System.out::println);

		System.out.println("Odd numbers:");
		Stream.iterate(1, n -> n < 10, n -> n + 2).forEach(x -> System.out.println(x));
	}
}
