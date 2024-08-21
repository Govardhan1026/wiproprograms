package wiproprograms;
public class addandsub {
	static int AddMethodInt(int x, int y) {
		return x + y;
	}

	static int SubMethodInt(int x, int y) {
		return x - y;
	}

	public static void main(String[] args) {
		int myNum1 = AddMethodInt(110, 15);
		int myNum2 = SubMethodInt(1100, 143);
		System.out.println("int:" + myNum1);
		System.out.println("int:" + myNum2);
	}
}
