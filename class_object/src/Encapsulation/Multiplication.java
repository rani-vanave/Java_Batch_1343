package Encapsulation;

import java.util.Scanner;

public class Multiplication {
	public int  multi(int a,int b) {
		return a*b;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Multiplication m=new Multiplication();
		System.out.println("Enter First Number :");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number : ");
		int num2=sc.nextInt();
		
		int result =m.multi(num1,num2);
		
		System.out.println("Multipication  : " +result);
		
	}

}
