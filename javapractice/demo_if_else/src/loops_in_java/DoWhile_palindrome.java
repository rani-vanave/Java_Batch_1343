package loops_in_java;

public class DoWhile_palindrome {
	
	    public static void main(String[] args) {
	        int n = 222, temp = n, rev = 0;

	        do {
	            rev = rev * 10 + temp % 10;
	            temp /= 10;
	        } while (temp > 0);

	        if (n == rev) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }
	    }
	}

