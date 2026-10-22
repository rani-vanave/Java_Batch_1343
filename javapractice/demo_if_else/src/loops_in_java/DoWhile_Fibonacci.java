package loops_in_java;

public class DoWhile_Fibonacci {
	    public static void main(String[] args) {
	        int a = 0, b = 1, i = 1;

	        do {
	            System.out.print(a + " ");

	            int c = a + b;
	            a = b;
	            b = c;

	            i++;
	        } while (i <= 10);
	    }
	}

