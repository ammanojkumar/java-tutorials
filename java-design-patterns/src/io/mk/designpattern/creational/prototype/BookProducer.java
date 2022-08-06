package io.mk.designpattern.creational.prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BookProducer {

	Map<String, Book> map = new ConcurrentHashMap<>();

	public void loadBooks() {
		map.put("Java", new Book("Java", "AuthorA", "Computer"));
		map.put("Kings", new Book("Kings", "AuthorB", "Historical"));
		map.put("Scala", new Book("Scala", "AuthorB", "Computer"));
	}

	public Book getBook(String title) {
		if (map.isEmpty()) {
			loadBooks();
		}
		Book bookClone = null;
		try {
			bookClone = (Book) map.get(title).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return bookClone;
	}
}
