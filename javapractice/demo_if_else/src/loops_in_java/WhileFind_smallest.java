package loops_in_java;

public class WhileFind_smallest {
	
	    public static void main(String[] args) {
	        int n = 5832, smallest = 9;

	        while (n > 0) {
	            int digit = n % 10;

	            if (digit < smallest) {
	                smallest = digit;
	            }

	            n /= 10;
	        }

	        System.out.println("Smallest = " + smallest);
	    }
	}

