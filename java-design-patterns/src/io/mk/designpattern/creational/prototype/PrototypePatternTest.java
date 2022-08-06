package io.mk.designpattern.creational.prototype;

public class PrototypePatternTest {

	public static void main(String[] args) {
		Book book1 = new BookProducer().getBook("Java");
		Book book2 = new BookProducer().getBook("Java");
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book1.equals(book2));
	}
}
