package io.mk.java8.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import io.mk.model.Item;
import io.mk.model.ModelUtil;

public class Class07_PredicateExample {

//	Method test has one argument and boolean return 
//	public interface Predicate<T> {
//		boolean test(T type);
//	}

//	Predicate<Item> predicate = new Predicate<Item>() {
//		@Override
//		public boolean test(Item t) {
//			return false;
//		}
//	};

	static List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

	static void callPredicate() {

		System.out.println("Predicate1: Print all numbers > 4:");
		Predicate<Integer> predicate1 = n -> n > 4;
		Stream<Integer> filter = numList.stream().filter(predicate1); // filter(predicate)
		filter.forEach(n -> System.out.println(n)); // forEach(consumer)

		System.out.println("Predicate2: Print even numbers:");
		numList.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

		System.out.println("Print numbers between 3, 6:");
		numList.stream().filter(n -> n > 3 && n < 6).forEach(n -> System.out.println(n));
	}

	static void predicateObj() {
		List<Item> itemList = ModelUtil.getItems();
		System.out.println("Predicate1: Print all Items:");
		Predicate<Item> predicate1 = item -> true; // test(t) method is implemented
		Stream<Item> filter = itemList.stream().filter(predicate1); // filter(predicate)
		filter.forEach(n -> System.out.println(n.getName())); // forEach(consumer)

		System.out.println("Predicate2: Print Item 1:");
		itemList.stream().filter(item -> item.getId() == 1).forEach(n -> System.out.println(n.getName()));

		System.out.println("Predicate1: Print price < 35:");
		itemList.stream().filter(item -> item.getPrice() < 35).forEach(n -> System.out.println(n.getName()));
	}

	private static void predicateMethods() {
		// Default methods
		Predicate<Integer> predicateGT5 = n -> n > 5;
		Predicate<Integer> predicateOdd = n -> n % 2 == 1;
		System.out.println(predicateOdd.test(12));
		System.out.println(predicateOdd.negate().test(12));
		numList.stream().filter(predicateGT5.and(predicateOdd)).forEach(n -> System.out.println(n));
		numList.stream().filter(predicateGT5.or(predicateOdd)).forEach(n -> System.out.println(n));

		// Predicate.isEqual, Predicate.not
	}

	public static void main(String[] args) {
		callPredicate();
		predicateObj();
		predicateMethods();
	}

}
