package oop.inheritance;

public class Car extends Vehicle {
	private int cc;
	private int gears;

	public void attributeCar() {
		System.out.println("Speed of Car"+speed);
		System.out.println("CC of Car " + cc);
		System.out.println("No. of gears");
		super.attributes();
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.speed = 120;
		c.cc = 250;
		c.gears = 4;
		c.size = 22;
		c.attributeCar();
		c.attributes();
	}

}
