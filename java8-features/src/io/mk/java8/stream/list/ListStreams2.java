package io.mk.java8.stream.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import io.mk.model.Country;
import io.mk.model.ModelUtil;
import io.mk.model.Student;

public class ListStreams2 {

	static void printStudentsJava8(List<Student> stuList) {
		stuList.forEach(stu -> System.out.print(stu.getId() + stu.getName() + stu.getPercentage() + ", "));
		System.out.println();
	}

	static void filterStudentsJava8(List<Student> stuList) {
		List<Student> filterList = stuList.stream().filter(stu -> stu.getPercentage() > 50)
				.collect(Collectors.toList());
		System.out.println("Scored >50%: " + filterList);
	}

	static void sortStudentsJava8(List<Student> stuList) {
		List<String> nameList = stuList.stream().filter(stu -> stu.getPercentage() > 50).map(stu -> stu.getName())
				.sorted().collect(Collectors.toList());
		System.out.println("Scored >50% & sort by Name: " + nameList);
	}

	static void sortStudentsByNameJava8(List<Student> stuList) {
		stuList.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println("Sorting names using comparator: "
				+ stuList.stream().map(stu -> stu.getName()).collect(Collectors.toList()));
	}

	private static void flatMap(List<Country> countrys) {
		System.out.println("Map");
		List<List<String>> collectMap = countrys.stream().map(country -> country.getLanguages())
				.collect(Collectors.toList());
		collectMap.stream().forEach(System.out::print);

		System.out.println("\nFlat Map");
		List<String> collectFlatMap = countrys.stream().flatMap(country -> country.getLanguages().stream())
				.collect(Collectors.toList());
		collectFlatMap.stream().forEach(System.out::print);
	}

	static void printStudents(List<Student> stuList) {
		for (Student stu : stuList) {
			System.out.print(stu.getId() + stu.getName() + stu.getPercentage() + ", ");
		}
		System.out.println();
	}

	static void filterStudents(List<Student> stuList) {
		List<Student> filterList = new ArrayList<>();
		for (Student stu : stuList) {
			if (stu.getPercentage() > 50) {
				filterList.add(stu);
			}
		}
		System.out.println("Scored >50%: " + filterList);
	}

	static void sortStudents(List<Student> stuList) {
		List<String> nameList = new ArrayList<>();
		Comparator<Student> comp = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return (o1.getName()).compareTo((o2.getName()));
			}
		};
		Collections.sort(stuList, comp);
		for (Student stu : stuList) {
			if (stu.getPercentage() > 50) {
				nameList.add(stu.getName());
			}
		}
		System.out.println("Scored >50% & sort by Name: " + nameList);
	}

	static void sortStudentsByName(List<Student> stuList) {
		List<String> nameList = new ArrayList<>();
		for (Student stu : stuList) {
			nameList.add(stu.getName());
		}
		System.out.println("Sorting names using comparator: " + nameList);
	}

	public static void main(String[] args) {
		List<Student> stuList = ModelUtil.getStudents();
		System.out.println("JAVA 8 \nOPERATION ON OBJECT LIST");
		printStudentsJava8(stuList);
		filterStudentsJava8(stuList);
		sortStudentsJava8(stuList);
		sortStudentsByNameJava8(stuList);
		flatMap(ModelUtil.getCountries());

		System.out.println("\nJAVA 7- \nOPERATION ON OBJECT LIST");
		printStudents(stuList);
		filterStudents(stuList);
		sortStudents(stuList);
		sortStudentsByName(stuList);
	}
}
