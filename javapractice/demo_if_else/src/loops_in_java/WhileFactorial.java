package loops_in_java;

public class WhileFactorial {
	
	    public static void main(String[] args) {
	        int n = 5, i = 1;
	        long fact = 1;

	        while (i <= n) {
	            fact *= i;
	            i++;
	        }

	        System.out.println("Factorial = " + fact);
	    }
	}

