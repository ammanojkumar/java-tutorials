package io.mk.java8.examples;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonDuplicateChars {

	private static void findNonDuplicates() {
		String input = "Hello! Can you find distinct chars in me..";
		Stream<Character> charStream = input.chars().mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)));

		HashMap<Character, Long> countMap = charStream
				.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

		Map<Character, Long> filterMap = countMap.entrySet().stream().filter(ent -> ent.getValue() == 1)
				.collect(Collectors.toMap(Entry::getKey, e -> e.getValue()));
		System.out.println(filterMap);
	}

	public static void main(String[] args) {
		findNonDuplicates();
	}
}
