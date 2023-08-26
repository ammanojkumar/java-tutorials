package io.mk.model;

import java.util.List;

public class Book {

	Integer id;
	List<String> chapter;

	public Book(Integer id, List<String> chapter) {
		super();
		this.id = id;
		this.chapter = chapter;
	}

	public Integer getId() {
		return id;
	}

	public List<String> getChapter() {
		return chapter;
	}

}
