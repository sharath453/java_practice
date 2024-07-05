package venkatesh_sir_class;

// Define a generic class Array
class Array<T> {
    // Declare an array of type T
    private T[] a;
    
    // Constructor to initialize the array
    public Array(T[] words) {
        a = words;
    }
    
    // Method to display the elements of the array
    public void display() {
        for (T word : a) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    // Method to perform a linear search on the array
    public int linearSearch(T key) {
        for (int i = 0; i < a.length; i++) {
            // Check if the current element equals the key
            if (a[i].equals(key)) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if the key is not found
    }
}

// Main class to test the Array class
public class LinearSearch {
    public static void main(String[] args) {
        // Create an array of Strings
        String[] words = {"Dog", "cup", "cat", "Tea", "jug"};
        // Instantiate the Array class with String type
        Array<String> myArray = new Array<>(words);
        // Display the elements of the String array
        myArray.display();
        System.out.println();

        // Create an array of Integers
        Integer[] intArr = {12, 34, 54, 65, 6, 7};
        // Instantiate the Array class with Integer type
        Array<Integer> myIntArray = new Array<>(intArr);
        // Display the elements of the Integer array
        myIntArray.display();
        System.out.println();

        // Linear Search Examples
        // Perform linear search for "cat" in the String array
        int stringIndex = myArray.linearSearch("cat");
        System.out.println("Index of 'cat': " + stringIndex);

        // Perform linear search for 54 in the Integer array
        int intIndex = myIntArray.linearSearch(54);
        System.out.println("Index of 54: " + intIndex);
    }
}
