package loops_in_java;

public class Print_natural_numbers {
	public static void main(String[] args) {
		
			int sum=0;
			for(int i=1; i<=10;i++) {
				System.out.println(i);
				sum +=i;
		}
		System.out.println("sum = " + sum);
	}

}
