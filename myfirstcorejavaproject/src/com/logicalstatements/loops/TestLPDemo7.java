package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print Fibbonacci Series based on your requirements..?
//10 values in fibbonacci Series 
// 0 1 1 2 3 5 8 13 21 34 
public class TestLPDemo7 {

	public static void main(String[] args) {
		System.out.println("Main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many values want to print ..? ");
		int n = sc.nextInt();

		int n1 = 0;
		int n2 = 1;

		System.out.print(n1 + " " + n2);

		for (int i = 1; i <= n; i++) {
			int n3 = n1 + n2;// 0 +1 = 1
			System.out.print(" " + n3);// 1
			n1 = n2;
			n2 = n3;

		}
	}

}
