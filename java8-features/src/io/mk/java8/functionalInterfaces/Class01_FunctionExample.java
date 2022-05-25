package io.mk.java8.functionalInterfaces;

import java.util.function.Function;

import io.mk.model.Student;

public class Class01_FunctionExample {

//	public interface Function<T, R> {
//		R apply(T t);
//	}

//	Function<String, Integer> function = new Function<String, Integer>() {
//		@Override
//		public Integer apply(String name) {
//			return 1;
//		}
//	};

	static Student callFunction() {

		Function<Integer, Student> stuFunction = id -> {
			return new Student(id, "Manoj", 50);
		};

		return stuFunction.apply(1);
	}

	public static void main(String[] args) {
		System.out.print(callFunction());
	}
}
