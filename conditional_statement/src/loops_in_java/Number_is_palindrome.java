package loops_in_java;

public class Number_is_palindrome {
	public static void main(String[] args) {
		int n=209;
		int original=n;
		int reverse=0;
		
		for(;n>0; n=n/10) {
			reverse = reverse*10 +n%10;
		}
		
		if(original==reverse) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
