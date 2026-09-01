package com.javaintro;

public class Test6 {
	
	static Test6 t = new Test6();

	static {
		
	}

	public static void main(String[] args) {

		t.method1();
	}

	void method1() {
		System.out.println("method1 called ");
	}

}
