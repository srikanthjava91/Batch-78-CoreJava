package com.languagefundamentals;

//Floating Literals
//byte short int long float double 
public class TestLiteralsDemo3 {

	public static void main(String[] args) {

		float f1 = 123;
		float f2 = 123F;
		float f3 = 123.5F;
//		float f4 = 123.5;//CE : Type mismatch: cannot convert from double to float 
		float f5 = 0123.5F;
		float f6 = 0123;
//		float f7 = 0123.5;//CE : Type mismatch: cannot convert from double to float
		float f8 = 0x123;
		float f9 = 0x123F;// a-f/A-F
//		float f10 = 0x123.5F;//Invalid hex literal number
//		float f11 =0x123.5;//Invalid hex literal number

		System.out.println(f1);// 123.0
		System.out.println(f2);// 123.0
		System.out.println(f3);// 123.5
		System.out.println(f5);// 123.5
		System.out.println(f6);// 83.0
		System.out.println(f8);// 291.0
		System.out.println(f9);// 291.0
	}
}
