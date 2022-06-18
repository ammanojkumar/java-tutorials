package io.mk.java8.stream.list;

import java.util.List;
import java.util.stream.Collectors;

import io.mk.model.Country;
import io.mk.model.ModelUtil;
import io.mk.model.Student;

public class ObjectListStreams {

	static void printStudents(List<Student> stuList) {
		stuList.forEach(stu -> System.out.print(stu.getId() + stu.getName() + stu.getPercentage() + ", "));
		System.out.println();
	}

	static void filterStudents(List<Student> stuList) {
		List<Student> filterList = stuList.stream().filter(stu -> stu.getPercentage() > 50)
				.collect(Collectors.toList());
		System.out.println("Scored >50%: " + filterList);
	}

	static void sortStudents(List<Student> stuList) {
		List<String> nameList = stuList.stream().filter(stu -> stu.getPercentage() > 50).map(stu -> stu.getName())
				.sorted().collect(Collectors.toList());
		System.out.println("Scored >50% & sort by Name: " + nameList);
	}

	static void sortStudentsByName(List<Student> stuList) {
		stuList.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println("Sorting names using comparator: "
				+ stuList.stream().map(stu -> stu.getName()).collect(Collectors.toList()));
	}

	private static void flatMap(List<Country> countries) {
		System.out.println("Map");
		List<List<String>> collectMap = countries.stream().map(country -> country.getLanguages())
				.collect(Collectors.toList());
		collectMap.stream().forEach(System.out::print);

		System.out.println("\nFlat Map");
		List<String> collectFlatMap = countries.stream().flatMap(country -> country.getLanguages().stream())
				.collect(Collectors.toList());
		collectFlatMap.stream().forEach(System.out::print);
	}

	public static void main(String[] args) {
		List<Student> stuList = ModelUtil.getStudents();
		System.out.println("OPERATION ON OBJECT LIST");
		printStudents(stuList);
		filterStudents(stuList);
		sortStudents(stuList);
		sortStudentsByName(stuList);
		flatMap(ModelUtil.getCountries());
	}
}
