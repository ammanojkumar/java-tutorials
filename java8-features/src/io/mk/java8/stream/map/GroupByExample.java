package io.mk.java8.stream.map;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.mk.model.ModelUtil;

public class GroupByExample {

	public static void main(String[] args) {
		List<String> nameList = ModelUtil.getStringList();
		Map<String, Long> collect = nameList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
	}
}
