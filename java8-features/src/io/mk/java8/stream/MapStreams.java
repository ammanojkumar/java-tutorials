package io.mk.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.mk.model.Country;
import io.mk.model.ModelUtil;
import io.mk.model.Student;

public class MapStreams {

	private static void operateMap(Map<Integer, String> map) {
		System.out.println("OPERATION ON MAP JAVA 8");
		List<Integer> intList = new ArrayList<>();
		List<String> strList = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.peek(e -> intList.add(e.getKey())).map(e -> e.getValue()).collect(Collectors.toList());

		System.out.println("Map<Integer, String> to Sorted Reverse key List: " + intList);
		System.out.println("Map<Integer, String> to Sorted value List: " + strList);
		System.out.print("Print using Java8 forEach: ");
		intList.forEach(System.out::print);
	}

	private static void operateMap2(Map<Integer, Student> map) {
		map.entrySet().stream().sorted((s1, s2) -> s1.getKey() - s2.getKey()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, HashMap::new));
	}



	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "L");
		map.put(6, "B");
		map.put(4, "E");
		map.put(1, "R");
		map.put(5, "A");
		operateMap(map);

		Map<Integer, Student> map2 = new HashMap<>();
		map2.put(1, ModelUtil.getStudents().get(0));
		map2.put(2, ModelUtil.getStudents().get(1));
		map2.put(3, ModelUtil.getStudents().get(2));
		operateMap2(map2);

		Map<Integer, Country> map3 = new HashMap<>();
		map3.put(1, new Country(1, Arrays.asList("EN", "TA", "HN")));

	}
}
