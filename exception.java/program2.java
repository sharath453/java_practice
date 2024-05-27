package exception;

public class prog2 {
public static void main(String[] args) {
	
	int a=9;
	int b=0;
	
	
	try {
		System.out.println(a/b);
	} catch (Exception e) {    //if we use exception as exception_type itself it will handle all type of exception 
		
		String a1=e.getMessage(); //this line get what type of exception it is .
		System.out.println(a1);
		
	}
	
	
	
	
	
}
}
