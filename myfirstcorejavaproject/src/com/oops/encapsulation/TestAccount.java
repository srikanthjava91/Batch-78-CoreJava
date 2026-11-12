package com.oops.encapsulation;

public class TestAccount {

	public static void main(String[] args) {

		Account a2 = new Account(61234567, 15000.00, "Vinod");
		// getter methods are helping to read the data
		System.out.println(a2.getAccountNumber());
		System.out.println(a2.getBalance());
		System.out.println(a2.getName());
		
		System.out.println(a2);

		Account a = new Account();

		// Setter methods are helping to modify the data
		a.setAccountNumber(61012345);
		a.setBalance(20000.00);
		a.setName("Srikanth");

		// getter methods are helping to read the data
		System.out.println(a.getAccountNumber());
		System.out.println(a.getBalance());
		System.out.println(a.getName());

		Account a1 = new Account();

		// Setter methods are helping to modify the data
		a1.setAccountNumber(61012346);
		a1.setBalance(20000.00);
		a1.setName("Srinu");

		// getter methods are helping to read the data
		System.out.println(a1.getAccountNumber());
		System.out.println(a1.getBalance());
		System.out.println(a1.getName());

//		Stopping the direct access from outside the classes 
		///Accessing the data outside of the classes.
//		a.accountNumber = 614312345;
//		a.balance = -25000.00;
//		a.name = "Srikanth";
//
//		System.out.println("Account NUmber : " + a.accountNumber);
//		System.out.println("Balanace : " + a.balance);
//		System.out.println("Name : " + a.name);

	}
}
