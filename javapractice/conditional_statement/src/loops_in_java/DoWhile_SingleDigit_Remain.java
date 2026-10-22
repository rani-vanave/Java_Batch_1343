package loops_in_java;

public class DoWhile_SingleDigit_Remain {
public static void main(String[] args) {
	
	    
	        int num = 987;

	        do {
	            int sum = 0;

	            do {
	                sum = sum + num % 10;
	                num = num / 10;
	            } while (num > 0);

	            num = sum;
	        } while (num >= 10);

	        System.out.println("Single digit = " + num);
	    }
	}
	