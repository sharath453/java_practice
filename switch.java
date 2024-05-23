package day3;

import java.util.Scanner;

public class switch_condition {

	public static void main(String[] args) {
        
        // finding in which month how many days are present 
		
        
        Scanner sc = new Scanner(System.in);
		System.out.println("enter the choice :");
		int choice = sc.nextInt();

		switch (choice) {
		case 1, 3, 5, 7, 10, 12:

			System.out.println("30 days !");
			break;

		case 2:

			System.out.println("28 days !");
			break;

		case 4, 6, 9, 11:

			System.out.println("28 days!");
			break;

		default:
			System.out.println(" does't exist");
		}

	}

}
