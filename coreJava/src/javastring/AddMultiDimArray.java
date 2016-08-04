package javastring;

import java.util.Scanner;

public class AddMultiDimArray {
	public static void main(String[] args) {
		int[][] add1 = new int[2][2];
		
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < add1.length; i++) {
			for (int j = 0; j < add1.length; j++) {
				System.out.println("Please enter number for addision");
				add1[i][j] = sc.nextInt();
				sum = sum + add1[i][j];
				

			}
		}
		System.out.println(sum);

	}

}
