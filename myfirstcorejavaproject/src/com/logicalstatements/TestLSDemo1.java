package com.logicalstatements;

import java.util.Scanner;

//WAP to print Driving & Voting Criteria's Based on the age..?
public class TestLSDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		if (age >= 18)
			System.out.println("Congrtulations !! You are eligible for Driving & Voting ");
		
		else {
			System.out.println("Babu chitti !! Niku inka time undi ra  ");
			System.out.println("Thank you !!");
		}

		System.out.println("main method ended ");
		sc.close();

	}

}
