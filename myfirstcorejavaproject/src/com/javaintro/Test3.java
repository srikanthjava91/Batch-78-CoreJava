package com.javaintro;

public class Test3 {

	// instance method
	void show() {
		System.out.println(Thread.currentThread());
		System.out.println("show method called");
		System.out.println("show method called");
	}

	// static method
	public static void welcome() {
		System.out.println(Thread.currentThread());
		System.out.println("Welcome to VCUBE Family !");
		System.out.println("Welcome to VCUBE Family !");
	}

//	main method is the entry point of every Java program
	public static void main(String[] args) {
		System.out.println("main method started ");
		
		System.out.println(Thread.currentThread());

		welcome();
		Test3 t = new Test3();
		t.show();

		System.out.println("main method ended ");
	}

}
