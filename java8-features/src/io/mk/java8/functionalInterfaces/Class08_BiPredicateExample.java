package io.mk.java8.functionalInterfaces;

import java.util.function.BiPredicate;

public class Class08_BiPredicateExample {

//	Method test has two arguments and boolean return
//	public interface BiPredicate<T1, T2> {
//		boolean test(T1 t1, T2 t2);
//	}

//	BiPredicate<Integer, String> predicate = new BiPredicate<Integer, String>() {
//		@Override
//		public boolean test(Integer i1, String i2) {
//			return true;
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
