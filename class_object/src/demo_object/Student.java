package demo_object;

public class Student {
	
	int studId;
	String studName;
	int age;
	String gender;
	String course;
	String clgName;
	String dept;
	String email;
	long mobNo;
	String address;
	String city;
	int semester;
	double percentage;
	String division;
	String bloodGroup;
	
	public static void student() {
		System.out.println("student Id and Name");
		
	}
	public static void study() {
		System.out.println("is studying");
	}	
		
	public static void percentage() {
		System.out.println("high persentage");
		
	}
	public static void attendlecture() {
		System.out.println("is attending lecture");
		
	}
	public static void displayclg() {
		System.out.println("college Name");
	}
	public void display() {
		System.out.println("studId : " + studId);
		System.out.println("studName : " + studName);
		System.out.println("gender : " + gender);
		
		System.out.println("course : " + course);
		System.out.println("clgName : " + clgName);
		
		System.out.println("dept : " + dept);
		
		System.out.println("email : " + email);
		
		System.out.println("mobNo : " + mobNo);
		System.out.println("address : " + address);
		System.out.println("city : " + city);
		System.out.println("semester: " + semester);
		System.out.println("percentage : " + percentage);
		System.out.println("devision : " + division);
		System.out.println("bloodGroup : " + bloodGroup);
		student();
		study();
		percentage();
		attendlecture();
		displayclg();
	}
}
		
	
		
		
		
		
		
		
		
		
		
		
		
	


