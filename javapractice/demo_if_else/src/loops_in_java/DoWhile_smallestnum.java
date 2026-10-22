package loops_in_java;

public class DoWhile_smallestnum {
	
	    public static void main(String[] args) {
	        int num = 5832;
	        int smallest = 9;

	        do {
	            int digit = num % 10;

	            if (digit < smallest) {
	                smallest = digit;
	            }

	            num = num / 10;
	        } while (num > 0);

	        System.out.println("Smallest digit = " + smallest);
	    }
	}

