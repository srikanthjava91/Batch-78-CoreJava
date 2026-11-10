package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print factorial of Given number using for loop..? 
//input : 4 --> 4! means --> 4 * 3 * 2 * 1 
//output 24 
public class TestLpDemo5 {

	public static void main(String[] args) {
		System.out.println("mian method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int fact = 1;

		for (int i = n; i >= 1; i--) {
			fact = fact * i;// 4X3=12X2 = 24 X1 = 24
		}

		System.out.println("Factorial of a Given number is : " + fact);

	}

}
