package com.languagefundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

class Dog {

}

class Cat {

}

public class TestDataTypesDemo2 {

	///	String is a collection of characters store it into a single variable with double quotes.
/// String Literals 
	String str = "Ganesh";
	String str1 = new String();// String Object 
	String str2 = new String("Srikanth");// String Object

//	the below Object is created with the help of 
//	default constructor provided by the Java compiler 
//	Whenever your class does not contain any other constructors then only 
//	Java compiler will create a default constructor.
//	TestDataTypesDemo2 t = new TestDataTypesDemo2();

	///	 CE : Type mismatch: cannot convert from int to BigInteger
///  BigInteger bi = 100; CE 
/// CE : The constructor BigInteger() is undefined
//	BigInteger bi = new BigInteger();
//	Translates the decimal String representation of a BigInteger into a BigInteger.
	BigInteger bi1 = new BigInteger("86543256789087432567897543256789897657897657");
	BigInteger bi2 = new BigInteger("86543256789087432567897543256789897657897657");

	BigDecimal bd;

//	Converting Primitive data type values to Wrapper Object Data Types will consider as 
//	Auto-Boxing
	Integer in = 100; // int --> Integer --> Auto-Boxing
//	Internally it works woth valueOf() method Integer class.
//	Integer in1 = Integer.valueOf(100);

//	Converting Wrapper Object data Types value into Primitive Data Types will consider as 
//	Auto-UnBoxing 
	int a = in;

//	Internally it works with intValue() or byteValue() 
//	int a1 = in.intValue();
	
//	/The constructor Integer(String) is deprecated since version 9
	Integer i2 = new Integer("2147483647");

	Float f;
	Character ch;
	Boolean boo;

	Dog d;
	Cat c;

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestDataTypesDemo2 t1 = new TestDataTypesDemo2();
		
		System.out.println(t1.i2);

		System.out.println(t1.str1);
		System.out.println(t1.str2 + "-Vcube");// + Concatenation

//		The operator + is undefined for the argument type(s) 
//		java.math.BigInteger, java.math.BigInteger
//		System.out.println(t1.bi1 + t1.bi2);

		System.out.println(t1.bi1.add(t1.bi2));
		System.out.println(t1.bi1.multiply(t1.bi2));

		System.out.println(t1.str);// null
		System.out.println(t1.bi1);// 0 null
		System.out.println(t1.bd);// 0 null

		System.out.println(t1.in);// 0
		System.out.println(t1.f);// 0.0
		System.out.println(t1.ch);//
		System.out.println(t1.boo);// false

		System.out.println(t1.d);//
		System.out.println(t1.c);//

		System.out.println("main method ended ");

	}

}
