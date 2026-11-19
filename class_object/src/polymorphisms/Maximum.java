package polymorphisms;

public class Maximum {
	
	    int max(int a, int b) {
	        if (a > b)
	            return a;
	        else
	            return b;
	    }

	    int max(int a, int b, int c) {
	        if (a > b && a > c)
	            return a;
	        else if (b > c)
	            return b;
	        else
	            return c;
	    }

	    public static void main(String[] args) {
	        Maximum m = new Maximum();

	        System.out.println("Maximum of two: " + m.max(10, 20));
	        System.out.println("Maximum of three: " + m.max(10, 20, 30));
	    }
	}

