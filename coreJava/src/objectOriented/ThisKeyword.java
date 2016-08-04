package objectOriented;

public class ThisKeyword {
	String name, address;
	int salary;
	long phone;

	public ThisKeyword(String name, long phone, int salary, String address) {
		// TODO Auto-generated constructor stub
		// to remove the ambuigity between instance variable and local variable
		// this is used
		this.name = name;
		this.phone = phone;
		this.salary = salary;
		this.address = address;

	}

	void display() {
		System.out.println("Name = " + name);
		System.out.println("Phone = " + phone);
		System.out.println("Address = " + address);
		System.out.println("Salary = " + salary);
	}

	public static void main(String[] args) {
		ThisKeyword th = new ThisKeyword("asee", 89989898987l, 121212, "Nepal");
		ThisKeyword th1 = new ThisKeyword("Nita", 989898444444l, 4444,
				"Kathmandu");
		th1.display();
		System.out.println();
		th.display();

	}
}
