package loops_in_java;

public class WhileSumofeven_Num {
	
	    public static void main(String[] args) {
	        int i = 2, sum = 0;

	        while (i <= 50) {
	            sum += i;
	            i += 2;
	        }

	        System.out.println("Sum = " + sum);
	    }
	}

