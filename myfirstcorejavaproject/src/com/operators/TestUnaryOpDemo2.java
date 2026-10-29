package com.operators;

public class TestUnaryOpDemo2 {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		System.out.println(--x);//9
		System.out.println(x++);//9 --> 10 
		System.out.println(++x);//11
		System.out.println(x--);//11 --> 10 
		System.out.println(x--);//10 --> 9 
		System.out.println(--y);//19
		System.out.println(++y);//20
		System.out.println(--x);//8
		System.out.println(x++);//8 --> 9 
		System.out.println(--y);//19
		System.out.println(--y);//18
		System.out.println(y--);//18 --> 17 
		System.out.println(y++);//17 --> 18 
		System.out.println(y--);//18 --> 17 

		System.out.println(x + y);//9 + 17 = 26 
		
		System.out.println(++x + ++y );//10 + 18 = 28 
		
		//11 + 18--> 19  = 29 + 18 + 11
		System.out.println(++x  + y++ + --y + x++);

		System.out.println("X value : " + x);//9 10 11 
		System.out.println("Y value : " + y);//17 18 
		
	}

}
