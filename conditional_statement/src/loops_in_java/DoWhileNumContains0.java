package loops_in_java;

public class DoWhileNumContains0 {
	
	    public static void main(String[] args) {
	        int num = 1025;
	        boolean found = false;

	        do {
	            int digit = num % 10;

	            if (digit == 0) {
	                found = true;
	                break;
	            }

	            num = num / 10;
	        } while (num > 0);

	        if (found) {
	            System.out.println("Contains zero");
	        } else {
	            System.out.println("Does not contain zero");
	        }
	    }
	}

