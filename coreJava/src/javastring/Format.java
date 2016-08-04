package javastring;

public class Format {
	public static void main(String[] args) {
		String name = "Peter";
		String message = String.format("welcome %s, to java programming.",name);
		System.out.println(message);
		
		//concatenation
		String fs = "asee";
		String ls = " shrestha";
		String merge = fs + ls;
		System.out.println(merge);
	}

}
