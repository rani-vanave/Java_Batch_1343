package loops_in_java;

public class DoWhile_largestnum {
	
	    public static void main(String[] args) {
	        int num = 5832;
	        int largest = 0;

	        do {
	            int digit = num % 10;

	            if (digit > largest) {
	                largest = digit;
	            }

	            num = num / 10;
	        } while (num > 0);

	        System.out.println("Largest digit = " + largest);
	    }
	}

