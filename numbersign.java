package wiproprograms;
import java.util.Scanner;

public class numbersign {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        double number = scanner.nextDouble(); // Reading the number

        // Checking if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close(); // Closing the scanner
    }
}