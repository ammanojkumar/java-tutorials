package io.mk.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ModelUtil {

	public static List<Student> getStudents() {
		List<Student> stuList = new ArrayList<>(getStudentsMap().values());
		stuList.add(new Student(3, "Manoj", 48));
		stuList.add(new Student(2, "Arun", 54));
		stuList.add(new Student(4, "Bala", 99));
		stuList.add(new Student(1, "Raja", 70));
		return stuList;
	}

	public static Map<Integer, String> getNamesMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "Liam");
		map.put(6, "Manoj");
		map.put(4, "Barath");
		map.put(1, "Kumar");
		map.put(5, "Arun");
		return map;
	}

	public static Map<Integer, Student> getStudentsMap() {
		Map<Integer, Student> map = new HashMap<>();
		map.put(3, new Student(3, "Manoj", 48));
		map.put(2, new Student(2, "Arun", 54));
		map.put(4, new Student(4, "Bala", 99));
		map.put(1, new Student(1, "Raja", 70));
		return map;
	}

	public static List<String> getStringList() {
		return Arrays.asList("Manoj", "Arun", "Bala", "Arun", "Bala", "Manoj", "Raja");
	}

	public static Student getStudent() {
		return getStudents().get(0);
	}

	public static void printStudents(List<Student> stuList, String msg) {
		System.out.print(msg + ": ");
		Consumer<Student> printConsumer = stu -> System.out.print(stu.getName() + ":" + stu.getPercentage() + ", ");
		stuList.forEach(printConsumer);
		System.out.println();
	}

	public static List<Country> getCountries() {
		return Arrays.asList(new Country(1, Arrays.asList("EN", "TA")), new Country(2, Arrays.asList("EN", "RF")));
	}

	public static List<Item> getItems() {
		return Arrays.asList(new Item(1, "Tea", 20), new Item(2, "Meal", 50), new Item(3, "Water", 10));
	}

}
