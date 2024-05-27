package exception;

public class prob1 {
	public static void main(String[] args) {
		int a = 9;
		int b = 0;
		
		// to handle the exception we use try and catch block
		//if exception occour after the exception line no code will be executed. directly search for catch block
		
		try {
			System.out.println(a / b); // exception occur here
		} 
		 catch (ArithmeticException e) { // we have to tell that type of exception
			String a1 = e.getMessage(); // this line get for what reason we are getting exception.
			System.out.println(a1);

		}
		System.out.println("hello sharath the program is ended !");

	}
}
