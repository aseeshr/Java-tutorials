package function.declarations;

public class retTypeWithArg {
	public static void main(String[] args) {
		 int x = add(500,400);
		 System.out.println("The sum is " + x);
	}

	static int add(int a,int b) {
		int sum = a+b;
		return sum;

	}
}
