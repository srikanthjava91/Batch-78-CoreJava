package com.accessmodifiers01;

//Illegal modifier for the interface TestIn2; 
//only public,<default>,strictfp & abstract are permitted
//private interface TestIn2{
//	
//}

//Illegal modifier for the class TestAccessDemo1;
//only public,<default>,strictfp, abstract & final are permitted.
public class TestAccessDemo1 {

//	 private Data members
	private int id1;
	private String name1;

	private void method1() {
		System.out.println("method1 called !!");
	}

//	 default Data members
	int id2 = 18;
	String name2 = "Virat";

	void method2() {
		System.out.println("method2 called !!");
	}

//	 public Data members
	public int id3 = 7;
	public String name3 = "MSD";

	public void method3() {
		System.out.println("method3 called !!");
	}

//	 protected Data members
	protected int id4 = 9;
	protected String name4 = "Srikanth";

	protected void method4() {
		System.out.println("method4 called !!");
	}

	// blocks scope is always class scope
	{
		System.out.println("instance block called ");
	}

	static {
		System.out.println("static block called ");
	}

//	By using private constructor, 
//	we can stop the Object creation, outside of the classes.
//	private constructors can help to Singleton Design pattern.
//	private TestAccessDemo1() {
//		System.out.println("no arg constructor called ");
//	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestAccessDemo1 t1 = new TestAccessDemo1();

		// private data members, we can access within the class
		System.out.println(t1.id1);
		System.out.println(t1.name1);
		t1.method1();

		// Default data members, we can access within the class
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2();

		// public data members, we can access within the class
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();

		// protected data members, we can access within the class
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();

		System.out.println("main method ended ");
	}

	// Inner classes & interfaces
	private class TestA {

	}

	private interface In1 {

	}
}
