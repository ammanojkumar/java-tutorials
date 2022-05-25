package io.mk.java8.functionalInterfaces;

import java.util.function.BiFunction;

public class Class03_BiFunctionExample {

//	public interface BiFunction<Arg1, Arg2, Return> {
//		Return apply(Arg1 arg1, Arg2 arg2);
//	}

//	BiFunction<Integer, Integer, String> function = new BiFunction<Integer, Integer, String>() {
//		@Override
//		public String apply(Integer i1, Integer i2) {
//			return "";
//		}
//	};

	static String callBiFunction() {

		BiFunction<Integer, Integer, String> addFunction = (val1, val2) -> {
			return String.valueOf(val1 + val2);
		};

		return addFunction.apply(1, 2);
	}

	public static void main(String[] args) {
		System.out.print(callBiFunction());
	}
}
