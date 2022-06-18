package io.mk.java8.other;

import java.util.Optional;

import io.mk.model.ModelUtil;
import io.mk.model.Student;

public class OptionalTest {

	static void testOprional() {
		Student stu1 = null;
		Student stu2 = ModelUtil.getStudent();

		Optional<Student> optional1 = Optional.ofNullable(stu1);
		System.out.println("Optional1 present: " + optional1.isPresent());

		// If null throws Exception
		Optional<Student> optional2 = Optional.of(stu2);
		System.out.println("Optional2 present: " + optional2.isPresent());

		Student stu = optional1.orElseGet(() -> ModelUtil.getStudent());
		stu = optional1.orElse(ModelUtil.getStudent());
		System.out.println("Student: " + stu.getId());

		Optional<Student> filter = optional2.filter(st -> st.getPercentage() >= 30);
		System.out.println("Optional filter: " + filter.get().getId());

	
		Optional<String> map = optional2.map(st -> st.getName());
		System.out.println("Optional map: " + map.get());
	}

	public static void main(String[] args) {
		testOprional();
	}
}
