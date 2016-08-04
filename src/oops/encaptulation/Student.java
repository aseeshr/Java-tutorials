package oops.encaptulation;


public class Student {
	private String firstname;
	private String address;
	private int age;
	private int rollno;
	
	public void setName(String name) {
		this.firstname = name;
		
	}
	public String getName(){
		return firstname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	

	
}
