package io.mk.java8.methodref;

import java.util.Comparator;
import java.util.List;

import io.mk.model.Student;

class StudentComparator {
	public int compareByName(Student stu1, Student stu2) {
		return stu1.getName().compareTo(stu2.getName());
	}

	public int compareByPercent(Student stu1, Student stu2) {
		return stu1.getPercentage() - stu2.getPercentage();
	}
}

public class ComparatorMR {

	static void anonymousComparator(List<Student> stuList) {
		Comparator<Student> stuComp = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return new StudentComparator().compareByName(o1, o2);
			}
		};
		stuList.sort(stuComp);
	}

	static void lambdaComparator(List<Student> stuList) {
		stuList.sort((stu1, stu2) -> new StudentComparator().compareByPercent(stu1, stu2));
	}

	static void mrComparator(List<Student> stuList) {
		stuList.sort(new StudentComparator()::compareByPercent);
	}

	public static void main(String[] args) {
	}
}
