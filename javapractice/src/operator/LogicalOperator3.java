package operator;

public class LogicalOperator3 {
public static void main(String[] args) {
	int a = 3, b = 5;
	System.out.println((a++ == 3 && ++b == 6) || (a == 4 && b-- == 6));
	
	
	int x = 2, y = 4;
	System.out.println(!(x++ > 2 || y-- == 4) && (++x == 4 || y == 3));
	
	
     int p = 5, q = 2;
     System.out.println((p-- == 5 || ++q == 3) && (q++ == 3 && --p == 3)); 
     
     
     
     int m = 2, n = 4;
    System.out.println(!(m++ > 2 || n-- == 4) && m == 3);


}



}
