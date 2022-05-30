package io.mk.java8.functionalInterfaces;

import java.util.function.BinaryOperator;

public class Class04_BinaryOperatorExample {

//	Method apply has two arguments and return with same type
//	public interface BinaryOperator<T> extends BiFunction<T, T, T> {
//		T apply(T type1, T type2);
//	}

//	BinaryOperator<String> function = new BinaryOperator<String>() {
//
//		@Override
//		public String apply(String s1, String s2) {
//			return null;
//		}
//	};

	static Integer callBinaryOperator() {

		BinaryOperator<Integer> addFunction = (val1, val2) -> {
			return val1 + val2;
		};

		return addFunction.apply(1, 2);
	}

	public static void main(String[] args) {
		System.out.print(callBinaryOperator());
	}
}
