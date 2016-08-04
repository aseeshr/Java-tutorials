package objectOriented;

public class Students {
	// properties or fields or instance variables
	String name;
	int age, rollNo;

	// methods or behaviors or instance methods
	private void displayInfo() {
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("Roll Number = " + rollNo);
	}

	public static void main(String[] args) {
		// object of class students
		Students s = new Students();
		Students s2 = new Students();
		s2.name = "Ram";
		s2.age = 19;
		s2.rollNo = 63002;
		s.age = 21;
		s.name = "Asee";
		s.rollNo = 63001;
		s2.displayInfo();
		System.out.println();
		s.displayInfo();

	}

}
