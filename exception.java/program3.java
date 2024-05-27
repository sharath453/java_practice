package exception;

public class prog3 {
	public static void main(String[] args) {

		int a = 8;
		int b = 1;

		/*
		 * in a single try block we can create 'n' number of catch block to handle
		 * different types of exception
		 */

		try {
			System.out.println(a / b);
			System.out.println("the division completed !");
			System.out.println(" array starts !");
			int a1[] = { 3, 4, 5, 0, 6, 7, 2 };
			System.out.println(a1[10]); // we are calling index which is out of array size is an exception
		}

		// to handle only Arithmetic exception
		catch (ArithmeticException e) {

			String s = e.getMessage();
			System.out.println(s);

		}

		// to handle only ARRAYINDEXOUTOFBOUNDS exception :
		catch (ArrayIndexOutOfBoundsException e) {

			String s = e.getMessage();
			System.out.println(s);

		}
	}
}
