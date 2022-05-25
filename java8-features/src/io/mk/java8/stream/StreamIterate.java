package io.mk.java8.stream;

import java.util.stream.Stream;

public class StreamIterate {

	public static void main(String[] args) {
		Stream.iterate(1, ele -> ele + 1).filter(ele -> ele % 2 == 0).limit(5).forEach(System.out::println);
	}
}
