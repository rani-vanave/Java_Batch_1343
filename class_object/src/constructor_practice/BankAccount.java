package constructor_practice;

public class BankAccount {
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	private long accontNumber;
	
	 public BankAccount(long accountNumber,String accountHolderName,double balance){
		 this.accountNumber=accontNumber;
		 this.accountHolderName=accountHolderName;
		 this.balance=balance;
	 }
	 public void deposit(double amount) {
		 if(amount >0) {
			 balance=balance+amount;
			 System.out.println("Amont deposited successfully");
		
		 }else {
			 System.out.println("Invalid deposit amount"); 
			 
		 }
	 }
	 public void withdraw(double amount) {
		 if(amount <=0) {
			 System.out.println("Invalid  withdrawal amont");
			 
		 }else if(amount >balance) {
			 System.out.println("Insufficient balance");
		 }else {
			 balance = balance -amount;
			 System.out.println("Amount withdrawn successfully");
		 }
	 }
	public void displayBalance() {
		System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Available Balance: " + balance);
    }

}
