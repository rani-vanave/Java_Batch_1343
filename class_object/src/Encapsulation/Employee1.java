package Encapsulation;

public class Employee1 {
	private double salary;

	public void setsalary(double salary) {
		if (salary > 0) {
			this.salary = salary;

		} else {
			System.out.println("Error :  salary must be greter than 0");

		}

	}

	public double getSalary() {
		return salary;
	}

}
