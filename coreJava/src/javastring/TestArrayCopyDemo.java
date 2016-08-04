package javastring;

import java.util.Arrays;

public class TestArrayCopyDemo {
	public static void main(String[] args) {
		char[] copyFrom = { 'a', 'b', 'z', 'd', 'e', 'l', 'g', 'h', 'i', 'j',
				'k', 'l', 'm', 'n', };
		char[] copyTo = new char[7];
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		//they give the same output
		System.out.println(new String(copyTo));
		Arrays.sort(copyTo);
	
		System.out.println(copyTo);
	}
}
