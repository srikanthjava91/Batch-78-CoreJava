package com.javaintro;

public class Test4 {

	static Test4 t = new Test4();

	void method6() {
		System.out.println("method6 called ");
	}

//	In instance method, can we call instance methods directly ..? 
//	ans : Yes 
	void method5() {
		method6();
		System.out.println("method5 called ");
	}

	static void method4() {
		t.method5();
		System.out.println("method4 called ");
	}

//	In static method, we can call static methods directly.... Yes 
	static void method3() {
		method4();
		System.out.println("method3 called ");
	}

//	In instance methods can we call static methods directly...? 
//	ans: Yes 
	void method2() {
		method3();
		System.out.println("method2 called ");
	}

	// In static method, can we call instance methods..?
//	yes by using object reference variable.
	public static void method1() {
		t.method2();
		System.out.println("method1 called !!");
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");
		method1();
		System.out.println("main method ended");
	}
}
