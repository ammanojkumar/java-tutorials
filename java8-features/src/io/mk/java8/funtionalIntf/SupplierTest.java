package io.mk.java8.funtionalIntf;

import java.util.List;
import java.util.function.Supplier;

import io.mk.model.ModelUtil;
import io.mk.model.Student;

public class SupplierTest {

	// to be expanded
	public static void main(String[] args) {
		Supplier<Student> stuSupplier = () -> new Student(1, "Manoj", 98, true);
		Student student = stuSupplier.get();
		System.out.println(student.getId());

		List<Student> stuList = ModelUtil.getStudents();
		System.out.println(stuList.stream().findAny().orElseGet(stuSupplier));
	}
}
