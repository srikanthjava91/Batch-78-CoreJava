package com.logicalstatements;

import java.util.Scanner;

//WAP to check the Given name eligible for Passport.
public class TestLSDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Full name : " );
		String fname = sc.nextLine();
		
		if(fname.length() <=15) {
			System.out.println("Your Full name is eligible for passport !!");
		}else {
			System.out.println("Your name is Too long, you must short the name !!");
		}
		
		
		System.out.println("main method ended ");
	}

}
