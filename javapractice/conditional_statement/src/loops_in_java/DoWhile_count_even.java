package loops_in_java;

public class DoWhile_count_even {
	
	    public static void main(String[] args) {
	        int num = 123456;
	        int count = 0;

	        do {
	            int digit = num % 10;

	            if (digit % 2 == 0) {
	                count++;
	            }

	            num = num / 10;
	        } while (num > 0);

	        System.out.println("Even digits = " + count);
	    }
	}

