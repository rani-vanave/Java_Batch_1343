package loops_in_java;

public class WhileFind_largest {
	
	    public static void main(String[] args) {
	        int n = 5832, largest = 0;

	        while (n > 0) {
	            int digit = n % 10;

	            if (digit > largest) {
	                largest = digit;
	            }

	            n /= 10;
	        }

	        System.out.println("Largest = " + largest);
	    }
	}

