package io.mk.java8.functionalInterfaces;

import java.util.function.BiFunction;

public class Class02_BiFunctionExample {

//	Method apply has two arguments and return
//	public interface BiFunction<T1, T2, R> {
//		R apply(T1 type1, T2 type2);
//	}

//	BiFunction<Integer, Integer, String> function = new BiFunction<Integer, Integer, String>() {
//		@Override
//		public String apply(Integer i1, Integer i2) {
//			return "";
//		}
//	};

	static String callBiFunction() {
		BiFunction<Integer, Integer, String> addFunction = (val1, val2) -> String.valueOf(val1 + val2);
		return addFunction.apply(1, 2);
	}

	public static void main(String[] args) {
		System.out.print(callBiFunction());
	}
}
