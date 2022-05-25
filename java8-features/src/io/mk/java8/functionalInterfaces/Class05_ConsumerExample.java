package io.mk.java8.functionalInterfaces;

import java.util.function.Consumer;

import io.mk.model.ModelUtil;
import io.mk.model.Student;

public class Class05_ConsumerExample {

//	public interface Consumer<Arg1> {
//		public void accept(Arg1 s);
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
		stuConsumerWithPerc.accept(ModelUtil.getStudent());
		ModelUtil.getStudents().forEach(stuConsumerWithPerc);
	}

	public static void main(String[] args) {
		callConsumer();
	}
}
