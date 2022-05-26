package io.mk.java8.functionalInterfaces;

import java.util.function.BiConsumer;

import io.mk.model.ModelUtil;
import io.mk.model.Student;

public class Class06_BiConsumerExample {

//	public interface Consumer<Arg1> {
//		public void accept(Arg1 s);
//	}

//	BiConsumer<Student, Integer> biConsumer = new BiConsumer<Student, Integer>() {
//		@Override
//		public void accept(Student student, Integer percent) {
//			System.out.println("Statements");
//		}
//	};

	static void callBiConsumer() {
		BiConsumer<Student, Integer> biConsumer = (student, percent) -> System.out
				.println("Your score: " + student.getPercentage()
						+ (student.getPercentage() >= percent ? " Keep it up! You've scored" : " Have to improve."));

		biConsumer.accept(ModelUtil.getStudent(), 80);
	}

	public static void main(String[] args) {
		callBiConsumer();
	}
}