package wiproprograms;
import java.util.Scanner;

public class lcmoftwonumbers {
    public static void main(String[] args) {
        // Scanner for reading user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        // Calculate LCM
        int lcm = lcm(firstNumber, secondNumber);

        // Display LCM
        System.out.println("The LCM of " + firstNumber + " and " + secondNumber + " is: " + lcm);

        scanner.close(); // Close scanner
    }

    // Method to find GCD using the Euclidean algorithm
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    // Method to calculate LCM using the formula: lcm(a, b) = (a * b) / gcd(a, b)
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}