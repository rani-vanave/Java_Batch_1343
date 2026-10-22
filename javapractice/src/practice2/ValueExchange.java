package practice2;

public class ValueExchange {
	public static void main(String args[]) {
		
		int a= 100;
		int b=200;
		
		int temp=a;
		a=b;
		b= temp;
		
		System.out.println("Values of a : " +a);
		System.out.println("Values of b : " + b);
		
	}

}
