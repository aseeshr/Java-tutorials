package javastring;

public class StringSplit {
	public static void main(String[] args) {
		String s1 = "Nepal is a beautiful country";
		String[] container = s1.split("\\s");
		for (String s: container) {
			System.out.println(s);
		}
		//second method
		for (int i = 0; i < container.length; i++) {
			System.out.println(container[i]);
			
			
		}
		
	}
}
