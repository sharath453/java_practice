package venkatesh_sir_class;

// Define a class 'Box' to represent dimensions of a box
class Box {
    double width;
    double length;
    double depth;

    // Constructor to initialize dimensions of the box
    Box(double w, double l, double d) {
        width = w;
        length = l;
        depth = d;
    }

    // Override the toString() method to provide a string representation of the Box object
    @Override
    public String toString() {
        return "Dimensions: " + width + " by " + length + " by " + depth + ".";
    }
}

// Main class 'StringConversion' to demonstrate string conversion
public class StringConversion {
    public static void main(String[] args) {
        // Create a new Box object with dimensions 10, 12, and 14
        Box b = new Box(10, 12, 14);

        // Convert the Box object to a string and concatenate it with another string
        String s = "Box b: " + b;

        // Print the Box object using its toString() method
        System.out.println(b);

        // Print the concatenated string
        System.out.println(s);
    }
}
