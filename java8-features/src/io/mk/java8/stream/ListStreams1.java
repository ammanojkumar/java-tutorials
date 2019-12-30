package io.mk.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ListStreams1 {

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

	private static void operate1StringList(List<String> nameList) {
		Collections.sort(nameList);
		System.out.println("Sorted names list: " + nameList);
	}

	private static void operate2StringList(List<String> nameList) {
		Collections.reverse(nameList);
		System.out.println("Reversely sorted names list: " + nameList);
	}

	private static void operate3StringList(List<String> nameList) {
		Iterator<String> iterator = nameList.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			if (name.length() != 1) {
				iterator.remove();
			}
		}
		System.out.println("Filtering names length is 1: " + nameList);
	}

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("DDD");
		strList.add("AAA");
		strList.add("C");
		strList.add("BBB");

		System.out.println("JAVA 8");
		System.out.println("OPERATION ON STRING LIST");
		operate1StringListJava8(strList);
		operate2StringListJava8(strList);
		operate3StringListJava8(strList);

		System.out.println("\nJAVA 7-");
		System.out.println("OPERATION ON STRING LIST");
		operate1StringList(strList);
		operate2StringList(strList);
		operate3StringList(strList);
	}
}
