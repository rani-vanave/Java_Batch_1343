package demo_object;



public class Employee {
	int employeeId;
	String employeeName;
	int age;
	String gender;
	String department;
	String designation;
	double salary;
	String email;
	long mobNo;
	String address;
	String city;
	String companyName;
	int experience;
	String joinDate;
	String education;
	
	public static void displayDetails() {
		System.out.println("Employee name:" );
	}
	
	public static void work() {
		System.out.println("is working");
	}
	
	public static void attendMeeting() {
		System.out.println("is attending meeting");
	}
	
	public static void salary() {
		System.out.println("salary is paid");
		
	}
	public static void experience() {
		System.out.println("experience is must");
		
	}
	
	public void display() {
		System.out.println("employeeId : " + employeeId);
		System.out.println("employeeName :" + employeeName);
		System.out.println(" age :" + age );
		System.out.println("gender :" + gender);
		System.out.println("department :" + department);
		System.out.println("designation :" + designation);
		System.out.println("salary :" + salary);
		System.out.println("mobNo :" + mobNo);
		System.out.println("address :" + address);
		System.out.println("city :" + city);
		System.out.println("companyName :" + companyName);
		System.out.println("experience :" + experience);
		System.out.println("joinDate :" + joinDate);
		System.out.println("education :" + education);
		displayDetails();
		work() ;
		attendMeeting();
		salary();
		experience();
	}
	
	
	
}
