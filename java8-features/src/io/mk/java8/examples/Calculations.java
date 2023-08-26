package io.mk.java8.examples;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.ToIntFunction;

public class Calculations {

	public static void calc(List<Integer> intList) {
		ToIntFunction<Integer> tif = new ToIntFunction<Integer>() {

			@Override
			public int applyAsInt(Integer value) {
				System.out.println("applyAsInt for " + value);
				return 0;
			}
		};
		int sum = intList.stream().mapToInt(tif).sum();
		sum = intList.stream().mapToInt(Integer::valueOf).sum();
		long cnt = intList.stream().mapToInt(Integer::valueOf).count();
		int max = intList.stream().mapToInt(Integer::valueOf).max().getAsInt();
		double avg = intList.stream().mapToInt(Integer::valueOf).average().getAsDouble();

		IntSummaryStatistics sumSta = intList.stream().mapToInt(Integer::valueOf).summaryStatistics();
		System.out.println(cnt + "	CNT	" + sumSta.getCount());
		System.out.println(sum + "	SUM	" + sumSta.getSum());
		System.out.println(max + "	MAX	" + sumSta.getMax());
		System.out.println(avg + "	AVG	" + sumSta.getAverage());
	}

	public static void main(String[] args) {
		calc(Arrays.asList(new Integer[] { 1, 3, 4, 4 }));
	}

}
