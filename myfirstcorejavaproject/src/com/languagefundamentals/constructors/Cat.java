package com.languagefundamentals.constructors;

class Animal1 {
	String name;
	int age;
	
	Animal1(){
		
	}

	public Animal1(String name, int age) {
		System.out.println("Parameterized consructor called from Animal1");
		this.name = name;
		this.age = age;
	}

}

public class Cat extends Animal1 {

	Cat() {
		super();// The constructor Animal1() is undefined
		System.out.println("no arg consructor called from cat");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Cat");
		Cat c = new Cat();
		c.catinfo();

		System.out.println("main method ended from cat");
	}

	void catinfo() {
		System.out.println("Name of the Cat : " + name);
		System.out.println("age of the Cat : " + age);

	}

}
