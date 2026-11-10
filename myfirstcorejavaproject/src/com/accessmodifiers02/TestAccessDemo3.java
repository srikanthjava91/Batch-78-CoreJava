package com.accessmodifiers02;

import com.accessmodifiers01.TestAccessDemo1;

public class TestAccessDemo3 extends TestAccessDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started from TestAccessDemo3");

		TestAccessDemo1 t1 = new TestAccessDemo1();

//		Even though, your class is public, we cannot access the default data members outside of the packages.
//		System.out.println(t1.id2);
//		System.out.println(t1.name2);
//		t1.method2();

		// public data members, we can access outside of the packages too.
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();
		
//		 protected data members, we cannot able to access outside of the packages directly.
//		We can access outside of the packages of subclasses with sub class object reference only.
//		System.out.println(t1.id4);
//		System.out.println(t1.name4);
//		t1.method4();
		
		TestAccessDemo3 t3 = new TestAccessDemo3();
		System.out.println(t3.id4);
		System.out.println(t3.name4);
		t3.method4();

		System.out.println("main method ended ");
	}
}
