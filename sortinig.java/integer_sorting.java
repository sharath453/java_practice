package day4;
import java.util.Scanner;
import java.util.Arrays;
public class sorting {
public static void main(String[] args) {
	
	int array[];
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the size of array :");
	int size=sc.nextInt();
	array=new int[size];
	
	System.out.println("enter the value of array :");
	for(int i=0;i<size;i++)
	{
		array[i]=sc.nextInt();
	}
	
	System.out.println(" arrays before sorting ");
	for(int i=0;i<size;i++)
	{
		System.out.println(array[i]);
	}
	
	System.out.println("aray elements after sortting :");
	Arrays.sort(array);
	for(int i=0;i<size;i++)
	{
		System.out.println(array[i]);
	}
	
}
}

