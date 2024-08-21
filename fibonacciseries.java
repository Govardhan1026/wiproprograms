/*import java.util.Scanner; 
public class fibonacciseries { 

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the number of terms in the Fibonacci series: "); 
        int terms = input.nextInt();
        int firstTerm = 0, secondTerm = 1; 
        for (int i = 1; i <= terms; i++) {
            System.out.print(firstTerm + " "); 
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        input.close(); // Closing the Scanner object to avoid memory leak
    }
}*/
public class fibonacciseries {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a++ + --b;
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    }
}