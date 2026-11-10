package com.accessmodifiers01;

public class TestAccessDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started from TestACcessDemo2 ");
//		We can create one class object into another class.
//		If the Class constructor is private, we cannot create objects, 
//		outside of the classes too.
		TestAccessDemo1 t1 = new TestAccessDemo1();

//		 private data members, we cannot access outside of the classes
//		System.out.println(t1.id1);
//		System.out.println(t1.name1);
//		t1.method1();

		// Default data members, we can access outside of the class
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2();

		// public data members, we can access outside of the class
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();

		// protected data members, we can access outside of the class
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();
	}
}
