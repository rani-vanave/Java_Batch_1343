package loops_in_java;

public class While_primeNumber {
	
	    public static void main(String[] args) {
	        int n = 7, i = 2;
	        boolean prime = n > 1;

	        while (prime && i <= n / i) {
	            if (n % i == 0) {
	                prime = false;
	            }
	            i++;
	        }

	        System.out.println(prime ? "Prime" : "Not Prime");
	    }
	}

