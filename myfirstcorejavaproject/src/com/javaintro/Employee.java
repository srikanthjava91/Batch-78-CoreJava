package com.javaintro;

public class Employee {
	
	@Override
	protected void finalize()  {
		System.out.println("finalize method called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

//		2^31=2147483647
		Employee e1 = new Employee();

//		com.javaintro.Employee@1dbd16a6
		System.out.println(e1);// com.javaintro.Employee@Hexa-DecimalValue --> Address of the object

//		int objValue = 0X1dbd16a6;
//		System.out.println(objValue);// hashCode --> 498931366
//		System.out.println(e1.hashCode());// 498931366

		Employee e2 = new Employee();
		System.out.println(e2);// com.javaintro.Employee@7ad041f3

//		Nullifying the Object
		e1 = null;

//		Runs the garbage collector in the Java Virtual Machine
		System.gc();

	}
}
