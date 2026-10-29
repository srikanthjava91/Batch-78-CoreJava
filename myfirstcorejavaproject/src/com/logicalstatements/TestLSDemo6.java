package com.logicalstatements;

import java.util.Scanner;

//WAP to find the Cricketer info based in the Jersey number.
public class TestLSDemo6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Jersey Number: ");
		int jno = sc.nextInt();

		switch (jno) {
		case 7:
			System.out.println("MSD : Mahendra SIngh Dhoni");
			System.out.println("Great Wicket Keeper & Thala for a Reason");
			break;
		case 18:
			System.out.println("VK : Virat Kohli");
			System.out.println("Aggressive Cricketer !! King Kohli ");
			break;
		case 45:
			System.out.println("RS : Rohit Sharma  : ");
			System.out.println("Hit man & Cool Batsman");
			break;
		case 4:
			System.out.println("AB : Abhisheik Sharma  : ");
			System.out.println("Aya Sher !!");
			break;
		default:
			System.out.println("Entred Jersey number is not in my list  ");

		}
	}
}
