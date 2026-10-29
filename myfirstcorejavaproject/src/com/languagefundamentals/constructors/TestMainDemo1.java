package com.languagefundamentals.constructors;

import static java.lang.System.out;

public class TestMainDemo1 {

	static String name = "Srikanth";

	public static void main(String[] names) {
		TestMainDemo1 t = new TestMainDemo1();

		out.println("main method started ");
		out.println('A');
		out.println(100);
		out.println(100L);

		out.println(100.76F);
		out.println(100.76);

		out.println(t);

		out.print("main method started ");

		out.print("main method started ");

		out.println(TestMainDemo1.name.length());// Srikanth --> 8

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("main method ended ");

	}
}
