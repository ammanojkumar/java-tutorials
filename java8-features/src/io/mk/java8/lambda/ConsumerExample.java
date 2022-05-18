package io.mk.java8.lambda;

import java.util.function.Consumer;

import io.mk.model.ModelUtil;
import io.mk.model.Student;

public class ConsumerExample {

//	Consumer<Student> consumer = new Consumer<Student>() {
//		@Override
//		public void accept(Student s) {
//			System.out.println(s.getId());
//		}
//	};

	static void consumeObj() {
		Consumer<Student> stuConsumer = stu -> System.out.print(stu.getName());
		Consumer<Student> stuConsumerWithPerc = stuConsumer.andThen(st -> System.out.println(st.getPercentage()));
		stuConsumerWithPerc.accept(ModelUtil.getStudent());
		ModelUtil.getStudents().forEach(stuConsumerWithPerc);
	}

	public static void main(String[] args) {
		consumeObj();
	}
}
