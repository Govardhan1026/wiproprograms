package wiproprograms;
public class swapnumbers { // Step 1: Define a class named SwapNumbers

    public static void main(String[] args) { // Main method

        int num1 = 20; // Step 2: Declare and initialize the first number
        int num2 = 30; // Declare and initialize the second number

        System.out.println("Numbers before swapping: " + " num1 = " + num1 + ", num2 = " + num2);

        // Step 3: Perform the swapping using arithmetic operations
        num1 = num1 + num2; // num1 now holds the sum of num1 and num2
        num2 = num1 - num2; // num2 now holds the original value of num1
        num1 = num1 - num2; // num1 now holds the original value of num2

        // Step 4: Print the values after swapping
        System.out.println("Numbers after swapping: " + " num1 = " + num1 + ", num2 = " + num2);
    }
}