package io.mk.java8.methodref;

import java.util.List;
import java.util.function.BiFunction;

import io.mk.model.ModelUtil;
import io.mk.model.Student;

class PercentCalc {

	Integer avgPercent(List<Student> students) {
		return students.stream().map(s -> s.getPercentage()).mapToInt(i -> i).sum();
	}

	Integer maxPercent(List<Student> students) {
		return students.stream().map(s -> s.getPercentage()).mapToInt(i -> i).max().getAsInt();
	}
}

public class BiFunctionMR2 {

	static void calc(PercentCalc perCalc, List<Student> students, BiFunction<PercentCalc, List<Student>, Integer> bfn) {
		Integer avg = bfn.apply(perCalc, students);
		System.out.println(avg);
	}

	public static void main(String[] args) {
		PercentCalc perCalc = new PercentCalc();
		List<Student> students = ModelUtil.getStudents();

		// Lambda
		BiFunction<PercentCalc, List<Student>, Integer> bfnl1 = (pc, s) -> pc.avgPercent(s);
		calc(perCalc, students, bfnl1);

		// Method reference
		BiFunction<PercentCalc, List<Student>, Integer> bfnmr1 = PercentCalc::avgPercent;
		calc(perCalc, students, bfnmr1);

		// Lambda
		BiFunction<PercentCalc, List<Student>, Integer> bfnl2 = (pc, s) -> pc.maxPercent(s);
		calc(perCalc, students, bfnl2);

		// Method reference
		BiFunction<PercentCalc, List<Student>, Integer> bfnmr2 = PercentCalc::maxPercent;
		calc(perCalc, students, bfnmr2);
	}
}
