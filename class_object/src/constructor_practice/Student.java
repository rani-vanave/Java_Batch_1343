package constructor_practice;

public class Student {
	private int studId;
	private String studentName;
	private int marks;
	
	public Student(int studId,String studentName,int marks) {
		this.studId=studId;
		this.studentName=studentName;
		this.marks=marks;
		
	}
	public int getStudentId() {
		return studId;
	}
	public void setStudentId(int studId) {
		this.studId=studId;
		
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
		
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public void display() {
		System.out.println("Student Id : " + studId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Marks : " + marks);
		
		if(marks >=35) {
			System.out.println("Result : Pass");
		}else {
			System.out.println("Result : Fail");
		}
	}
	

}
