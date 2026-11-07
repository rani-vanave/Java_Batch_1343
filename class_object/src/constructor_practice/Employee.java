package constructor_practice;

public class Employee {
	

	

	    private int employeeId;
	    private String name;
	    private double basicSalary;

	    public Employee(int employeeId, String name, double basicSalary) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.basicSalary = basicSalary;
	    }

	    public double calculateHRA() {
	        return basicSalary * 20 / 100;
	    }

	    public double calculateDA() {
	        return basicSalary * 10 / 100;
	    }

	    public double calculateGrossSalary() {
	        return basicSalary + calculateHRA() + calculateDA();
	    }

	    public void displayEmployeeDetails() {

	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Employee Name: " + name);
	        System.out.println("Basic Salary: " + basicSalary);
	        System.out.println("HRA: " + calculateHRA());
	        System.out.println("DA: " + calculateDA());
	        System.out.println("Gross Salary: " + calculateGrossSalary());
	    }
	}

