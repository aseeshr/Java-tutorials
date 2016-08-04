package function.declarations;

public class retTypeWithNoarg {
	public static void main(String[] args) {
		int a = add();
		System.out.println(a);
	}

	static int add() {
		int a = 500;
		int b = 400;
		int sum = a + b;

		return sum;

	}

}
