package function.declarations;

import java.util.Scanner;

public class FuncBiography {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fn, ln, address;
		int age;
		System.out.println("Enter your first name :");
		fn = sc.next();
		// String firstName = fns(fn);
		System.out.println("Enter your last name :");
		ln = sc.next();
		System.out.println("Enter your age :");
		age = sc.nextInt();
		System.out.println("Enter your address :");
		address = sc.next();

	}

	static String fns(String fn) {
		return fn;
	}

}
