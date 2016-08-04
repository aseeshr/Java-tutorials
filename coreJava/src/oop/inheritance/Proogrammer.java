package oop.inheritance;

class Proogrammer extends Employee {
	int bonus = 10000;

	public static void main(String[] args) {
		Proogrammer p = new Proogrammer();
	System.out.println("Salary"+p.salary);
	System.out.println("Bunus "+ p.bonus);
	System.out.println("Total Salary "+ (p.bonus + p.salary));
	}

}