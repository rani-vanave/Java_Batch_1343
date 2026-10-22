package swtich_case;

public class Even_Odd_No {
	public static void main(String[] args) {
		int num=120;
		
		switch(num%2) {
		case 0:
			System.out.println("Even Number");
			break;
			
		case 1:
		case-1:
			System.out.println("Odd Number");
			break;
		}
	}

}
