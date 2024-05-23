package day4;
import java.util.Arrays;
import java.util.Scanner;
public class string_sorting {
public static void main(String[] args) {
	
	String arr[];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array :");
	int size =sc.nextInt();
	
	arr=new String[size];
	System.out.println("enter the string :");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.next();
	}
	
	System.out.println("array value before sorting :");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
	Arrays.sort(arr);
	System.out.println("array value after sortig :");
	for(int i=0;i<arr.length;i++)
	{
		
		System.out.println(arr[i]);
	}
	
}
}
