package loops_in_java;

public class ReversNumber {
	public static void main(String[] args) {
		int n = 1234;
		int reverse = 0;

		for (; n > 0; n = n / 10) {
		    reverse = reverse * 10 + n % 10;
		}

		System.out.println("Reverse = " + reverse);
	}

}
