package constructor;

public class Employee {
	String empName;
	int empID;
	double salary;
	
	//parameterized Constructor
	public Employee(String n,int i,double s) {
		empName=n;
		empID=i;
		salary=s;
		
		
	}
	 void display() {
		 System.out.println("Employee Name : " + empName);
		 System.out.println("Employee ID : " + empID);
		 System.out.println("Employee salary : " + salary);
		 
		 
	 }

}
