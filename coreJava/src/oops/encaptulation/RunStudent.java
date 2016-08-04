package oops.encaptulation;

public class RunStudent {
	public static void main(String[] args) {

		Student s = new Student();
		s.setName("Johnny");
		s.setAge(21);
		s.setRollno(75);
		s.setAddress("Nepal");
		System.out.println("Name :" + s.getName());
		System.out.println("Age :" + s.getAge());
		System.out.println("Roll No. :" + s.getRollno());
		System.out.println("Address :" + s.getAddress());
	}

}
