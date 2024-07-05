package venkatesh_sir_class;

// Define a class containing a generic method
class GenMethodDemo {
    // Define a generic method with two type parameters T and V
    // V is bounded to be a subtype of T
    static <T, V extends T> boolean isIn(T x, V[] y) {
        // Loop through the array y to check if any element equals x
        for (int i = 0; i < y.length; i++) {
            // If an element in y equals x, return true
            if (x.equals(y[i])) return true;
        }
        // If no element matches x, return false
        return false;
    }

    public static void main(String[] args) {
        // Create an array of Integer objects
        Integer nums[] = {1, 2, 3, 4, 5};

        // Check if 2 is in nums array
        if (isIn(2, nums))
            System.out.println("2 is in nums");
        // Check if 7 is in nums array
        if (!isIn(7, nums))
            System.out.println("7 is not in nums");
        System.out.println();

        // Create an array of String objects
        String strs[] = {"one", "two", "three", "four", "five"};

        // Check if "two" is in strs array
        if (isIn("two", strs))
            System.out.println("two is in strs");
        // Check if "seven" is in strs array
        if (!isIn("seven", strs))
            System.out.println("seven is not in strs");
    }
}
