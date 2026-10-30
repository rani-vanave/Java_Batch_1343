package Encapsulation;

public class BankAccount {
	private double balance = 10000;

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit:" + amount);
	}
	
	public void Withdraw(double amount) {
		if (amount <= balance && amount >0) {
			balance = balance - amount;
			System.out.println("Withdrw: " +amount);
		}else {
			System.out.println("Insufficient balance");
		}
	}
	
	public double getbalance(){
		return balance;
	}

}
