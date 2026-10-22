package loops_in_java;

public class DoWhile_sumdigits {
	
	    public static void main(String[] args) {
	        int n = 1234, sum = 0;

	        do {
	            sum += n % 10;
	            n /= 10;
	        } while (n > 0);

	        System.out.println("Sum = " + sum);
	    }
	}

