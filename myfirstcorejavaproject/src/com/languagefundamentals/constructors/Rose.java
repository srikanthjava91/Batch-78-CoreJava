package com.languagefundamentals.constructors;

class Flower {

	String name = "Lotus";

	{
		System.out.println("instance block from Flower !!");
	}

	public Flower() {
		System.out.println("No arg constructor called from Flower ");
	}

	public static void main(String[] args) {
		System.out.println("mian method started from Flower !!");
	}

}

public class Rose extends Flower {

	String name = "Rose";

	public Rose() {
		super();
		System.out.println("No arg constructor called from Rose ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Rose !!");

		Rose r = new Rose();
		r.roseInfo();

//		Cannot use super in a static context
//		System.out.println("Name of the Flower : " + super.name);
//		Cannot use this in a static context
//		System.out.println("Name of the Flower : " + this.name);

	}

	void roseInfo() {
		System.out.println("Name of the Flower : " + super.name);
		System.out.println("Name of the Flower : " + this.name);
	}

}
