package loops_in_java;

public class DoWhile_Primenum {
	
	    public static void main(String[] args) {
	        int n = 7, i = 19;
	        boolean prime = n > 1;

	        if (prime) {
	            do {
	                if (n % i == 0) {
	                    prime = false;
	                    break;
	                }
	                i++;
	            } while (i <= n / i);
	        }

	        System.out.println(prime ? "Prime" : "Not Prime");
	    }
	}

