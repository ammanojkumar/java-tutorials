package io.mk.java8.other;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class ReadFileExample {

	public static void main(String[] args) throws Exception {
		String classpath = System.getProperty("user.dir") + "/file.txt";
		Stream<String> stream = Files.lines(Paths.get(classpath));
		stream.forEach(System.out::println);
		stream.close();

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		ToIntFunction<Integer> tf = (i) -> i ;
		int sum = integers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Total : " + sum);
	}
}
