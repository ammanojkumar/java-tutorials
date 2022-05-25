package io.mk.java8.functionalInterfaces;

import java.util.function.UnaryOperator;

public class Class02_UnaryOperatorExample {

//	public interface Function<T, R> {
//		R apply(T t);
//	}

//	public interface UnaryOperator<T> extends Function<T, T> {
//	}

//	UnaryOperator<Integer> unaryOperator = new UnaryOperator<Integer>() {
//		@Override
//		public Integer apply(Integer value) {
//			return value * value;
//		}
//	};

	static Integer callUnaryOperator() {
		UnaryOperator<Integer> unaryOperator = value -> value * value;
		return unaryOperator.apply(5);
	}

	public static void main(String[] args) {
		System.out.print(callUnaryOperator());
	}
}
