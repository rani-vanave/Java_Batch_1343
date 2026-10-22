package operator;

public class Arithmatic3 {
	public static void main(String[] args) {
		int a = 55, b = 6, c = 2;
		
		System.out.println(a / b + b / c);
		System.out.println(a % b * c + 2);
		System.out.println(a * b + c % 3);
		System.out.println((a - b) / c);
		System.out.println(a % b + c % 2);
		System.out.println(a * b + c / 2);
		System.out.println(a / b % c);
		System.out.println(a - (b + c) * 2);
		System.out.println((a + b) / c);
		System.out.println(a / b + a % c);
		System.out.println(a + b * c - 5);
	}

}
