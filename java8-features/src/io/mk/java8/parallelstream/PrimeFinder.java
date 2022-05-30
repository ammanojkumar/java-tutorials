package io.mk.java8.parallelstream;

import java.util.stream.IntStream;

public class PrimeFinder {

	static boolean isPrime(int num) {
		return !IntStream.rangeClosed(2, num / 2).anyMatch(i -> num % i == 0);
	}

	static boolean isPerfectSquare(int num) {
		return IntStream.rangeClosed(2, num / 2).anyMatch(i -> i * i == num);
	}

	public static void main(String[] args) {
		System.out.println(isPrime(5));
		System.out.println(isPrime(10));
		
		System.out.println(isPerfectSquare(10));
		System.out.println(isPerfectSquare(16));
	}
}

