package io.mk.java8.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesFinder {

	private static void elementOperation(List<Integer> intList) {
		System.out.println("elementOperation");
		System.out.println(intList.stream().findFirst().get());
		System.out.println(intList.stream().count());
		System.out.println(intList.stream().max(Integer::compare).get());
		System.out.println(intList.stream().mapToInt(Integer::valueOf).max());
	}

	private static void findDuplicates(List<Integer> intList) {
		System.out.println("Duplicates");
		Set<Integer> tempSet = new HashSet<>();
		List<Integer> duplicates1 = intList.stream().filter(n -> !tempSet.add(n)).collect(Collectors.toList());

		Set<Integer> duplicates2 = intList.stream().filter(i -> Collections.frequency(intList, i) > 1)
				.collect(Collectors.toSet());

		List<Integer> duplicates3 = intList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicates1 + "\n" + duplicates2 + "\n" + duplicates3);
	}

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(new Integer[] { 9, 0, 1, 5, 3, 5 });
		elementOperation(intList);
		findDuplicates(intList);
	}
}
