package com.languagefundamentals;

class Address {
	String flat = "LIG-123";
	String plot = "567";
	String city = "HYD";
	String street = "KPHB";
}

public class Employee {

	int eid = 101;
	String ename = "Srikanth";
	Address address = new Address();

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		System.out.println(emp1.eid);// 0
		System.out.println(emp1.ename);// null
		System.out.println(emp1.address);// Address of the Object
		System.out.println(emp1.address.flat);// Address of the Object
		System.out.println(emp1.address.plot);// Address of the Object
		System.out.println(emp1.address.city);// Address of the Object
		System.out.println(emp1.address.street);// Address of the Object

	}

}
