package io.mk.java8.examples;

import java.util.stream.IntStream;

public class PerfectSquare {

	public static void main(String[] args) {
		int num = 9;
		boolean anyMatch = IntStream.iterate(1, n -> n + 1).limit(num / 2).anyMatch(n -> num == n * n);
		System.out.println(anyMatch);
	}
}
