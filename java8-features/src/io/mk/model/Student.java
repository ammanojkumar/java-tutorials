package io.mk.model;

public class Student {

	private int id;
	private String name;
	private int marks;
	private boolean pass;

	public Student(int id, String name, int marks, boolean pass) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.pass = pass;
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

	public boolean isPass() {
		return pass;
	}

	public void setResult(boolean pass) {
		this.pass = pass;
	}

}
