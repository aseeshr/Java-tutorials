package javastring;

public class StringSubstr {
	public static void main(String[] args) {
		
		String sb = "Nepal";
		String s = sb.substring(1,3);//substring(a,b),it takes (a-b) where a is first index
		System.out.println(sb.length());
//		System.out.println(sb.lastIndexOf());
		System.out.println(sb.toLowerCase());
		System.out.println(sb.concat("sb"));
		System.out.println(s);
		
	}

}
