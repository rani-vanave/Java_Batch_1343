package loops_in_java;

public class DoWhileReverse {
	
	    public static void main(String[] args) {
	        int n = 1234, rev = 0;

	        do {
	            rev = rev * 10 + n % 10;
	            n /= 10;
	        } while (n > 0);

	        System.out.println("Reverse = " + rev);
	    }
	}

