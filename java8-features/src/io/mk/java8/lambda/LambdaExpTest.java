package io.mk.java8.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.mk.model.ModelUtil;
import io.mk.model.Student;

@FunctionalInterface
interface SumCalculator {
	int add(int a, int b);
}

public class LambdaExpTest {

	public static void testSumCalc() {
		SumCalculator sumCalc = (val1, val2) -> val1 + val2;

		int a = 10, b = 5;
		System.out.println(a + "+" + b + "=" + sumCalc.add(10, 5));
	}

	public static void testThread() {
		Runnable runnableLambda = () -> System.out.println("Runnable with Lambda Expression");
		new Thread(runnableLambda).start();

		// Before java 8
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable with Anonymous class");
			}
		};
		new Thread(runnable).start();
	}

	public static void testComparator() {
		List<Student> students = ModelUtil.getStudents();
		Comparator<Student> stuComp = (s1, s2) -> s1.getName().compareTo(s2.getName());
		Collections.sort(students, stuComp);
		students.forEach(stu -> System.out.print(stu.getName() + ", ")); // Passing consumer param
		System.out.println(" <= Java 8 sort");

		// Before java 8
		List<Student> students2 = ModelUtil.getStudents();
		Comparator<Student> stuComp2 = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		};
		Collections.sort(students2, stuComp2);
		for (Student stu : students) {
			System.out.print(stu.getName() + ", ");
		}
		System.out.println(" <= Before Java 8");
	}

	public static void main(String[] args) {
		testSumCalc();
		testThread();
		testComparator();
	}
}
