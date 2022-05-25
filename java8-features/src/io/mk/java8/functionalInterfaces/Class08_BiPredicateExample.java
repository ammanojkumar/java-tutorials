package io.mk.java8.functionalInterfaces;

import java.util.function.BiPredicate;

public class Class08_BiPredicateExample {

//	public interface BiPredicate<T1, T2> {
//		boolean test(T1 t1, T2 t2);
//	}

//	BiPredicate<Integer, Integer> predicate = new BiPredicate<Integer, Integer>() {
//		@Override
//		public boolean test(Integer i1, Integer i2) {
//			return false;
//		}
//	};

	static void callBiPredicate() {
		BiPredicate<Integer, Integer> bipredicate = (i1, i2) -> {
			return i1 % i2 == 0;
		};

		System.out.println(bipredicate.test(10, 2));
		System.out.println(bipredicate.test(10, 3));
	}

	public static void main(String[] args) {
		callBiPredicate();
	}

}
