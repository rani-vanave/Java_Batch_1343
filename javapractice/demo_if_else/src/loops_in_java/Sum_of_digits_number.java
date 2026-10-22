package loops_in_java;

public class Sum_of_digits_number {
	public static void main(String[] args) {
		int n=1234;
		int sum=0;
		
		

		for (; n > 0; n = n / 10) {
		    sum += n % 10;
		}

		System.out.println("Sum = " + sum);
	}

}
