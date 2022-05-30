package io.mk.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	private static void testFlatMap() {
		String[][] strArr = new String[][] { { "Dog", "Lion", "Tiger" }, { "Sharks", "Turtles", "Fish" },
				{ "Peacock", "Parrot", "Bee" } };

		List<String> result = Arrays.asList(strArr).stream().flatMap(s -> Stream.of(s)).filter(s -> s.length() > 4)
				.map(s -> s.toLowerCase()).collect(Collectors.toList()); // Lambda

		List<String> resultMR = Arrays.asList(strArr).stream().flatMap(Stream::of).filter(s -> s.length() > 4)
				.map(String::toUpperCase).collect(Collectors.toList()); // Method Reference

		System.out.println(result);
		System.out.println(resultMR);
	}

	public static void main(String[] args) {
		testFlatMap();
	}

}
