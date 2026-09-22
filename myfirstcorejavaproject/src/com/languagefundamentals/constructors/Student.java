package com.languagefundamentals.constructors;

//In Java, Whenever the program or class does not contain any other constructors 
//then Java Compiler will create a default constructor.

//Q) Already, Java Compiler is providing a default constructor then Why we need No-arg constructor ..? 
//Ans1 : Instead of JVM providing the default values, 
//If Developer wants to provide the any other values for an Object we need a no-arg constructor.

//Ans2 : Java Compiler creates default constructor when there are no other constructor in a class
//But, In a class if we have a parameterized constructors still 
//if we want to create an object without passing any values then we must need to have no-arg constructor.

//ans : We can add any statements inside the no-arg constructor but we can not add inside the default constructor.!!

//Q) instance block vs constructor difference and which one will execute first ..? 

public class Student {

	int sid;
	String name;

//		no-arg constructor 
	Student() {
		System.out.println("no-arg constructor called ");
		sid = 1001;
		name = "Unknown";
	}

//	Parameterized constructor 
	Student(int sid, String sname) {

	}

//	{
//		System.out.println("Hello Abhishay !!");
//	}

	// Return type for the method is missing
//	 Srikanth(){
//		
//	}

	public static void main(String[] args) {
		System.out.println("main method started ");

//		The Below Object is created with the help of default constructor.
//		The Below Object is created with the help of no arg constructor.
		Student s1 = new Student();
		s1.sid = 18;
		s1.name = "Virat";
		s1.studentInfo();

//		Whenever we want to pass the argument values while creating an object then will go and use parametrized constructor.
		Student s2 = new Student(9, "Srikanth");
		s2.studentInfo();

//		Student s3 = new Student();
//		s3.studentInfo();
//
//		Student s4 = new Student();
//		s4.studentInfo();

		System.out.println("main method ended ");
	}

	void studentInfo() {
		System.out.println("************************");
		System.out.println("Student ID : " + sid);
		System.out.println("Student Name : " + name);
	}

}
