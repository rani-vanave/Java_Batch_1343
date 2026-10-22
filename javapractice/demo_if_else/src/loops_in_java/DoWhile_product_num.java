package loops_in_java;

public class DoWhile_product_num {
	
	    public static void main(String[] args) {
	        int i = 1;
	        int product = 1;

	        do {
	            product = product * i;
	            i++;
	        } while (i <= 5);

	        System.out.println("Product = " + product);
	    }
	}

