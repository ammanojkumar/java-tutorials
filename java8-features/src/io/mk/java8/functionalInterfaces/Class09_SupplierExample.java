package io.mk.java8.functionalInterfaces;

import java.util.function.Supplier;

import io.mk.model.Item;

public class Class09_SupplierExample {

//	Method get has only return
//	public interface Supplier<Type> {
//		public Type get();
//	}

//	Supplier<String> supplier = new Supplier<String>() {
//		@Override
//		public String get() {
//			return "value";
//		}
//	};

	static void callSupplier() {
		Supplier<Item> supplier1 = () -> new Item(5, "Coffee", 321); // Lambda
		Supplier<Item> supplier2 = Item::new; // constructor reference
		System.out.println(supplier1.get().getName() + ", " + supplier2.get().getName());
	}

	public static void main(String[] args) {
		callSupplier();
	}
}
