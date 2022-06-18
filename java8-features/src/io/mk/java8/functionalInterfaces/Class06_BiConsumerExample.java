package io.mk.java8.functionalInterfaces;

import java.util.function.BiConsumer;

import io.mk.model.ModelUtil;
import io.mk.model.Student;

public class Class06_BiConsumerExample {

//	Method accept has two arguments
//	public interface Consumer<T1, T2> {
//		public void accept(T1 t1, T2 t2);
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

		biConsumer.accept(ModelUtil.getStudent(), 60);
	}

	public static void main(String[] args) {
		callBiConsumer();
	}
}
