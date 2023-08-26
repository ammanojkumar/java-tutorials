package io.mk.java8.stream.list;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import io.mk.model.Item;
import io.mk.model.ModelUtil;

public class CalcListStream {

	static void calculateStream() {
		List<Item> items = ModelUtil.getItems();
		items.stream().map(item -> item.getPrice()).forEach(System.out::println);
		Integer sumPrice = items.stream().collect(Collectors.summingInt(item -> item.getPrice()));
		System.out.println("Sum " + sumPrice);

		Integer totalPrice = items.stream().map(item -> item.getPrice()).reduce(0, (sum, price) -> sum + price);
		System.out.println("Total " + totalPrice);

		Item maxPriceItem = items.stream().max((prod1, prod2) -> prod2.getPrice() - prod1.getPrice()).get();
		System.out.println("Max " + maxPriceItem.getPrice());
	}

	public static void main1(String[] args) {
		calculateStream();
	}
	
	public static void main(String[] args) {
		System.out.println(Instant.now().toEpochMilli());
		System.out.println(System.currentTimeMillis());
		
	}

}
