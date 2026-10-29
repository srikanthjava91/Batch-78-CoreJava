package com.operators;


class A {
	
}

class B extends A {
	
}

public class TestInstanceOfDemo1 {
	
	

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		System.out.println(b instanceof B);
		System.out.println(b instanceof A);
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		
		Integer i1 = 10;
		
		System.out.println(i1 instanceof Integer);
		System.out.println(i1 instanceof Number);
		System.out.println(i1 instanceof Object);
		
		Object obj = 100;
		System.out.println(obj instanceof Number);
		
		String s = "one";
		System.out.println(s instanceof Object);
		System.out.println(s instanceof String);
		//Incompatible conditional operand types String and Integer
//		System.out.println(s instanceof Integer);
		System.out.println(null instanceof Integer);
		System.out.println(null instanceof Number);
		System.out.println(null instanceof String);
		

	}

}
