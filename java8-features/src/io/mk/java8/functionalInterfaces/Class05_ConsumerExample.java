package io.mk.java8.functionalInterfaces;

import java.util.function.Consumer;

import io.mk.model.ModelUtil;
import io.mk.model.Student;

public class Class05_ConsumerExample {

//	Method accept has one argument
//	public interface Consumer<T> {
//		public void accept(T t);
//	}

//	Consumer<Student> consumer = new Consumer<Student>() {
//		@Override
//		public void accept(Student s) {
//			System.out.println(s.getId());
//		}
//	};

	static void callConsumer() {
		Consumer<Student> stuConsumer = stu -> System.out.print(stu.getName());
		Consumer<Student> stuConsumerWithPerc = stuConsumer.andThen(st -> System.out.println(st.getPercentage()));
		ModelUtil.getStudents().forEach(stuConsumerWithPerc);
	}

	public static void main(String[] args) {
		callConsumer();
	}
}
