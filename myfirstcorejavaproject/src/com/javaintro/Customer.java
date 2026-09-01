package com.javaintro;

public class Customer {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called !");
	}

	void hello() {
		System.out.println("Hello guys, Good morning !!");
		Customer c = new Customer();
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");

		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

//		1) Nullifying the Object
		c1 = null;

//		2) Re-assigining the object
		Customer c4 = new Customer();
		System.out.println(c4);
		c4 = c2;

//		3) Anonymous Object
		new Customer().hello();

//		4) Out of scope or Object inside a method
		c3.hello();

		System.gc();

		System.out.println("After ***************");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		System.out.println("main method strated ");

	}
}
