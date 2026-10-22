package operator;

public class AssignmentOperator1 {
	
	    public static void main(String[] args) {
	        int a = 10, b = 5, c = 2;

	        System.out.println(a += b);  // 1
	        System.out.println(a -= c);  // 2
	        System.out.println(a *= c);  // 3
	        System.out.println(a /= b);  // 4
	        System.out.println(a %= c);  // 5

	        System.out.println(b += c);  // 6
	        System.out.println(b -= c);  // 7
	        System.out.println(b *= c);  // 8
	        System.out.println(b /= c);  // 9
	        System.out.println(b %= c);  // 10

	        System.out.println(c += 3);  // 11
	        System.out.println(c -= b);  // 12
	        System.out.println(c += 4);  // 13
	        System.out.println(c *= 2);  // 14
	        System.out.println(c /= 4);  // 15
	        System.out.println(c %= 2);  // 16

	        System.out.println(a = b + 3); // 17
	        System.out.println(b = a * 2); // 18
	        System.out.println(a += b);    // 19
	        System.out.println(b -= a);    // 20
	    }
	}

