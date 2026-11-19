package polymorphisms;

public class Calculate {
	int calculate(int n) {
		return n*n;
	}
	int calculate(int n,int o) {
		return n*n*n;
	}
	public static void main(String[] args) {
		Calculate c= new Calculate();
		System.out.println("square : "+ c.calculate(6));
		System.out.println("Cube : " +c.calculate(6, 9));
	}
	

}
