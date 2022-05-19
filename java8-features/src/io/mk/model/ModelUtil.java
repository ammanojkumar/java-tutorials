package io.mk.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ModelUtil {

	public static List<Student> getStudents() {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student(3, "Manoj", 48));
		stuList.add(new Student(2, "Arun", 54));
		stuList.add(new Student(4, "Bala", 99));
		stuList.add(new Student(1, "Raja", 70));
		return stuList;
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
		List<Country> countryList = new ArrayList<>();
		countryList.add(new Country(1, Arrays.asList("EN","TA")));
		countryList.add(new Country(2, Arrays.asList("EN","RF")));
		return countryList;
	}
}
