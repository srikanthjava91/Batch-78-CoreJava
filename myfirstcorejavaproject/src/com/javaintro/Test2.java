package com.javaintro;

///static Block vs instance Block 
public class Test2 {

	static Test2 t1 = new Test2();

	static {
		System.out.println("static block1 called ");
	}

	{
		System.out.println("instance block1 called ");

	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		System.out.println("main method ended ");
	}

	{
		System.out.println("instance block2 called ");

	}
}
