package Encapsulation;

public class StudentG {
	private String name;
	private int marks;
	
	public StudentG(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
	public String getName() {
		return name;
		}
	
	public int getMarks() {
	return marks;
	}
	
	public String getGrade() {
		if(marks>=90) {
			return "A Grade";
			
		}else if(marks >=75){
			return "B Grade";
			
		}else if (marks >=60) {
			return "C Grade";
			
		}else if(marks >=35) {
			return "D Grade";
			
		}else {
			return "Fail";
		}
		
	}
}


