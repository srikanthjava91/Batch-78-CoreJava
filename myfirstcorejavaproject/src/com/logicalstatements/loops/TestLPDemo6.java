package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print factorial of Given number using recursion..? 
public class TestLPDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		
		int f = fact(n);
		System.out.println("Factorial of a Given number is : " + f);

		System.out.println("main method ended ");
	}

	static int fact(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}

		return n * (fact(n - 1));

	}
}
