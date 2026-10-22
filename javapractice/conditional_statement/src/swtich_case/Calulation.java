package swtich_case;

public class Calulation {
	public static void main(String[] args) {
		int a=20;
		int b=5;
		char operator='-';
		
		switch(operator) {
		case '+':
			System.out.println("Addition = " + (a+ b));
			break;
			
		case '-':
			System.out.println("Subtraction = " + (a- b));
			break;
			
		case '*':
			System.out.println("Multiplication = " + (a* b));
			break;
			
		case '/':
			System.out.println("Divison = " + (a/ b));
			break;
			
			default:
				
				System.out.println("Invalid operator");
		}
	}

}
