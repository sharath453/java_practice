package day5;

import java.util.Objects;

// class 
class bottle{

	int capacity;
	String brand;
	int price;
	String color;
	
// constructor 
public bottle(int capacity, String brand, int price,  String color) {
		super();
		this.capacity = capacity;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}


//hash code method for compare properties  
@Override
public int hashCode() {
	return Objects.hash(brand, capacity, color, price);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	bottle other = (bottle) obj;
	return Objects.equals(brand, other.brand) && capacity == other.capacity && Objects.equals(color, other.color)
			&& price == other.price;
}


//--toString-- method to print the properties 

@Override
public String toString() {
	return "bottle [capacity=" + capacity + ", price=" + price + "]";
}

//main method 

public class prob2 {
public static void main(String[] args) {
	
	  bottle m1=new bottle(34,"bindu",45,"blue");
	  bottle m2=new bottle(35,"bindu",45,"blue");
	  
	  System.out.println(m1.equals(m2)); //compare properties of m1 with m2 and return boolean vale 
	  System.out.println(m2.equals(m1)); //compare properties of m2 with m1 and return boolean value 
	 
	  System.out.println();
	  System.out.println(m1);   //print the properties of m1 object 
	  System.out.println(m2);	
}
}
}
