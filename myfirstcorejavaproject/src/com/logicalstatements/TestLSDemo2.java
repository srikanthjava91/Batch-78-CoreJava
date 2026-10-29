package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("are you coming to the classes Regularly ..? ");
		boolean areYouComingForClassesRegularly = sc.nextBoolean();
		
		System.out.println("Are you completing Daily Assignments in a same day ..? ");
		boolean areYouCompletingDailyAssignments = sc.nextBoolean();
		
		System.out.println("Are you attending Mock Intervews Every week with oit fail; ..? ");
		boolean areYouAttendingMocks = sc.nextBoolean();
		
		if(areYouComingForClassesRegularly && areYouCompletingDailyAssignments && areYouAttendingMocks ) {
			System.out.println("Congrtulations !! ");
			System.out.println("Your Parents Drems Come true !!");
		}else {
			System.out.println("You are Cheating your parents directly without mask !! ");
		}

	}

}
