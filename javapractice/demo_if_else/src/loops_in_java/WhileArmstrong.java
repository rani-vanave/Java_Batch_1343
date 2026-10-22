package loops_in_java;

public class WhileArmstrong {
	
	    public static void main(String[] args) {
	        int n = 153, temp = n, sum = 0;
	        int digits = String.valueOf(n).length();

	        while (temp > 0) {
	            int digit = temp % 10;
	            int power = 1;
	            int i = 1;

	            while (i <= digits) {
	                power *= digit;
	                i++;
	            }

	            sum += power;
	            temp /= 10;
	        }

	        System.out.println(
	            n == sum ? "Armstrong" : "Not Armstrong"
	        );
	    }
	}

