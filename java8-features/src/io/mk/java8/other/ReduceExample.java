package io.mk.java8.other;

import java.util.Arrays;

import io.mk.model.ModelUtil;

public class ReduceExample {

	public static void main(String[] args) {
		int[] arr = ModelUtil.getIntArray();
		System.out.println("Sum " + Arrays.stream(arr).reduce((a, b) -> a + b).getAsInt());
		System.out.println("Max " + Arrays.stream(arr).reduce((a, b) -> a > b ? a : b).getAsInt());
	}
}
