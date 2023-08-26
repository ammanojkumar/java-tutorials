package io.mk.java8.other;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileExample {

	public static void main(String[] args) throws Exception {
		String classpath = System.getProperty("user.dir") + "/file.txt";
		Stream<String> stream = Files.lines(Paths.get(classpath));
		stream.forEach(System.out::println);
		stream.close();
	}
}
