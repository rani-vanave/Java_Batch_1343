package polymorphisms;

public class Multiplication {
	int multiply(int a,int b) {
		return a*b;
		
	}
	double multiply(double a,double b) {
		return a*b;
	}
	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		System.out.println(m.multiply(12, 34));
		System.out.println(m.multiply(20.10, 5.00));
	}
	

}
