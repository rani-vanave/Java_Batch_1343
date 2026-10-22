package loops_in_java;

public class DoWhileSum {
	
	    public static void main(String[] args) {
	        int i = 1, sum = 0;

	        do {
	            sum += i;
	            i++;
	        } while (i <= 20);

	        System.out.println("Sum = " + sum);
	    }
	}

