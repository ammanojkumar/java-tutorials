package io.mk.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import io.mk.model.Item;

public class SupplierExample {

//		Supplier<String> supplier = new Supplier<String>() {
//			@Override
//			public String get() {
//				return "value";
//			}
//		};

	static void supplyObj() {

		Item randomItem = new Item(new Random().nextInt(), "Random", 321);

		Supplier<Item> supplier1 = () -> randomItem;
		Supplier<Item> supplier2 = Item::new;
		System.out.println(supplier1.get().getId());
		System.out.println(supplier2.get().getId());

		List<Item> itemList = new ArrayList<>();
		itemList.add(new Item(1, "Tea", 20));
		itemList.add(new Item(2, "Meal", 50));
		System.out.println(itemList.stream().findFirst().get().getName());
		itemList.clear();
		System.out.println(itemList.stream().findFirst().orElseGet(() -> randomItem).getId());
	}

	public static void main(String[] args) {
		supplyObj();
	}
}
