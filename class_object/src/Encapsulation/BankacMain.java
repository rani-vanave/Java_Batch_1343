package Encapsulation;

import java.util.Scanner;

public class BankacMain {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		BankAccount b = new BankAccount();
		
		System.out.println("Enter Initial Balance : ");
		double balance=sc.nextDouble();
		
		b.deposit(balance);
		System.out.println("Enter Deposit Amount : ");
		double deposit=sc.nextDouble();
		
		System.out.println("Enter  Withdraw Amount ");
		double withdraw=sc.nextDouble();
		
		b.Withdraw(withdraw);
		
		
		System.out.println("Available Balance  " + b.getbalance());
	}

}
