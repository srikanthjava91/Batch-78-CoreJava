package com.arrays;

import java.util.Scanner;

//WAP to print the names whose names strats with r and ends with t.
public class TestArrDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		String[] names = new String[5];// 0 1 2 3 4 --> null

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements ");

		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();
		}

		for (int i = 0; i < names.length; i++) {
			if (names[i].toLowerCase().startsWith("r") && names[i].endsWith("t")) {
				System.out.println(names[i]);
			}
		}

//		System.out.println(Arrays.toString(names));
	}
}
