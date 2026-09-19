package com.languagefundamentals.methods;

import java.util.Scanner;

//WAP to read the elements from the console using Scanner class..
public class TestMethodsDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter your First Name");
		String fn = sc.nextLine();

		System.out.println("Enter your last name ");
		String ln = sc.nextLine();

		System.out.println("Enter your height : ");
		float height = sc.nextFloat();

		System.out.println("Enter your weight : ");
		double weight = sc.nextDouble();

		System.out.println("Enter your gender info : ");
		char c = sc.next().charAt(0);// Male --> M --> Method chaining 

//		Call by value 
		getStudentAge(age);
		getStudentFullName(fn, ln);
		studentHeightAndWeight(height, weight);
		studentGenderInfo(c);

		System.out.println("main method ended ");
	}

	static void studentGenderInfo(char c) {
		System.out.println("Gender info : " + c);
	}

	static void studentHeightAndWeight(float h, double w) {
		System.out.println("Student height is : " + h);
		System.out.println("Student Weight is : " + w);

	}

	static void getStudentFullName(String fname, String lname) {
		System.out.println("The Stuednt Full Name is : " + fname + " " + lname);
	}

	static void getStudentAge(int age) {
		System.out.println("Student Age is : " + age);
	}
}
