package io.mk.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import io.mk.model.Item;

public class Predicates {

	static void predicateNum() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("Print all numbers:");
		validateInt(list, n -> true);

		System.out.println("Print even numbers:");
		validateInt(list, n -> n % 2 == 0);

		System.out.println("Print numbers between 3, 6:");
		validateInt(list, n -> n > 3 & n < 6);
	}

	static void predicateObj() {
		List<Item> list = new ArrayList<>();
		list.add(new Item(1, "Tea", 20));
		list.add(new Item(2, "Meal", 50));
		list.add(new Item(3, "Water", 10));

		System.out.println("Print all Items:");
		validateItem(list, item -> true);

		System.out.println("Print Meal:");
		validateItem(list, item -> "Meal".equals(item.getName()));

		System.out.println("Print price < 35:");
		validateItem(list, item -> item.getPrice() < 35);

	}

	static void validateInt(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer n : list) {
			if (predicate.test(n)) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
	}

	static void validateItem(List<Item> list, Predicate<Item> predicate) {
		for (Item item : list) {
			if (predicate.test(item)) {
				System.out.print(item.getName() + ": " + item.getPrice());
			}
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		predicateNum();
		predicateObj();
	}
}
