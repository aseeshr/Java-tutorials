package oops.aggregation;

public class Employee {
	int id;
	String name;
	Address address;

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("Kathmandu", "Bagmati", "Nepal");
		Address address2 = new Address("Nepalgunj", "Banke", "Nepal");
		Employee e1 = new Employee(111, "Sam", address1);
		Employee e2 = new Employee(222, "Ram", address2);
		e1.display();
		e2.display();

	}

}
