package loops_in_java;

public class DoWhile_Perfectnum {

	    public static void main(String[] args) {
	        int num = 6;
	        int i = 1;
	        int sum = 0;

	        do {
	            if (num % i == 0 && i != num) {
	                sum = sum + i;
	            }
	            i++;
	        } while (i < num);

	        if (sum == num) {
	            System.out.println("Perfect number");
	        } else {
	            System.out.println("Not a Perfect number");
	        }
	    }
	}

