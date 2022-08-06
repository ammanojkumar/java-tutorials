package io.mk.java8.examples;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 4;
		System.out.println(IntStream.rangeClosed(2, num / 2).noneMatch(i -> num % i == 0));

		Stream.iterate(1, i -> i + 1).limit(10).forEach(System.out::print);
		
	}
}
