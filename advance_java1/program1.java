// Define a generic class 'towgen' with two type parameters 't' and 'v'
class towgen<t, v> {
    // Declare two instance variables of types 't' and 'v'
    t ob1;
    v ob2;

    // Constructor to initialize the instance variables
    towgen(t o1, v o2) {
        ob1 = o1;
        ob2 = o2;
    }

    // Method to display the types of the instance variables
    void showtypes() {
        // Get the class names of the instance variables and print them
        System.out.println("types t is " + ob1.getClass().getName());
        System.out.println("type of v is " + ob2.getClass().getName());
    }

    // Method to return the value of 'ob1'
    t getob1() {
        return ob1;
    }

    // Method to return the value of 'ob2'
    v getob2() {
        return ob2;
    }
}

// Main class to test the 'towgen' class
public class day2 {
    public static void main(String[] args) {
        // Create an instance of 'towgen' with Integer and String types
        towgen<Integer, String> tobj = new towgen<Integer, String>(88, "geniiries");
        
        // Call the 'showtypes' method to display the types of the instance variables
        tobj.showtypes();

        // Get the values of 'ob1' and 'ob2' and store them in local variables
        int v = tobj.getob1();
        String t = tobj.getob2();

        // Print the values of the instance variables
        System.out.println(v);
        System.out.println(t);
    }
}
