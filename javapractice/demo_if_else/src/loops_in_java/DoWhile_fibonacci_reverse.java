package loops_in_java;

public class DoWhile_fibonacci_reverse {
	
	    public static void main(String[] args) {
	        int a = 0, b = 1, i = 1;
	        int[] arr = new int[10];

	        do {
	            arr[i - 1] = a;

	            int c = a + b;
	            a = b;
	            b = c;

	            i++;
	        } while (i <= 10);

	        i = 9;

	        do {
	            System.out.print(arr[i] + " ");
	            i--;
	        } while (i >= 0);
	    }
	}

