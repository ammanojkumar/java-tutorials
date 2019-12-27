package io.mk.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.mk.model.Student;

public class Streams {

	private static void operateStringList(List<String> names) {
		System.out.println("OPERATION ON STRING LIST");
		List<String> strList = names.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted names list: " + strList);

		strList = names.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Reversely sorted names list: " + strList);

		strList = names.stream().sorted().filter(a -> a.length() == 1).collect(Collectors.toList());
		System.out.println("Filtering names length is 1: " + strList);
	}

	private static void operateStudentList(List<Student> stuList) {
		System.out.println("\nOPERATION ON OBJECT LIST");
		List<Student> filterList = stuList.stream().filter(stu -> stu.getMarks() > 50).collect(Collectors.toList());
		System.out.println("Filtering students if marks > 50: " + filterList);

		List<String> intList = stuList.stream().filter(stu -> stu.getMarks() > 50)
				.map(stu -> stu.getId() + ":" + stu.getName()).sorted().collect(Collectors.toList());
		System.out.println("Filtering students if marks > 50 & sort by ID: " + intList);

		stuList.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println("Sorting names using comparator: "
				+ stuList.stream().map(stu -> stu.getName()).collect(Collectors.toList()));
	}

	private static void operateMap(Map<Integer, String> map) {
		System.out.println("\nOPERATION ON MAP");
		List<Integer> intList = new ArrayList<>();
		List<String> strList = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.peek(e -> intList.add(e.getKey())).map(e -> e.getValue()).collect(Collectors.toList());

		System.out.println("Map<Integer, String> to Sorted key List: " + intList);
		System.out.println("Map<Integer, String> to Sorted value List: " + strList);
		System.out.print("Print using Java8 forEach: ");
		intList.forEach(System.out::print);
	}

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("DDD");
		strList.add("AAA");
		strList.add("C");
		strList.add("BBB");
		operateStringList(strList);

		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student(3, "DDD", 48, true));
		stuList.add(new Student(2, "AAA", 34, false));
		stuList.add(new Student(4, "CCC", 99, true));
		stuList.add(new Student(1, "BBB", 70, true));
		operateStudentList(stuList);

		Map<Integer, String> map = new HashMap<>();
		map.put(2, "L");
		map.put(6, "B");
		map.put(4, "E");
		map.put(1, "R");
		map.put(5, "A");
		operateMap(map);
	}

}
