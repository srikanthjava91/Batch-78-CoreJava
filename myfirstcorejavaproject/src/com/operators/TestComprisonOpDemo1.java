package com.operators;

//== != > >= < <= --> will return boolean expression either true or false
//== operator checks the values or content if the data type is primitive.
//== Operator checks the addresses if the data type is Object type.
public class TestComprisonOpDemo1 {

	public static void main(String[] args) {

		String s = "Srikanth";// SCP --> 1
		String s1 = new String("srikanth");// Heap --> 1
		String s2 = new String("Ram");// 2 objects

		System.out.println(s == s1);// false
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));

		int a = 10;
		int b = 20;
		int c = 20;

		System.out.println(a == b);// false
		System.out.println(b == c);// true

		System.out.println(a < b);// true
		System.out.println(b <= c);// true
		System.out.println(c >= a);// true
		System.out.println(b > c);// false
		System.out.println(b != a);// true
	}
}
