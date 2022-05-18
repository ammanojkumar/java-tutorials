package io.mk.java8.lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import io.mk.model.ModelUtil;
import io.mk.model.Student;

public class ConsumerSupplierPredicate {

	static void testConsumer() { // has accept method
		Consumer<Student> stuConsumer = stu -> System.out.print(stu.getName() + ":" + stu.getPercentage() + "%, ");
		stuConsumer.accept(ModelUtil.getStudent());

		List<Student> stuList = ModelUtil.getStudents();
		stuList.forEach(stuConsumer);
		System.out.println();
	}

	static void testSupplier() { // has get method
		Supplier<Student> stuSupplier = () -> new Student(1, "Manoj", 98);
		Student student = stuSupplier.get();
		System.out.println(student.getId());

		List<Student> stuList = ModelUtil.getStudents();
		System.out.println(stuList.stream().findAny().orElseGet(stuSupplier));
	}

	static void testPredicate() { // has test method
		Predicate<Student> stuPredicate = stu -> stu.getPercentage() >= 50;
		stuPredicate.test(new Student(11, "Manoj", 98));

		List<Student> stuList = ModelUtil.getStudents();
		Consumer<Student> printConsumer = stu -> System.out.print(stu.getName() + ":" + stu.getPercentage() + "%, ");
		stuList.stream().filter(stuPredicate).forEach(printConsumer);
	}

	public static void main(String[] args) {
		testConsumer();
		testSupplier();
		testPredicate();
	}
}
