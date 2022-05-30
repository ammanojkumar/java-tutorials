package io.mk.java8.examples;

import java.util.stream.Stream;

public class OddNumbers {

	public static void main(String[] args) {
		Stream.iterate(1, n -> n + 2).limit(10).forEach(System.out::println);
	}
}
