package loops_in_java;

public class WhileCountDigits {
	
	    public static void main(String[] args) {
	        int n = 12345, count = 0;

	        while (n > 0) {
	            count++;
	            n /= 10;
	        }

	        System.out.println("Count = " + count);
	    }
	}

