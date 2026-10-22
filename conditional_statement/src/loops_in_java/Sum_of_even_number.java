package loops_in_java;

public class Sum_of_even_number {
	public static void main(String[] args) {
		int sum=0;
		for(int i=2;i<=100; i+=2) {
			sum =sum + i;
			
		}
		System.out.println("sum = " + sum) ;
	}

}
