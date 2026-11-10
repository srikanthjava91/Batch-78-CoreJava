package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print Decimal numbers to Binary ..?
public class TestLPDemo16 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int r = 0;
		String bin = "";

		while (n > 0) {
			r = n % 2;// 18%2=0, 9%2 = 1,4%2=0,2%2=0,1%2=1
			n = n / 2;// 18/2=9,9/2=4,4/2=2,2/2=1,1/2=0
			bin = r + bin;// 01001--> 10010

		}
		
		System.out.println("Binary value of a Given  number is : " + bin);

	}

}
