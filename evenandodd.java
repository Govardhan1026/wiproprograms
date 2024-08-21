package wiproprograms;
public class evenandodd {

	public static void main(String[] args) {
		int n = 20; // Upper limit for numbers to check

		System.out.println("Even Numbers:");
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\nOdd Numbers:");
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
