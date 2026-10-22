package loops_in_java;

public class WhileProduct_digits {
	
	    public static void main(String[] args) {
	        int n = 1234, product = 1;

	        while (n > 0) {
	            product *= n % 10;
	            n /= 10;
	        }

	        System.out.println("Product = " + product);
	    }
	}

