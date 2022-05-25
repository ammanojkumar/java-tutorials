package io.mk.java8.functionalInterfaces;

import java.util.function.BinaryOperator;

public class Class04_BinaryOperatorExample {

//	 Difference -> BiFunction allows multiple Types and BinaryOperator allows one Type
//	public interface BiFunction<Type1, Type2, Return> {
//		Return apply(Type1 type1, Type2 type2);
//	}

//	public interface BinaryOperator<Type> extends BiFunction<Type, Type, Type>  {
//		Type apply(Type type1, Type type2);
//	}

//	BinaryOperator<String> function = new BinaryOperator<String>() {
//
//		@Override
//		public String apply(String s1, String s2) {
//			return null;
//		}
//	};

	static Integer callBinaryOperator() {

		BinaryOperator<Integer> addFunction = (val1, val2) -> {
			return val1 + val2;
		};

		return addFunction.apply(1, 2);
	}

	public static void main(String[] args) {
		System.out.print(callBinaryOperator());
	}
}
