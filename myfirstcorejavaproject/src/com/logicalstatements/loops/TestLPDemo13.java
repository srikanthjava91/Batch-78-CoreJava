package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print the Given number in a Reverse order ..? 
//input is : 789 
//output : 987

public class TestLPDemo13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ënter a number : ");
		int n = sc.nextInt();// 123

		int rev = reveseNumber(n);
		System.out.println("The Reverse number for a Given number is : " + rev);
		
		if(rev == n) {
			System.out.println("The Given number is Palindrome !!");
		}else {
			System.out.println("The Given number is not a Palindrome !!");
		}

	}

	private static int reveseNumber(int n) {
		int r = 0;
		int reverse = 0;

		while (n > 0) {
			r = n % 10;// 123%10 --> 3,12%10 --> 2,1%10 --> 1
			n = n / 10;// 123/10 --> 12,12/10 --> 1 ,1/10 --> 0
			reverse = reverse * 10 + r;// 3--> 30 + 2 = 32 *10 + 320 + 1 = 321
		}

		return reverse;
	}
}
