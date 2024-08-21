package wiproprograms;
import java.util.Scanner;

public class primenumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number to check
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // If divisible by any number other than 1 and itself
                    break;
                }
            }
        }

        // Output: result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}