package wiproprograms;
import java.util.Arrays;
import java.util.Collections;

public class arrayelementsdesc {
    public static void main(String[] args) {
        // Step 1: Creating an array of integers
        Integer[] numbers = {3, 7, 2, 15, 10};

        // Step 2: Using Arrays.sort() method with a custom comparator for descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // Step 3: Displaying the sorted array
        System.out.println("Array elements in descending order: " + Arrays.toString(numbers));
    }
}