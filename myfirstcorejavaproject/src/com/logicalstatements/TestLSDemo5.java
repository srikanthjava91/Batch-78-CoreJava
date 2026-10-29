package com.logicalstatements;

import java.util.Scanner;

//Manoj Aakash Manohar Pradeep
//Marriage Eligibility Check 
public class TestLSDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		System.out.println("Welcome to Vcube Matrimonial SIte ");

		Scanner sc = new Scanner(System.in);

		System.out.println("Can you enter your full name : ");
		String name = sc.nextLine();
		System.out.println("Nice to meet you Mr. " + name);

		System.out.println("Enter your assets : ");
		double assets = sc.nextDouble();

		if (assets >= 50000000.00) {
			System.out.println("Oh nice to Hear lets continue !!");

			System.out.println("Enter your salary !!");
			double salary = sc.nextDouble();

			if (salary >= 2500000.00) {
				System.out.println("Okay Good to go !! Lets continue the discussion ");

				System.out.println("Enter your age : ");
				int age = sc.nextInt();

				if (age >= 25 && age <= 29) {
					System.out.println("Oh nice !! goood to go ");

					System.out.println("Enter your Height & Weight !!");
					float height = sc.nextFloat();
					double weight = sc.nextDouble();
					
					if((height>=5.4 && height <=6.1) && (weight >=60 && weight <=80)) {
						System.out.println("Almost we are good to proceed !!");
						
						System.out.println("DO you have Siblings .? ");
						boolean sibStatus = sc.nextBoolean();
						
						if(!sibStatus) {
							System.out.println("Thank god !! ");
						}else {
							System.out.println("Oh MY GOD ");
						}
						
						
					}else {
						System.out.println("You must nee to join gym !!");
					}

				} else {
					System.out.println("Sorry !! Your age is not matching with our profile !!");
				}

			} else {
				System.out.println("First Concentrate on your carrer....");
			}

		} else {
			System.err.println("Sorry your profile is not matching with our expectations!! ");
		}

	}
}
