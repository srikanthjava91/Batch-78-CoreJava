package com.arrays;

import java.util.Scanner;

//WAP to find occurrences of a given element ..? 
public class TestArrDemo10 {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 5, 4, 4, 4, 5, 6, 6, 7, 8, 9 };
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element : ");
		int element = sc.nextInt();

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == element) {
				count++;
			}
		}

		System.out.println("Count the Give element is : " + count);

	}

}
