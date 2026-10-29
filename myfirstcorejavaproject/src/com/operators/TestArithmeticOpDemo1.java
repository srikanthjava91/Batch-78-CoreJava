package com.operators;

import java.util.Scanner;

//1) Arithmetic Operators : + - * / % 
public class TestArithmeticOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();

		System.out.println("Enter b number : ");
		int b = sc.nextInt();

		// String + Anything is String only, Here we need use
//		BODMAS Formula 
//		SUm 
		System.out.println("Addition of two numbers: " + (a + b));

		// 10 5 : CE : The operator - is undefined for the argument type(s) String, int
//		System.out.println("Difference of Two Numbers :" + a- b );
//		Difference 
		System.out.println("Difference of Two Numbers :" + (a - b));

//		10 5 --> Product 
		System.out.println("Multiplication of two number s: " + a * b);

//		Quotient --> 98/5 --> 19 --> 56/2 --> 78/6 --> 56/98 
		System.out.println("Division of Two numbers : " + a / b);

//		Reminder 88/4 99/5 
		System.out.println("Modulus of Two numbers : " + a % b);

	}

}
