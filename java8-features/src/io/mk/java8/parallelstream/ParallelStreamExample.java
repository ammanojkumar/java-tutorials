package io.mk.java8.parallelstream;

import java.util.stream.IntStream;

import io.mk.model.ModelUtil;

public class ParallelStreamExample {

	private static void callParallelStream1() {
		long st = System.currentTimeMillis();
		IntStream.range(1, 11).forEach(i -> System.out.println(i + " at thread " + Thread.currentThread().getName()));
		long ed = System.currentTimeMillis();
		System.out.println(" Sequence execution time ms: " + (ed - st));

		st = System.currentTimeMillis();
		IntStream.range(1, 11).parallel()
				.forEach(i -> System.out.println(i + " at thread " + Thread.currentThread().getName()));
		ed = System.currentTimeMillis();
		System.out.println(" Parallel execution time ms: " + (ed - st));
	}

	public static void main(String[] args) {
		callParallelStream1();
		callParallelStream2();
	}

	private static void callParallelStream2() {
		long st = System.currentTimeMillis();
		ModelUtil.getItems().stream().map(i -> i.getName()).forEach(System.out::print);
		long ed = System.currentTimeMillis();
		System.out.println(" Sequence execution time ms: " + (ed - st));

		st = System.currentTimeMillis();
		ModelUtil.getItems().parallelStream().map(i -> i.getName()).forEach(System.out::print);
		ed = System.currentTimeMillis();
		System.out.println(" Parallel execution time ms: " + (ed - st));
	}

}
