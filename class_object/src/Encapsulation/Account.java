package Encapsulation;

public class Account {
	private double balance;
	
	 public Account (double balance) {
		 this.balance=balance;
		 
	 }
	 public void deposit(double amount) {
		 balance =balance + amount;
		 System.out.println("Amount Deposited : " + amount);
		 
		 
	 }
	 public void withdraw(double amount ) {
		 if(amount <=balance) {
			 balance=balance-amount;
			 System.out.println("Amount withdraw : " + amount);
			 
		 }else {
			 System.out.println("Insufficient Balance");
		 }
	 }
	 double getBalance() {
		 return balance;
	 }
	 
	 

}
