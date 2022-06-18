package io.mk.java8.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import io.mk.model.Item;
import io.mk.model.ModelUtil;
import io.mk.model.Student;

public class SimpleExamples {

	static void testFunction() {
		Function<Integer, Item> stuFunc = (id) -> ModelUtil.getItem(id);
		Item item = stuFunc.apply(1);
		System.out.println("testFunction: " + item);
	}

	static void testBIFunction() {
		BiFunction<Item, Integer, String> itemFunc = (item, price) -> item.getPrice() > price
				? "We have amount to buy this item"
				: "We don't have amount to buy this item";
		System.out.println("testBIFunction: " + itemFunc.apply(ModelUtil.getItems().get(0), 50));
	}

	static void testUnaryOperator() {
		UnaryOperator<Item> itemFunc = (item) -> {
			if (item.getPrice() > 110) {
				item.setDesc("This item price is more than 100");
			} else {
				item.setDesc("This item price is less than 100");
			}
			return item;
		};
		System.out.println("testUnaryOperator: " + itemFunc.apply(ModelUtil.getItem(1)));
	}

	static void testBinaryOperator() {
		BinaryOperator<String> itemFunc = (name, msg) -> {
			return name + " " + msg;
		};
		System.out.println("testBinaryOperator: " + itemFunc.apply("Arun", "You are welcome"));
	}

	static void testConsumer() {
		System.out.print("testConsumer: ");
		Consumer<Student> stuConsumer = stu -> System.out.print(stu.getName() + ":" + stu.getPercentage() + "%, ");
		stuConsumer.accept(ModelUtil.getStudent());
	}

	static void testBIConsumer() {
		BiConsumer<Student, Integer> stuConsumer = (student, perc) -> {
			if (student.getPercentage() > perc) {
				System.out.println("The student scored more than expected");
			} else {
				System.out.println("The student not scored as expected");
			}
		};
		System.out.print("testBIConsumer: ");
		stuConsumer.accept(ModelUtil.getStudent(), 80);
	}

	static void testPredicate() {
		System.out.print("testPredicate: ");
		Predicate<Student> stuPredicate = stu -> stu.getPercentage() >= 50;
		stuPredicate.test(new Student(11, "Manoj", 98));

		List<Student> stuList = ModelUtil.getStudents();
		Consumer<Student> printConsumer = stu -> System.out.print(stu.getName() + ":" + stu.getPercentage() + "%, ");
		stuList.stream().filter(stuPredicate).forEach(printConsumer);
	}

	static void testBIPredicate() {
		BiPredicate<Student, Integer> stuPredicate = (stu, perc) -> stu.getPercentage() >= perc;
		System.out.println("testBIPredicate: " + stuPredicate.test(new Student(11, "Manoj", 98), 70));
	}

	static void testSupplier() {
		Supplier<Student> stuSupplier = () -> new Student(1, "Manoj", 98);
		List<Student> stuList = ModelUtil.getStudents();
		System.out.println("testSupplier: " + stuList.stream().findAny().orElseGet(stuSupplier));
	}

	public static void main(String[] args) {
		testFunction();
		testBIFunction();
		testUnaryOperator();
		testBinaryOperator();
		testConsumer();
		testBIConsumer();
		testPredicate();
		testBIPredicate();
		testSupplier();
	}
}
