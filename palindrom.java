package wiproprograms;
import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        // Creating a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Storing the original number for comparison
        int originalNumber = number;

        // Reversing the number
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Checking if the number is a palindrome
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }

        scanner.close(); // Closing the scanner
    }
}