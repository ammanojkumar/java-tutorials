package io.mk.java8.stream;

import java.util.stream.IntStream;

public class IntStreamRange {

	static boolean isPrime(int num) {
		return !IntStream.rangeClosed(2, num / 2).anyMatch(i -> num % i == 0);
	}

	static boolean isPerfectSquare(int num) {
		return IntStream.rangeClosed(2, num / 2).anyMatch(i -> i * i == num);
	}

	public static void main(String[] args) {
		System.out.println(isPrime(5));
		System.out.println(isPerfectSquare(10));
	}
}
