package javastring;

import java.util.Scanner;

import javax.swing.plaf.BorderUIResource.MatteBorderUIResource;

public class MultiDimArray {
	public static void main(String[] args) {
		int mat[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print("Please enter any number");
				mat[i][j] = sc.nextInt();
				System.out.print("index" + "[" + i + "]" + "[" +j + "]"+"\t"+ mat[i][j]);

			}
			System.out.println();
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
