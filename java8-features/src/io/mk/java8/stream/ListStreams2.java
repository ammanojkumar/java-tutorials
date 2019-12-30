package io.mk.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import io.mk.model.Student;

public class ListStreams2 {

	private static void operate1StudentListJava8(List<Student> stuList) {
		List<Student> filterList = stuList.stream().filter(stu -> stu.getMarks() > 50).collect(Collectors.toList());
		System.out.println("Filtering students if marks > 50: " + filterList);
	}

	private static void operate2StudentListJava8(List<Student> stuList) {
		List<String> nameList = stuList.stream().filter(stu -> stu.getMarks() > 50).map(stu -> stu.getName()).sorted()
				.collect(Collectors.toList());
		System.out.println("Filtering students if marks > 50 & sort by Name: " + nameList);
	}

	private static void operate3StudentListJava8(List<Student> stuList) {
		stuList.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println("Sorting names using comparator: "
				+ stuList.stream().map(stu -> stu.getName()).collect(Collectors.toList()));
	}

	private static void operate1StudentList(List<Student> stuList) {
		List<Student> filterList = new ArrayList<>();
		for (Student stu : stuList) {
			if (stu.getMarks() > 50) {
				filterList.add(stu);
			}
		}
		System.out.println("Filtering students if marks > 50: " + filterList);
	}

	private static void operate2StudentList(List<Student> stuList) {
		List<String> nameList = new ArrayList<>();
		Comparator<Student> comp = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return (o1.getName()).compareTo((o2.getName()));
			}
		};
		Collections.sort(stuList, comp);
		for (Student stu : stuList) {
			if (stu.getMarks() > 50) {
				nameList.add(stu.getName());
			}
		}

		System.out.println("Filtering students if marks > 50 & sort by Name: " + nameList);

	}

	private static void operate3StudentList(List<Student> stuList) {
		List<String> nameList = new ArrayList<>();
		for (Student stu : stuList) {
			nameList.add(stu.getName());
		}
		System.out.println("Sorting names using comparator: " + nameList);
	}

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student(3, "DDD", 48, true));
		stuList.add(new Student(2, "AAA", 54, false));
		stuList.add(new Student(4, "CCC", 99, true));
		stuList.add(new Student(1, "BBB", 70, true));

		System.out.println("JAVA 8 \nOPERATION ON OBJECT LIST");
		operate1StudentListJava8(stuList);
		operate2StudentListJava8(stuList);
		operate3StudentListJava8(stuList);

		System.out.println("\nJAVA 7- \nOPERATION ON OBJECT LIST");
		operate1StudentList(stuList);
		operate2StudentList(stuList);
		operate3StudentList(stuList);
	}

}
