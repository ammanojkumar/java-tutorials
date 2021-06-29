package io.mk.java8.methodref;

import java.util.function.BiFunction;

class Calculator {
	public static int add(int a, int b) {
		return a + b;
	}

	public float add(float a, float b) {
		return a + b;
	}
}

public class BiFunctionMR {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> sumInt = Calculator::add;
		int result = sumInt.apply(1, 2);
		System.out.println(result);

		BiFunction<Float, Float, Float> floatInt = new Calculator()::add;
		float resultF = floatInt.apply(1f, 2f);
		System.out.println(resultF);

	}
}
