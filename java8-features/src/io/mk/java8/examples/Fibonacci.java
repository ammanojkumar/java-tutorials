package io.mk.java8.examples;

import java.util.stream.Stream;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print("Sequence: ");
		Stream.iterate(1, n -> n + 1).limit(5).forEach(System.out::print);

		System.out.print("\nFibonacci: ");
		Stream.iterate(new int[] { 0, 1 }, n -> new int[] { n[1], n[0] + n[1] }).limit(10).map(n -> n[0])
				.forEach(n -> System.out.print(n + " "));

		System.out.print("\nFibonacci: ");
		Stream.iterate(new int[] { 0, 1 }, n -> new int[] { n[1], n[0] + n[1] }).limit(10)
				.forEach(n -> System.out.print(n[0] + " "));

	}
}
