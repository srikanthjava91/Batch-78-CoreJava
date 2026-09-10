package com.languagefundamentals;

import java.util.Scanner;

//7 8 9 10 14
public class Student {
	int roll_number;
	String name;
	double salary$;

	void read() {
		System.out.println("Read method called ");
	}

	void write() {
		System.out.println("Write method called ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		System.out.println(s1.roll_number);
		System.out.println(s1.name);
		System.out.println(s1.salary$);
		s1.read();
		s1.write();
	}
}
