package io.mk.java8.stream.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.mk.model.ModelUtil;
import io.mk.model.Student;

public class MapStreamsExample {

	private static void collectMapValuesToList(Map<Integer, String> map) {
		List<String> strList = map.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
		System.out.println("Map2List: Value List: " + strList);
	}

	private static void collectMapKiesValuesToList(Map<Integer, String> map) {
		List<Integer> intList = new ArrayList<>();
		List<String> strList = map.entrySet().stream().peek(e -> intList.add(e.getKey())).map(e -> e.getValue())
				.collect(Collectors.toList());

		System.out.println("Map2List: Key Value List: ");
		System.out.println(intList + "\n" + strList);
	}

	private static void collectMapKiesValuesToListOrdered(Map<Integer, String> map) {
		List<Integer> intList = new ArrayList<>();
		List<String> strList = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.peek(e -> intList.add(e.getKey())).map(e -> e.getValue()).collect(Collectors.toList());

		System.out.println("Map2List: Key List Ordered: ");
		System.out.println(intList + "\n" + strList);
	}

	private static void collectMapToMapOrdered(Map<Integer, Student> map) {
		HashMap<Integer, Student> collect = map.entrySet().stream()
				.sorted((s1, s2) -> s1.getValue().getPercentage() - s2.getValue().getPercentage()).collect(Collectors
						.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, HashMap::new));
		System.out.println("Map2Map: Map Value Ordered: ");
		System.out.println(collect);
	}

	public static void main(String[] args) {
		Map<Integer, String> map = ModelUtil.getNamesMap();
		collectMapValuesToList(map);
		collectMapKiesValuesToList(map);
		collectMapKiesValuesToListOrdered(map);
		collectMapToMapOrdered(ModelUtil.getStudentsMap());
	}
}
