package swtich_case;

public class Grade_Print {
	public static void main(String[] args) {
		char Grade='C';
		
		switch(Grade) {
		
		case 'A':
			System.out.println("Excellent");
			break;
			
		case 'B':
			System.out.println("Good");
			break;
			
		case 'C':
			System.out.println("Average");
			break;
			
			
		case 'D':
			System.out.println("Pass");
			break;
			
		case 'F':
			System.out.println("Fail");
			break;
			
			default:
				System.out.println("Invalid grade");
		}
	}

}
