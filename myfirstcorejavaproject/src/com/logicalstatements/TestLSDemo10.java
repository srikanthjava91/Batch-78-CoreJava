package com.logicalstatements;

import java.util.Scanner;

//WAP to print the T shirt Description Based on T-shirt size: 
public class TestLSDemo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a T shirt size : ");
		int t_size = sc.nextInt();

		switch (t_size) {
		case 32 -> {
			System.out.println("T-shirt size Description is X-Small");
			System.out.println("Th T-shirt price is 550 rs");
		}
		case 34 -> System.out.println("T-shirt size Description is Small");
		case 36 -> System.out.println("T-shirt size Description is Medium");
		case 38 -> System.out.println("T-shirt size Description is Large");
		case 40 -> System.out.println("T-shirt size Description is X-Large");
		case 42 -> System.out.println("T-shirt size Description is XX-Large");
		default -> System.out.println("The T-shirt size is not available in my store");
		}

	}

}
