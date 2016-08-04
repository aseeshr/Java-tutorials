package function.declarations;

import java.util.Scanner;

public class retSum {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter integer value :");
		n = sc.nextInt();
		int s = sum(n);
		System.out.println("The total sum is " + s);
	}

	static int sum(int a) {
		int total = 0;
		for (int i = 0; i <= a; i++) {
			total = total + i;

		}
		return total;

	}
}
