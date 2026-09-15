package com.languagefundamentals;

public class TestLiteralsDemo4 {

	public static void main(String[] args) {

//		String Literals 
		String s = "Srikanth";// String Literal storing in String Constant Pool
		System.out.println(s);

//		String Object 
		String s2 = new String("Java");//String Object storing Heap memory 
		System.out.println(s2);

//		null Literals 
		String s1 = null;
		System.out.println(s1);

//		boolean Literals : true/ false 
		boolean status = false;

		if (status) {
			System.out.println("Good morning ");
		} else {
			System.out.println("Bad Morning ");
		}

		// Char Literals
		char c1 = 'A';
		char c2 = 99;
		char c3 = '\u0040';
		char c4 = '\uabcd';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
