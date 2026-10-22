package loops_in_java;

public class DoWhileCount {
	
	    public static void main(String[] args) {
	        int n = 12345, count = 0;

	        do {
	            count++;
	            n /= 10;
	        } while (n > 0);

	        System.out.println("Count = " + count);
	    }
	}

