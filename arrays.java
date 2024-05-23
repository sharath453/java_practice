package day4;
import java.util.Iterator;
import java.util.Scanner;
public class arrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int arr[]; // declaration
		arr = new int[4]; // initilization with new key word
		System.out.println(arr); // it will print the address of the array
		System.out.println(arr.length); // it will print length of an array

		for (int b : arr) { // for each loop
			System.out.println(b);
		}

		int a[] = { 2, 3, 4, 5, 6, 8 }; // array initilization in other ways
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		
		int array[];
		System.out.println("enter the size of array :");
		int size=sc.nextInt();
		array=new int[size];
		
		
		System.out.println("enter the value of array :");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();	
		}
		
		
		System.out.println("the array values are :");
		for(int b:array)
		{
			System.out.println(b);
		}

	}
}
