package com.operators;

//Bitwise Operators : & | ^ ~  
public class TestBitwiseDemo1 {

	public static void main(String[] args) {
		System.out.println(false & true);// false
		System.out.println(86 & 5);
		System.out.println(116 & 23);// 20
		System.out.println(79 & 45);// 13
		System.out.println(87 & 34);// 2
		System.out.println(67 & 26);// 2

		System.out.println(86 | 5);
		System.out.println(116 | 23);// 119
		System.out.println(79 | 45);// 111
		System.out.println(87 | 34);// 119
		System.out.println(67 | 26);// 91

		
		System.out.println(true ^ true);//false 
		System.out.println(true ^ false);//true
		System.out.println(false ^ true);//true
		System.out.println(false ^ false);//false
		System.out.println(86 ^ 5);
		System.out.println(116 ^ 23);// 99
		System.out.println(79 ^ 45);// 
		System.out.println(87 ^ 34);// 
		System.out.println(67 ^ 26);// 
		
		
		System.out.println(~9);// -(n+1)
		
	}

}
