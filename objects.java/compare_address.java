package day5;

class book1{
	
	String name;
	String college;
	int age;
	int roll;
	
// create a constructor 
	
public book1(String name, String college, int age, int roll) {
		this.name = name;
		this.college = college;
		this.age = age;
		this.roll = roll;
	}
}


public class book {
public static void main(String[] args) {

	book1 p1=new book1("sharath","AIET",45,459);  //to access the constructor ,create a obj store it in p1 
	book1 p2=new book1("sharath","AIET",45,459);
	
	System.out.println(p1==p2); //compare the address of 2 objects 
		
	}	
}

