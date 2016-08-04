package ooops.override;

public class Bike extends Vehicle {
	@Override
	public void run() {
		System.out.println("Bike is running");
	}

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.run();
	}
}
