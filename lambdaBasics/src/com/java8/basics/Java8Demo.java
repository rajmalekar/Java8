package com.java8.basics;

public class Java8Demo {

	public static void main(String[] args) {
		StringLengthLambda strLength = s -> s.length();

		System.out.println(strLength.getLength("Hello Lambda"));
	}
}

@FunctionalInterface
interface StringLengthLambda {
	public int getLength(String s);
}
