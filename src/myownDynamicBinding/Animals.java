package myownDynamicBinding;

public class Animals {
	public void bark() {
		System.out.println("Dog is barking");
	}

	public void run() {
		System.out.println("Dog is running");
	}

	public static void main(String[] args) {
		Animals a = new Dog();
		a.bark();
		Animals d2 = new Dog2();
		d2.bark();

	}
}
