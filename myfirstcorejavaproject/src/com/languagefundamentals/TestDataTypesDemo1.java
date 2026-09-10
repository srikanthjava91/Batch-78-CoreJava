package com.languagefundamentals;

public class TestDataTypesDemo1 {

//	byte = 8 bits 
//	By default RHS numeric values are int.
//	CE : Type mismatch: cannot convert from int to byte.
//	-128 -127 -126 -125 ...... 0 1 2 3 4 ..... 126 127 
	byte b = (byte) 130;// -126 //Converting int to byte will consider as Explicit Type Casting.
	byte b1 = (byte) 257;

//	short = 2 bytes = 16 bits = 2^15
//	-32768 to 32767 
//	Type mismatch: cannot convert from int to short
	short s = (short) 32768;// Explicit Type Casting.
	short s1 = 32767;
	short s2 = b1;// Implicit Type casting : converting byte to Short

//	int = 4 bytes = 32 bits = 2^31 
//	-2147483648 to 2147483647 
	int i = 2147483647;

//	The literal 2147483648 of type int is out of range
//	int i1 = 2147483648;//we cannot convert because of the range.
	int i1 = (int) 2147483648L;// Explicit Type Casting. long to int

//	long = 8 bytes = 64 bits = 2^63
	long l = 2147483648L;
	long l1 = 9223372036854775807L;

//	By default RHS decimal point data will consider as double.
//	So when we represent float we must provide f or F as suffix.
//	Type mismatch: cannot convert from double to float
//	float f  = 5.9;//4 byte = 32 bits 
	float f = 5.9F;
	float f1 = 56.5432456738F;
	float f2 = 9223372036854775807875658675867F;
	double d = 56.5432456738D;

//	char = 2 bytes = -32767 + 32768 = 65535--> 0 to 65535 
//	A=65 B=66 ..... M= 77 N=78 .... Z=90 
//	a=97 b = 98 ... m= 109 n =110 .... z= 122
	char c = 'A';// single quote characters
	char c1 = 65;// ASCII values

	char c2 = '\u0040';// Uni-code values or Hex char values
	char c3 = '\u0020';//
	char c4 = '\u0041';//
	char c5 = 6754;//

	boolean boo = false;//true or false are the Literals 
	
//	boolean boo1 = 0;
//	boolean boo2 = 1;
//
//	boolean boo3 = TRUE;
//	boolean boo4 = FALSE;
//	
//	boolean boo5 = True;
//	boolean boo6 = False;
//
//	boolean boo3 = "true";
//	boolean boo3 = "false";
	
	public static void main(String[] args) {
		System.out.println("main method started ");
		TestDataTypesDemo1 t1 = new TestDataTypesDemo1();

		System.out.println("byte value : " + t1.b);// 0
		System.out.println("byte value : " + t1.b1);// 0

		System.out.println("short value : " + t1.s);// 0
		System.out.println("short value : " + t1.s1);// 0
		System.out.println("short value : " + t1.s2);// 0

		System.out.println("int value : " + t1.i);// 0

		System.out.println("long value: " + t1.l);// 0
		System.out.println("long value: " + t1.l1);// 0

		System.out.println("float value : " + t1.f);// 0.0
		System.out.println("float value : " + t1.f1);// 0.0
		System.out.println("float value : " + t1.f2);// 0.0

		System.out.println("double value " + t1.d);// 0.0
		
		System.out.println("char value : " + t1.c);//
		System.out.println("char value : " + t1.c1);//
		System.out.println("char value : " + t1.c2);//
		System.out.println("char value : " + t1.c3);//
		System.out.println("char value : " + t1.c4);//
		System.out.println("char value : " + t1.c5);//
		
		if(t1.boo) {
			System.out.println("Good morning !");
		}

		System.out.println("boolean vlaue : " + t1.boo);// false

	}

}
