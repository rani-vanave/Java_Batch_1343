package loops_in_java;

public class WhilePrimeno_1to100 {
	
	    public static void main(String[] args) {
	        int n = 2;

	        while (n <= 100) {
	            int i = 2;
	            boolean prime = true;

	            while (i <= n / i) {
	                if (n % i == 0) {
	                    prime = false;
	                    break;
	                }
	                i++;
	            }

	            if (prime) {
	                System.out.println(n);
	            }

	            n++;
	        }
	    }
	}

