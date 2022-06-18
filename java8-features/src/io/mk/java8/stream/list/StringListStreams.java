package io.mk.java8.stream.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringListStreams {

	private static void operate1StringListJava8(List<String> nameList) {
		List<String> filterList = nameList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted names list: " + filterList);
	}

	private static void operate2StringListJava8(List<String> nameList) {
		List<String> filterList = nameList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Reversely sorted names list: " + filterList);
	}

	private static void operate3StringListJava8(List<String> nameList) {
		List<String> filterList = nameList.stream().sorted().filter(a -> a.length() == 1).collect(Collectors.toList());
		System.out.println("Filtering names length is 1: " + filterList);
	}

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("DDD");
		strList.add("AAA");
		strList.add("C");
		strList.add("BBB");

		System.out.println("OPERATION ON STRING LIST");
		operate1StringListJava8(strList);
		operate2StringListJava8(strList);
		operate3StringListJava8(strList);
	}
}
