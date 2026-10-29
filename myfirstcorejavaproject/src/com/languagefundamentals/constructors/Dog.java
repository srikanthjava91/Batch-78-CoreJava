package com.languagefundamentals.constructors;

class Animal {

	String breed;
	int age;

	public static void main(String[] args) {
		System.out.println("main method startd from Animal");
	}

	Animal() {
		System.out.println("no arg constructor from Animal ");
	}

	Animal(String breed, int age) {
		System.out.println("Parameterized constructor called ");
		this.breed = breed;
		this.age = age;
	}

}

public class Dog extends Animal {

	Dog(String breed, int age) {
		this.breed = breed;
		this.age = age;
	}

	Dog() {
		super("Golden Retriever", 4);
//		super();//Constructor cannot have more than one explicit constructor call
		System.out.println("no arg constructor called from dog ");
	}

	public static void main(String[] args) {
		System.out.println("main methods started from Dog");

		Dog d1 = new Dog("German Shepherd", 5);
		d1.dogInfo();

		Dog d = new Dog();
		d.dogInfo();
		System.out.println("main methods ended from Dog");
	}

	void dogInfo() {
		System.out.println("**********************************");
		System.out.println("Breed of the Dog : " + breed);
		System.out.println("Age of the Dog : " + age);
	}

}
