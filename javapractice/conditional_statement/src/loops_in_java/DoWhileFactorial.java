package loops_in_java;

public class DoWhileFactorial {
	
	    public static void main(String[] args) {
	        int n = 5, i = 1;
	        long fact = 1;

	        do {
	            fact *= i;
	            i++;
	        } while (i <= n);

	        System.out.println("Factorial = " + fact);
	    }
	}

