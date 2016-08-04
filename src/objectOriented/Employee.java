package objectOriented;

public class Employee {
	String name, address;
	long phone;
	int salary;

	// here we are using 3 constructor so it is a type of overloading
	// constructor
	// constructor is always public
	public Employee() {
		// TODO Auto-generated constructor stub
		name = "Samita";
		phone = 987777777666l;
		salary = 1900000;
		address = "Nepal";
	}

	// parameterized constructor

	public Employee(String n, long ph, int sal, String adr) {
		// TODO Auto-generated constructor stub
		name = n;
		phone = ph;
		salary = sal;
		address = adr;

	}

	public Employee(String n, long ph, int sal) {
		// TODO Auto-generated constructor stub
		name = n;
		phone = ph;
		salary = sal;

	}

	void display() {
		System.out.println("Name = " + name);
		System.out.println("Phone = " + phone);
		System.out.println("Address = " + address);
		System.out.println("Salary = " + salary);
	}

	public static void main(String[] args) {
		Employee emp = new Employee("Ram", 984155555l, 500000, "Nepal");
		Employee emp1 = new Employee();
		Employee emp2 = new Employee("Babita", 98989898, 444444);
		emp.display();
		System.out.println();
		emp1.display();
		System.out.println();
		emp2.display();

	}

}
