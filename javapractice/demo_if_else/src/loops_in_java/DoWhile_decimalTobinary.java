package loops_in_java;

public class DoWhile_decimalTobinary {
	
	    public static void main(String[] args) {
	        int num = 10;
	        int binary = 0;
	        int place = 1;

	        do {
	            int remainder = num % 2;
	            binary = binary + remainder * place;
	            place = place * 10;
	            num = num / 2;
	        } while (num > 0);

	        System.out.println("Binary = " + binary);
	    }
	}

