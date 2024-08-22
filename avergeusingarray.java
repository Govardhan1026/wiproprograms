package wiproprograms;
public class avergeusingarray { // 1. Defining the main class

    public static void main(String[] args) { // 2. Defining the main method

        // 3. Declaring an array of numbers
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0; // Initializing sum

        // 4. Calculating the sum of the numbers in the array
        for (int number : numbers) {
            sum += number;
        }

        // 5. Calculating the average
        double average = (double) sum / numbers.length;

        // 6. Printing the average
        System.out.println("The average of the given numbers is: " + average);
    }
}