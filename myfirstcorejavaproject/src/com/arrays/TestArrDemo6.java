package com.arrays;

import java.util.Scanner;

//WAP to read the elements from scanner for an array elements.
public class TestArrDemo6 {

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();

		int[] numbers = new int[size];//

		System.out.println("enter the elements : ");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}

		for (int n : numbers) {
			if (isPrime(n)) {
				System.out.print(n + " ");
			}
		}

	}

}
