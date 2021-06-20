package io.mk.model;

import java.util.ArrayList;
import java.util.List;

public class ModelUtil {

	public static List<Student> getStudents() {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student(3, "Manoj", 48, true));
		stuList.add(new Student(2, "Arun", 54, false));
		stuList.add(new Student(4, "Bala", 99, true));
		stuList.add(new Student(1, "Raja", 70, true));
		return stuList;
	}
}
