package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to find the given number is Perfect or not ..? 
//perfect number : sum of the factors is equals to the Given number excluding itself.
//ex: input : 6 --> factors : 1 2 3 = 1+ 2 + 3 = 6 
//ex: input : 28 --> factors : 1 2 4 7 14 = 28 
//ex: input : 496 
//output : true 

public class TestLPDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		// calling the method
		boolean status = isPerfect(n);

		if (status) {
			System.out.println("The Given number is Perfect : ");
		} else {
			System.out.println("The Given number is not perfect ");
		}

		System.out.println("main method ended ");
	}

	static boolean isPerfect(int n) {
		boolean status = false;

		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == n) {
			status = true;
		}

		return status;
	}

}
