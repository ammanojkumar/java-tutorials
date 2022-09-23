package io.mk.java8.examples;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Calculations {

	public static void calc(List<Integer> intList) {
		long cnt = intList.stream().mapToInt(Integer::valueOf).count();
		int sum = intList.stream().mapToInt(Integer::valueOf).sum();
		int max = intList.stream().mapToInt(Integer::valueOf).max().getAsInt();
		double avg = intList.stream().mapToInt(Integer::valueOf).average().getAsDouble();

		IntSummaryStatistics sumSta = intList.stream().mapToInt(Integer::valueOf).summaryStatistics();
		System.out.println(cnt + "	" + sumSta.getCount());
		System.out.println(sum + "	" + sumSta.getSum());
		System.out.println(max + "	" + sumSta.getMax());
		System.out.println(avg + "	" + sumSta.getAverage());
	}

	public static void main(String[] args) {
		calc(Arrays.asList(new Integer[] { 1, 3, 4, 4 }));
	}

}
