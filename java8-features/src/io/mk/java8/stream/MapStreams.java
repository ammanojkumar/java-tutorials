package io.mk.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreams {

	private static void operateMapJava8(Map<Integer, String> map) {
		System.out.println("OPERATION ON MAP JAVA 8");
		List<Integer> intList = new ArrayList<>();
		List<String> strList = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.peek(e -> intList.add(e.getKey())).map(e -> e.getValue()).collect(Collectors.toList());

		System.out.println("Map<Integer, String> to Sorted Reverse key List: " + intList);
		System.out.println("Map<Integer, String> to Sorted value List: " + strList);
		System.out.print("Print using Java8 forEach: ");
		intList.forEach(System.out::print);
	}

	private static void operateMap(Map<Integer, String> map) {
		System.out.println("\n\nOPERATION ON MAP JAVA 7-");
		List<Integer> intList = new ArrayList<>();
		List<String> strList = new ArrayList<>();

		for (Map.Entry<Integer, String> ent : map.entrySet()) {
			intList.add(ent.getKey());
			strList.add(ent.getValue());
		}

		Collections.reverse(intList);
		Collections.sort(strList);
		System.out.println("Map<Integer, String> to Sorted Reverse key List: " + intList);
		System.out.println("Map<Integer, String> to Sorted value List: " + strList);
		System.out.print("Print using forEach: ");
		for (Integer id : intList) {
			System.out.print(id);
		}
	}

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "L");
		map.put(6, "B");
		map.put(4, "E");
		map.put(1, "R");
		map.put(5, "A");
		operateMapJava8(map);
		operateMap(map);
	}
}
