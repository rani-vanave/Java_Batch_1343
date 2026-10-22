package loops_in_java;

public class Dowhile_strongNumber {

	    public static void main(String[] args) {
	        int num = 145;
	        int temp = num;
	        int sum = 0;

	        do {
	            int digit = temp % 10;
	            int fact = 1;
	            int i = 1;

	            do {
	                fact = fact * i;
	                i++;
	            } while (i <= digit);

	            sum = sum + fact;
	            temp = temp / 10;
	        } while (temp > 0);

	        if (sum == num) {
	            System.out.println("Strong number");
	        } else {
	            System.out.println("Not a Strong number");
	        }
	    }
	}

