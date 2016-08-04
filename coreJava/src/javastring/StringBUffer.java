package javastring;

public class StringBUffer {
	public static void main(String[] args) {
		// StringBuffer is example of mutable
		//synchronize is Threadsafe
		StringBuffer sb = new StringBuffer("Hello ");
		// append()
		sb.append("java");
		System.out.println(sb);
		// insert
		sb.insert(2, "aby");
		System.out.println(sb);
		// replace method (3-1=) start with index 1
		sb.replace(1, 3, "morning");
		System.out.println(sb);
		// delete()
		sb.delete(1, 3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}
}
