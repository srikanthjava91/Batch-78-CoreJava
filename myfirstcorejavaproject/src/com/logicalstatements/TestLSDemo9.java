package com.logicalstatements;

import java.util.Scanner;

//WAP to print calculated values Based on two values with symbol we provides like + - * / % 
public class TestLSDemo9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String yn = "";

		do {
			System.out.println("Enter a  number: ");
			int a = sc.nextInt();

			System.out.println("Enter b  number: ");
			int b = sc.nextInt();

			System.out.println("Enter a Symbol like + - * / % ");
			char c = sc.next().charAt(0);
			int result = 0;

			switch (c) {
			case '+' -> result = a + b;
			case '-' -> result = a - b;
			case '*' -> result = a * b;
			case '/' -> result = a / b;
			case '%' -> result = a % b;
			default -> System.out.println("invalid symbol !");
			}

			System.out.println("reslted value is : " + result);
			System.out.println("Do you want to continue ..? Click Y for Yes N for No");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));

		System.out.println("Claculation closed !!");
	}

}
