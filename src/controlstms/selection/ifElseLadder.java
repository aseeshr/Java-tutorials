package controlstms.selection;

public class ifElseLadder {
	public static void main(String[] args) {
		int marks = 81;
		
		if(marks >= 85){
			System.out.println("Distinction !!");
		}else if(marks >= 60 && marks< 85){
			System.out.println("First !!");
			
		}else if (marks >= 45 && marks <60 ) {
			System.out.println("Second !!");
		}else if (marks >= 32 && marks <45) {
			System.out.println("Third !!");
		}else{
			System.out.println("Fail !!");
		}
	}

}
