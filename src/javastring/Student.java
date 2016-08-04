package javastring;

public class Student {
	String name;
	int age;
	long phone;

	public String toString() {
		return name + " " + age + " " + phone;
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Ram";
		s.age = 30;
		s.phone = 984123455l;
		// Object obj = new Object();
		// obj.toString();
		// both are same becoz tostring is bydefault called from paret object
		// tostring le obect ma bhako value ko variable ko value dincha
		// class
		System.out.println(s);
		System.out.println(s.toString());

	}

}
