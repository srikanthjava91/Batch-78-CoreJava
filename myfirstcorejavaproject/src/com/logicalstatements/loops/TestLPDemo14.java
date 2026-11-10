package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to Check the Given number is Armstrong number or not .? 
//An Armstrong number is a number that equals the sum of its own digits 
//each raised to the power of the number of digits—for example, 153 = 1³ + 5³ + 3³.
public class TestLPDemo14 {

	static boolean isArmStrongNum(int n) {
		boolean status = false;
		int r = 0;
		int sumP = 0;
		int temp = n;

		String str = Integer.toString(n);// 153
		int digitCount = str.length();// 3

		while (n > 0) {
			r = n % 10;// 153% 10 = 3, 15%10 = 5, 1%10= 1
			n = n / 10;// 153/10 = 15, 15/10 = 1 , 1/10 = 0
//			sumP = sumP + r * r * r;// 0 + 27+ 125 = 152 + 1 = 153
			sumP = (int) (sumP + Math.pow(r, digitCount));
		}

		if (temp == sumP) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ..");

//		System.out.println(Math.pow(8, 2));
		int n = sc.nextInt();

		boolean flag = isArmStrongNum(n);

		if (flag) {
			System.out.println("The Given number is Armstorng");
		} else {
			System.out.println("The Given number  is Not an  Armstorng");
		}

	}

}
