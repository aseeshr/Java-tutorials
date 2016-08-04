package javastring;

import java.util.Scanner;

public class SingleDimArray {
	public static void main(String[] args) {
		int age[];// declaration of array
		age = new int[4];// instantiation of array
		
		int number[] = {1,2,3,4,5};//declaration.instatiation and initialization at a same time
		
		// initialization of array
		age[0] = 10;
		age[1] = 11;
		age[2] = 12;
		age[3] = 13;
		// simple method
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		// print using looping method
		Scanner sc = new Scanner(System.in);//to read input from keyboard
		for (int i = 0; i < age.length; i++) {
			System.out.println("Please enter your age");
			age[i]= sc.nextInt();
			System.out.println("index " + i + " " + age[i]);
		}

	}
}
