package demo_conditional_statement;

public class StudentGrade {
	public static void main(String[] args) {
		
		int marks=50;
		
		if(marks<0) {
			System.out.println("invalid marks");
		}else if(marks>=90) {
			
			System.out.println("grade A");
			
		}else if(marks>=75) {
			
			
			System.out.println("grade B");
			
		}else if(marks>=58) {
			System.out.println("grade C"); 
		}else if(marks >=35) {
			System.out.println("grade D");
			
		}else {
			System.out.println("Fail");
		}
		

      }
    	  
      }
