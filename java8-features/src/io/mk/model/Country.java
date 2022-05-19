package io.mk.model;

import java.util.List;

public class Country {

	int id;
	List<String> languages;

	public Country(int id, List<String> languages) {
		this.id = id;
		this.languages = languages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

}
