package Encapsulation;

import java.util.Scanner;

public class Even {
	public boolean isEven(int n) {
		return n%2==0;
		
	}
	
	Scanner sc  = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		Even e=new Even();
		
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		
		
		if(e.isEven(num)) {
			
		System.out.println("Number is Even");
		
	}else {
		System.out.println("Number is Odd");
	}

}
}