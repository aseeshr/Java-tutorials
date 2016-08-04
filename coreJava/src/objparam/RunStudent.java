package objparam;

public class RunStudent {
	private void displayInfo(Student s) {
		System.out.println("Name :" + s.getName());
		System.out.println("Age :" + s.getAge());
		System.out.println("Phone No. : " + s.getPhone());
		System.out.println("Address :" + s.getAddress());

	}

	private Student setData() {
		Student s = new Student();

		s.setName("Ricky");
		s.setAge(26);
		s.setPhone(985555555l);
		s.setAddress("Nepal");
		return s;

	}

	public static void main(String[] args) {

		// s.setName("Ricky");
		// s.setAge(26);
		// s.setPhone(985555555l);
		// s.setAddress("Nepal");

		RunStudent rs = new RunStudent();
		Student s = new Student(); //Student s = rs.setData(); it is variable with declaration same thing
		s =  rs.setData();
		
		rs.displayInfo(s);;
		
		
	}

}
