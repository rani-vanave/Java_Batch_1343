package demo;

public class Grade_calculator {
	public static char getGrade(int marks) {
		if(marks >=80 && marks<=100) {
			return 'A';
			
			
		}else if(marks >=60) {
			return 'B';
			
		}else if(marks>=35) {
			return 'D';
		}else {
			return'F';
		}
	}

}
