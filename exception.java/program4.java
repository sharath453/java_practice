package exception;
public class prog4 {
public static void main(String[] args) {
	
	try {
		
		System.out.println("div method starts ! exceprion occored ");
		div(4,1);
	} 
	
	catch (Exception e) {
		String s=e.getMessage();
		System.out.println(s);	
		System.out.println(" program ended !");
	}
	
	//finally block execute even with the exception and without exception 
	finally {
		System.out.println("helow sharath !");
	}
}


private static void div(int i, int j) {
	int c=i/j;
	System.out.println(c);
	
}
}
