package day3;

import java.util.Scanner;

public class conditional_stmt {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age :");

		System.out.println("enter the year :");
		int year = sc.nextInt();

		// Check if the year is a leap year
		boolean isLeap = isLeapYear(year);

		// Print the result
		if (isLeap) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}

		// Close the scanner
		sc.close();
	}

	// Method to check if a year is a leap year
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				return year % 400 == 0;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
}
