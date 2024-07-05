package venkatesh_sir_class;

public class demo2 {
    // Define a generic method to compare two arrays of the same type
    public static <T> boolean compare_Array(T[] array1, T[] array2) {
        // Check if the lengths of the arrays are different
        if (array1.length != array2.length) {
            return false; // If lengths are different, arrays are not equal
        }
        // Iterate through the arrays and compare elements
        for (int i = 0; i < array1.length; i++) {
            // If any pair of elements are not equal, return false
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        // If all elements are equal, return true
        return true;
    }

    public static void main(String[] args) {
        // Define arrays of Integer objects
        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {1, 2, 3, 4};
        Integer[] arr3 = {1, 2, 3, 5};
        Integer[] arr4 = {1, 2, 3};

        // Compare arrays and print the results
        System.out.println("arr1 and arr2 are equal: " + compare_Array(arr1, arr2)); // Should print true
        System.out.println("arr1 and arr3 are equal: " + compare_Array(arr1, arr3)); // Should print false
        System.out.println("arr1 and arr4 are equal: " + compare_Array(arr1, arr4)); // Should print false
    }
}
