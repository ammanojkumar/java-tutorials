package io.mk.java8.funtionalIntf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import io.mk.model.Item;

public class PredicatesObj {

	public static void main(String[] args) {
		List<Item> list = new ArrayList<>();
		list.add(new Item(1, "Tea", 20));
		list.add(new Item(2, "Meal", 50));
		list.add(new Item(3, "Water", 10));

		System.out.println("Print all Items:");
		validate(list, item -> true);

		System.out.println("Print Meal:");
		validate(list, item -> "Meal".equals(item.getName()));

		System.out.println("Print price < 35:");
		validate(list, item -> item.getPrice() < 35);
	}

	public static void validate(List<Item> list, Predicate<Item> predicate) {
		for (Item item : list) {
			if (predicate.test(item)) {
				System.out.print(item.getName() + ": " + item.getPrice());
			}
		}
		System.out.println("\n");
	}
}
