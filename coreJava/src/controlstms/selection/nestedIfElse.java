package controlstms.selection;

public class nestedIfElse {
public static void main(String[] args) {
	String citizen = "nepalese";
	int age = 20;
if(citizen.equals("nepalese")){
	if(age >= 18){
		System.out.println("you are nepalese so you can vote");
	}else{
	  System.out.println("you are child");
	}
	
}
else{
	System.out.println("you are not nepalese");
}
	}

}
