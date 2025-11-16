package org.srozange.jspecify;

public final class Calculator {

	public Integer sum(Integer a, Integer b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(new Calculator().sum(null, 2));
	}

}