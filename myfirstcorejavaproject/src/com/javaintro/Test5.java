package com.javaintro;

public class Test5 {

	{
		System.out.println("instance called ");
	}

	void main(String[] args) {
		System.out.println("main method started ");
		hello();
		hello();
		hello();
//		welcome();
		System.out.println("main method ended ");
	}

//	Native methods do not specify a body
	native void welcome();// JNI & native method libraries

	void hello() {
		System.out.println("hello method called !");
	}

}
