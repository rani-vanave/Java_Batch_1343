package operator;

public class LogicalOperator2 {
	public static void main(String[] args) {
		int a = 8, b = 3;
		System.out.println(a > b && b != 0);
		
		
		int x = 4, y = 9;
		System.out.println(x < y || y == 0);
		
		
		
		int n = 7;
		System.out.println(!(n > 5) || n == 7);
		
		
		int p = 10, q = 2;
		System.out.println(p / q == 5 || q == 0);
		
		int m = 12, o = 5;
		System.out.println(m / o == 2 && m % o == 1);
		
		
		
		
	}

}
