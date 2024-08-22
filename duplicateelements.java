package wiproprograms;
import java.util.Scanner;

/**
 * Java Program to Find Duplicate Elements in an Array using Nested Loops
 * Author: https://www.javaguides.net/
 */
public class duplicateelements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Initialize the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Step 2: Find and display duplicate elements using nested loops
        System.out.print("Duplicate elements: ");
        boolean hasDuplicates = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    hasDuplicates = true;
                    break;
                }
            }
        }
        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println();
        }
    }
}