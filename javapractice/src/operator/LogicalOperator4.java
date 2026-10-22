package operator;

public class LogicalOperator4 {
	public static void main(String[] args) {
		int a = 2, b = 4;
		System.out.println(a++ == 2 && b++ == 4);
		System.out.println("a=" + a + ", b=" + b);
		
		int x = 5, y = 3;
		System.out.println(x++ == 4 && y++ == 3);
		System.out.println("x=" + x + ", y=" + y);
		
		int p = 1, q = 6;
		System.out.println(p++ == 0 || q++ == 6);
		System.out.println("p=" + p + ", q=" + q);
	}

}
