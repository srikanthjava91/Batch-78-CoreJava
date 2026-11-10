package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print prime numbers from 0 to 100..? 
//input : 10 
//output : 2 3 5 7 
public class TestLPDemo9 {

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to print ..? ");
		int n = sc.nextInt();// 10
		int count = 0;
		
		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println(i + " - " + count);
				
			}
		}

	}
}
