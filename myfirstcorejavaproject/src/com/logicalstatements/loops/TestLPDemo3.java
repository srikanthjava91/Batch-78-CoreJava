package com.logicalstatements.loops;

import java.util.Scanner;

//A factor is a whole number that divides another number completely, 
//meaning the remainder is zero.
//Q) WAP to print Factors/ Divisors of Given number ..? 
//input : 6 
//output : 1 2 3 6 

//input : 24 
//output : 1 2 3 4 6 8 12 24 
public class TestLPDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		// calling the method
		findFactors(n);

		System.out.println("main method ended ");

	}

	static void findFactors(int a) {
		for (int i = 1; i <= a/ 2; i++) {
			if (a % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(" " + a);
	}
}
