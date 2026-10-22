package loops_in_java;

public class DoWhile_sumSquares {
	
	    public static void main(String[] args) {
	        int num = 12;
	        int sum = 0;

	        do {
	            int digit = num % 10;
	            sum = sum + digit * digit;
	            num = num / 10;
	        } while (num > 0);

	        System.out.println("Sum of squares = " + sum);
	    }
	}

