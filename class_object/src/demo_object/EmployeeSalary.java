package demo_object;

public class EmployeeSalary {
	public static double calculatesalary(double basic) {
	double hra=basic *20/100;
	double da=basic*10;
	return basic + hra+  da;

}
}