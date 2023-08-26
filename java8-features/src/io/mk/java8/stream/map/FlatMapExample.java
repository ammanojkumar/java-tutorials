package io.mk.java8.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.mk.model.ModelUtil;

public class FlatMapExample {

	private static void testFlatMap() {
		List<List<String>> chapters = ModelUtil.getBooks().stream().map(book -> book.getChapter())
				.collect(Collectors.toList());
		System.out.println(chapters);

		List<String> fchapters = ModelUtil.getBooks().stream().flatMap(book -> book.getChapter().stream())
				.collect(Collectors.toList());
		System.out.println(fchapters);

		String[][] strArr = new String[][] { { "Dog", "Lion", "Tiger" }, { "Sharks", "Turtles", "Fish" },
				{ "Peacock", "Parrot", "Bee" } };
		List<String> result = Arrays.asList(strArr).stream().flatMap(s -> Stream.of(s)).filter(s -> s.length() > 4)
				.map(s -> s.toLowerCase()).collect(Collectors.toList()); // Lambda
		System.out.println(result);
	}

	public static void main(String[] args) {
		testFlatMap();
	}

}
