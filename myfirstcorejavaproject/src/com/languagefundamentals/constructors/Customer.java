package com.languagefundamentals.constructors;

class Customer1 {

	public static void main(String[] args) {
		System.out.println("main method started from customer1 ");
		
		Customer c1 = new Customer();

		System.out.println("main method ended from Customer 1");
	}

}

public class Customer {

	 Customer() {
		System.out.println("Customer no-arg constructor called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from customer1 ");
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();

		System.out.println("main method ended from Customer 1");
	}
}
