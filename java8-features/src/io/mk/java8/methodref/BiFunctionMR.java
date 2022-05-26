package io.mk.java8.methodref;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionMR {

	static <P, Q> Q executeFunction(P p, Function<P, Q> func) {
		return func.apply(p);
	}

	static <P, Q, R> R executeBiFunction(P p, Q q, BiFunction<P, Q, R> func) {
		return func.apply(p, q);
	}

	public static void main(String[] args) {
		// Integer(P) to String(Q)
		Function<Integer, String> fn = i -> String.valueOf(i); // Lambda
		System.out.println(executeFunction(1, fn));
		System.out.println(executeFunction(1, String::valueOf)); // Method reference

		BiFunction<String, String, Boolean> bfn = (a, b) -> a.equals(b); // Lambda
		System.out.println(executeBiFunction("one", "two", bfn));
		System.out.println(executeBiFunction("one", "one", String::equals)); // Method reference
	}
}
