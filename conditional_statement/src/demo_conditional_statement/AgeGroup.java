package demo_conditional_statement;

public class AgeGroup {
	public static void main(String[] args) {
		int age=25;
		
		if(age > 0 && age <12) {
			System.out.println("Child");
			
			
		}else if (age >12 && age< 19) {
			System.out.println("Teenage");
			
		}else if(age >19 && age <59 ) {
			System.out.println("Adult");
			
		}else if(age >59 ) {
			System.out.println("Senior Citizen");
		}
			
		}
	

}
