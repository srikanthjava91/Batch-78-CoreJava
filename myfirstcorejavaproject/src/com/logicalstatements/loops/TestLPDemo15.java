package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		boolean flag = isArmStrong(n);

		if (flag) {
			System.out.println("The Given Number is Armstrong number");
		} else {
			System.out.println("The Given Number is not Armstrong number");
		}

	}

	static boolean isArmStrong(int n) {
		boolean status = false;
		int r = 0;
		int sumP = 0;
		int digitCount = 0;

		int n1 = n;
		int temp = n;

		//O(d)
		while (n > 0) {
			n = n / 10;// 15 1 0
			digitCount++;
		}

		//O(d)
		//Overall --> O(2d)
		while (n1 > 0) {
			r = n1 % 10;
			n1 = n1 / 10;// 15 1 0
			sumP = (int) (sumP + Math.pow(r, digitCount));
		}

		if (sumP == temp) {
			status = true;
		}

		return status;
	}

}
