package wiproprograms;
import java.util.Scanner; // Import Scanner class

public class strongnumber { // Step 1: Define a class named StrongNumber

    public static void main(String[] args) { // Step 2: Define the main method

        Scanner sc = new Scanner(System.in); // Step 3: Create Scanner object to read input

        System.out.println("Enter a number: "); // Step 4: Prompt the user to enter a number
        int num = sc.nextInt(); // Read the user input

        int originalNum = num; // Step 5: Store the original number
        int sum = 0; // Initialize sum to 0

        // Step 6: Create a loop to calculate the sum of the factorial of each digit
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            int factorial = 1; // Initialize factorial to 1
            for (int i = 1; i <= digit; i++) {
                factorial *= i; // Calculate factorial of the digit
            }
            sum += factorial; // Add the factorial to the sum
            num /= 10; // Remove the last digit
        }

        // Step 7: Compare the calculated sum with the original number
        if (originalNum == sum) {
            System.out.println(originalNum + " is a Strong Number."); // Step 8: Print the result
        } else {
            System.out.println(originalNum + " is not a Strong Number."); // Step 8: Print the result
        }
    }
}