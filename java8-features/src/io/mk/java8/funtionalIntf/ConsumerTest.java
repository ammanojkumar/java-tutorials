package io.mk.java8.funtionalIntf;

import java.util.List;
import java.util.function.Consumer;

import io.mk.model.ModelUtil;
import io.mk.model.Student;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<Student> printConsumer = stu -> System.out
				.println("Name: " + stu.getName() + "\nResult: " + stu.isPass());
		printConsumer.accept(new Student(11, "Manoj", 98, true));

		List<Student> stuList = ModelUtil.getStudents();
		stuList.forEach(printConsumer);
	}
}
