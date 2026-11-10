package com.logicalstatements.loops;

//WAP to print 10 to 0 using for loop ..? 
public class TestLPDemo2 {

	public static void main(String[] args) {

		for (byte i = 10; i >= 0; i = (byte) (i-1)) {
			if (i % 2 == 1 && i != 0) {
				System.out.println(i);
			}
		}

	}

}
