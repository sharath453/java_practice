package day2;

public class prog1 {

	public static void main(String[] args) {
		float s=0.5f; //use f in the end of initilization 
		int b=4;
		float p=s+b;
		System.out.println(p);
		
		
	//compound operators
		
		int a ='A';
		a+=1;
		a=a+1;  //error in arthematic operators
		System.out.println(a);
		
		
	//bollean operators
		
		int a=9;
		int n=6;
		boolean c=a<n;
		boolean m='A'<'b';
		System.out.println(m);
		
		
		
	//logical operators
		
		System.out.println(7>3 && 9>4);         //logical AND :both condition should be true the it will return boolean true 
		System.out.println(7>4 || 5<4);         //logical or if anyone condition is true it will return boolean true 
		System.out.println(2+3/4%5*8);          //if statement contain more than 1 operators it will perform operation based on precedence
		
		
	}

}
