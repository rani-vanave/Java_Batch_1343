package loops_in_java;

public class While_palidrome {
	
	    public static void main(String[] args) {
	        int n = 121, temp = n, rev = 0;

	        while (temp > 0) {
	            rev = rev * 10 + temp % 10;
	            temp /= 10;
	        }

	        System.out.println(
	            n == rev ? "Palindrome" : "Not Palindrome"
	        );
	    }
	}

