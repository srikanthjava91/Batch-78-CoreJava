package com.languagefundamentals.methods;

//1) Method with no return type + no parameters 
public class TestMethodsDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestMethodsDemo1 t = new TestMethodsDemo1();
		
//		Calling the methods 
		TestMethodsDemo1.welcome();
		t.hello();

		System.out.println("main method ended ");
	}

	public static void welcome() {
		System.out.println("Welcome to Vcube !!");
	}

	public void hello() {
		System.out.println("Hello !! Good morning Have a nice day !!");
	}

}
