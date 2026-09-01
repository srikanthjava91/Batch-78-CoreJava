package com.javaintro;

//In Java, before main method, JVM checks is there any static blocks and load the static blocks first.
//Then Without main method can we execute only static block ..?  
//Yes before 1.5 version !!
//No From 1.5 version !!

//First, It checks Whether main method is there or not ..? 
//Next, Checks the static block and then loading with the help prepare from Linking.

public class Test1 {

	static int a;
	int b;

	// static block
	static {
		System.out.println("static block called ");
		System.out.println("Welcome to JVM ARchitecture ");
		System.out.println(a);
//		System.out.println(b);//Cannot make a static reference to the non-static field b
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		System.out.println(a);
//		System.out.println(b);//Cannot make a static reference to the non-static field b
	}

}
