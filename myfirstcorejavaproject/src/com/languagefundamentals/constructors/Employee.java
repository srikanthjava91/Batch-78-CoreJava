package com.languagefundamentals.constructors;

public class Employee {

	int eid;
	String ename;
	double esal;

	Employee() {
		System.out.println("Employee no-arg constructor called ");
		eid = 1;
		ename = "unknown";
		esal = 100000;
	}

	public Employee(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Employee emp1 = new Employee();
		emp1.empInfo();

		Employee emp2 = new Employee(18, "Virat", 1800000.00);
		emp2.empInfo();

		Employee emp3 = new Employee(19, "Hemanth", 600000);
		emp3.empInfo();

		System.out.println("main method ended ");
	}

	void empInfo() {
		System.out.println("**************Emp Info *******************");
		System.out.println("Employee ID  :" + eid);
		System.out.println("EMployee Name: " + ename);
		System.out.println("Employee Salary : " + esal);
	}

}
