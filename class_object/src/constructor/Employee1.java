package constructor;

public class Employee1 {
	String name;
	private double salary;
	public Employee1(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	public void increment() {
		salary=salary+(salary*10/100);
		
	}
	public void display() {
		System.out.println("Employee Name :" + name);
		System.out.println("Employee salary : " + salary);
		
	}
	

}
