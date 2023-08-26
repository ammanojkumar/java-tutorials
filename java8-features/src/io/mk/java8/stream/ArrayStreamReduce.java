package io.mk.java8.stream;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

import io.mk.model.ModelUtil;

public class ArrayStreamReduce {

	public static void main(String[] args) {
		int[] arr = ModelUtil.getIntArray();
		IntBinaryOperator ib = new IntBinaryOperator() {

			@Override
			public int applyAsInt(int a, int b) {
				return a - b;
			}
		};
		System.out.println("Sum " + Arrays.stream(arr).reduce(ib).getAsInt());
		System.out.println("Sum " + Arrays.stream(arr).reduce((a, b) -> a - b).getAsInt());
		System.out.println("Max " + Arrays.stream(arr).reduce((a, b) -> a > b ? a : b).getAsInt());
	}
}
