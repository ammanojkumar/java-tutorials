package io.mk.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

import io.mk.model.Item;
import io.mk.model.ModelUtil;

public class ListStreams3 {

	public static void main(String[] args) {
		List<Item> items = ModelUtil.getItems();
		items.stream().map(item -> item.getPrice()).forEach(System.out::println);
		Integer sumPrice = items.stream().collect(Collectors.summingInt(item -> item.getPrice()));
		System.out.println("Sum " + sumPrice);

		Integer totalPrice = items.stream().map(item -> item.getPrice()).reduce(8, (sum, price) -> sum + price);
		System.out.println("Total " + totalPrice);

		Item maxPriceItem = items.stream().max((prod1, prod2) -> prod2.getPrice() - prod1.getPrice()).get();
		System.out.println("Max " + maxPriceItem.getPrice());
	}
}
