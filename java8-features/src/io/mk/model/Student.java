package io.mk.model;

public class Student {

	private int id;
	private String name;
	private int marks;
	private boolean result;

	public Student(int id, String name, int marks, boolean result) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.result = result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

}
