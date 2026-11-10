package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print Sum of the Digits from a Given number.
//input : 456324 
//output  : 24 

//input : 145
//output : 10 
public class TestLPDemo12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ënter a number :  ");
		int n = sc.nextInt();// 456
		int r = 0;
		int sum = 0;

		while (n > 0) {
			r = n % 10;//456%10 = 6, 45%10= 5, 4%10 = 4 
			n = n/10;//456/10 -> 45, 45/10 = 4, 4/10 = 0 
			sum = sum + r;//6+ 5 = 11+ 4 = 15  
		}
		
		System.out.println("Sum of it's Digits is : " + sum );

	}
}
