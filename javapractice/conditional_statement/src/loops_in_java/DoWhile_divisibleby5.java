package loops_in_java;

public class DoWhile_divisibleby5 {
	
	    public static void main(String[] args) {
	        int i = 1;

	        do {
	            if (i % 5 == 0) {
	                System.out.println(i);
	            }
	            i++;
	        } while (i <= 100);
	    }
	}

