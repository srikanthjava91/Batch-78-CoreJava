package com.logicalstatements;

import java.util.Scanner;

//WAP to print Day info Based on the Day String 
//Cannot switch on a value of type double. 
//Only convertible int values, strings or enum variables are permitted
public class TestLSDemo8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Day : ");
		String day = sc.next();

		switch (day) {
		case "Monday" -> System.out.println("Lazy day to work !!");

		case "Tuesday", "Wednesday", "Thuesday" -> {
			System.out.println("Normal days to work !!");
			System.out.println("Routine Days !!");
		}

		case "Friday" -> System.out.println("Weekend mode started");
		case "Saturday" -> System.out.println("Weekend, funday to enjoy");
		case "Sunday" -> System.out.println("Cricket day !! And REST day ");
		default -> System.out.println("Invaid day entred, please check ");

		}

	}

}
