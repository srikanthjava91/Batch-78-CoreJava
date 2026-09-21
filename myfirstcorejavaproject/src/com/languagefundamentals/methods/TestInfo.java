package com.languagefundamentals.methods;

class Student {
	int sid;
	String sname;
	
	public static void main(String[] args) {
		System.out.println("main in studnet");
	}

}

class Employee {
	int eid;
	double esal;
	String ename;

}

public class TestInfo {
	

	public static Student getStudent() {
		Student s = new Student();
		s.sid = 10;
		s.sname = "Srikanth";
		return s;
	}

	public static Employee getEmployeeInfo() {
		Employee emp = new Employee();

		emp.eid = 9;
		emp.esal = 100000.00;
		emp.ename = "Srikanth";

		return emp;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Student st = getStudent();
		System.out.println(st.sid);
		System.out.println(st.sname);

		Employee e = getEmployeeInfo();
		System.out.println(e.eid);
		System.out.println(e.ename);
		System.out.println(e.esal);

		System.out.println("main method ended !!");
	}

}
