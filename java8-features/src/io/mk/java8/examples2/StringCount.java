package io.mk.java8.examples2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@FunctionalInterface
interface CalcInf {
	public int perform(int a, int b);
}

public class StringCount {

	public static void main(String[] args) {
		CalcInf ci = (a, b) -> a + b;
		System.out.println(ci.perform(1, 3));

		List<String> ll = new ArrayList<>();
		ll.add("a");
		ll.add("bb");
		ll.add("ccc");
		Predicate<String> pre = s -> {
			System.out.println("checking " + s);
			return s.length() > 2;
		};
		System.out.println(ll.stream().filter(pre).collect(Collectors.toList()));
	}
}
