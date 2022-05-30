package io.mk.java8.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesFinder {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(new Integer[] { 9, 0, 1, 5, 3, 5 });
		findDuplicates(intList);
		elementOperation(intList);
	}

	private static void elementOperation(List<Integer> intList) {
		System.out.println("elementOperation");
		System.out.println(intList.stream().findFirst().get());
		System.out.println(intList.stream().count());
		System.out.println(intList.stream().max(Integer::compare).get());
	}

	private static void findDuplicates(List<Integer> intList) {
		Set<Integer> set = new HashSet<>();
		intList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
	}
}
