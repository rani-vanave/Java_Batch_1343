package loops_in_java;

public class WhileCalculatePower {
	
	    public static void main(String[] args) {
	        int base = 2, power = 5;
	        int result = 1, i = 1;

	        while (i <= power) {
	            result *= base;
	            i++;
	        }

	        System.out.println(result);
	    }
	}

