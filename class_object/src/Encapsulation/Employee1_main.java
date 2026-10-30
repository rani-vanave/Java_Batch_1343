package Encapsulation;

import java.util.Scanner;

public class Employee1_main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Employee e= new Employee();
		System.out.println("Enter Employee Salary :");
		double salary =sc.nextDouble();
		
		e.setsalary(salary);
		
	System.out.println("Employee salary : " + e.getsalary());
	
	
	}

}
