package loops_in_java;

public class DoWhile_Armstrongnum {
	
	    public static void main(String[] args) {
	        int num = 153;
	        int temp = num;
	        int sum = 0;

	        do {
	            int digit = temp % 10;
	            sum = sum + digit * digit * digit;
	            temp = temp / 10;
	        } while (temp > 0);

	        if (sum == num) {
	            System.out.println("Armstrong number");
	        } else {
	            System.out.println("Not an Armstrong number");
	        }
	    }
	}

