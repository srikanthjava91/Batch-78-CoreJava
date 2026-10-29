package com.operators;

//Ternary Operators --> ? and : 
//syntax : (condition)?st1 if condition is true :st2 if the condition is false;
//It is working lie a if else conditions 
public class TestTernaryOpDemo1 {

	public static void main(String[] args) {

		int x = 10;
		int y = 100;

		int max = (x > y) ? x : y;
		System.out.println("Max value from two numbers : " + max);

		int age = 21;
		String isEligible = (age > 18) ? "Yes" : "NO";
		System.out.println("is the Givemn age is Eligible for Driving ..? " + isEligible);
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		
		int max1 = (a>b)
					?((a>c)?a:c)
					:(b>c)?b:c;
		System.out.println("Max value is : " +max1);

	}

}
