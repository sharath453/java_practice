package venkatesh_sir_class;

// Define a generic class 'gen' with a type parameter 'T'
class gen<T> {
    T ob;

    // Constructor to initialize 'ob' with a value of type 'T'
    gen(T o) {
        ob = o;
    }

    // Method to return the value of 'ob'
    T getob() {
        return ob;
    }

    // Method to display the type of 'T'
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

// Main class 'Program1' to demonstrate the 'gen' class
public class Program1 {
    public static void main(String[] args) {
        // Create an instance 'iob' of 'gen' with type parameter 'Integer'
        gen<Integer> iob;
        iob = new gen<Integer>(88); // Instantiate with Integer value 88
        iob.showType(); // Display the type of 'iob'

        int v = iob.getob(); // Retrieve the value stored in 'iob'
        System.out.println("Value: " + v); // Print the value
        System.out.println();

        // Create an instance 'strob' of 'gen' with type parameter 'String'
        gen<String> strob = new gen<String>("generics test");
        strob.showType(); // Display the type of 'strob'

        String str = strob.getob(); // Retrieve the value stored in 'strob'
        System.out.println("Value: " + str); // Print the value
    }
}
