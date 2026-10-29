package demo_object;

public class MaximumNumber {
	public static int findMax(int a,int b,int c) {
		if(a>=b && a>=c){
			return a;
			
		}else if (b>=a && b>=c) {
			return b;
		}else {
			return c;
		}
	}

}
