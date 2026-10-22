package loops_in_java;

public class WhileSum_digits {

	    public static void main(String[] args) {
	        int n = 1234, sum = 0;

	        while (n > 0) {
	            sum += n % 10;
	            n /= 10;
	        }

	        System.out.println("Sum = " + sum);
	    }
	}

