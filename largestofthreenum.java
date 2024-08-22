package wiproprograms;
import java.util.Scanner;

/**
 * Java Program to Find the Largest of Three Numbers using if-else statements
 * Author: https://www.javaguides.net/
 */
public class largestofthreenum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Step 2: Compare the numbers using if-else statements
        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Step 3: Display the result
        System.out.println("The largest number is " + largest);
    }
}