package io.mk.java8.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

	static void callPredicate() {
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Stream<Integer> filter = numList.stream().filter(n -> n > 4);
		filter.forEach(n -> System.out.println(n));
	}

	public static void main(String[] args) {
		callPredicate();
	}

}
