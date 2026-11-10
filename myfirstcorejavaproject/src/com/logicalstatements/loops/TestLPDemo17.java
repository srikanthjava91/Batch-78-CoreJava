package com.logicalstatements.loops;

//break & continue 
public class TestLPDemo17 {

	public static void main(String[] args) {

		int a = 10;
		do {
			System.out.println("hello");
			a++;
		} while (a < 15);

		int j = 10;
		while (j < 15) {
			System.out.println("Hello- while");
			j++;
		}

		for (int i = 0; i <= 10; i++) {
			if (i == 6) {
				continue;
			}
			System.out.println(i);
		}

	}
}
