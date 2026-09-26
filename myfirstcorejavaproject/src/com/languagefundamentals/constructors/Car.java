package com.languagefundamentals.constructors;

public class Car {

	String brand;
	String model;
	double price;
	String color;
	int year;

	Car() {
		this("unknown");// calling one arg constructor in no arg
	}

//	Car() {
//		this("unknown");// calling one arg constructor in no arg
//	}
	
//	one-arg constructor 
	Car(String model) {
//		System.out.println("one arg constructor called !");
		this(model, "unknown");// Calling two arg constructor in one arg
	}

//	two-arg constructor
	Car(String model, String brand) {
//		System.out.println("Two-arg constructor called ");
		this(model, brand, "unknown");

	}

//	three-arg constructor 
	Car(String model, String brand, String color) {
//		System.out.println("Three- arg constructor called ");
		this(model, brand, color, 0.0);

	}

//	four arg constructor 
	Car(String model, String brand, String color, double price) {
//		System.out.println("Four arg constructor called ");
		this(model, brand, color, price, 2020);
	}

//	five arg constructor
	Car(String model, String brand, String color, double price, int year) {
		System.out.println("Five arg constructor called ");
		this.model = model;
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.year = year;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Welcome to Vcube car Show-room");

		Car c = new Car();
		c.carInfo();
		

		Car c1 = new Car("Sonet");
//		c1.carInfo();
		System.out.println(c1.model);
//
//		Car c2 = new Car("Sonet", "KIA");
//		c2.carInfo();
//
		Car c3 = new Car("Sonet", "KIA", "Red");
		c3.carInfo();
//
//		Car c4 = new Car("Sonet", "KIA", "Red", 1400000.00);
//		c4.carInfo();
//
		Car c5 = new Car("Nexon", "Tata", "White", 1500000.00, 2026);
		c5.carInfo();
		System.out.println("main method ended");
	}

	void carInfo() {
		System.out.println("****************************");
		System.out.println("Brand of the Car : " + brand);
		System.out.println("Model of the Car : " + model);
		System.out.println("Price of the Car : " + price);
		System.out.println("Color of the Car : " + color);
		System.out.println("Year of the Car : " + year);

	}

}
