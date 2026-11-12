package com.arrays;

import java.util.Scanner;

//WAP to check whether the Given element is available from an array .?	
public class TestArrDemo9 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 4, -5, 6, 9, 8, 7, -11, 15, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to search : ");
		int key = sc.nextInt();

		boolean status = false;

//		for (int n : numbers) {
//			if (n == key) {
//				status = true;
//				System.out.println("The Given element found from an array : ");
//				break;
//			}
//		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == key) {
				status = true;
				System.out.println("The given element fount at the index is  : " + i);

			}
		}

		if (!status) {
			System.out.println("The Given element is not found ");
		}

	}

}
