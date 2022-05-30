package io.mk.java8.examples;

import java.util.stream.IntStream;

public class AmstrongNumber {

	public static void main1(String[] args) {
		int num = 153;
		int num1 = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum += rem * rem * rem;
			num = num / 10;
		}
		if (num1 == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static void main(String[] args) {
		IntStream.range(1, 100000).filter(n -> {
			int num1 = n, sum = 0;
			while (num1 > 0) {
				sum += Math.pow(num1 % 10, String.valueOf(n).length());
				num1 = num1 / 10;
			}
			return n == sum;
		}).forEach(System.out::println);
	}
}
