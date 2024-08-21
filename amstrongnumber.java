import java.util.Scanner;

/**
 * Java Program to Check Armstrong Number
 * Author: https://www.javaguides.net/
 */
public class amstrongnumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input from the user
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();

        // Step 2: Calculate the number of digits
        int numberOfDigits = String.valueOf(number).length();

        // Step 3: Compute the sum of digits raised to the power of numberOfDigits
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberOfDigits);
            temp /= 10;
        }

        // Step 4: Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}