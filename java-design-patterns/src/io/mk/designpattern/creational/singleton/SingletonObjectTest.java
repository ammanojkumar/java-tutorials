package io.mk.designpattern.creational.singleton;

import java.util.stream.IntStream;

public class SingletonObjectTest {

	public static void main(String[] args) {

		IntStream.range(0, 10).parallel().forEach(nbr -> {
			SingletonObject singletonObject = SingletonObject.getInstance();
			System.out.println(singletonObject.hashCode());
		});
	}
}
