package constructor_practice;

public class ATM {
	
	    private long accountNumber;
	    private int pin;
	    private double balance;

	    public ATM(long accountNumber, int pin, double balance) {

	        this.accountNumber = accountNumber;
	        this.pin = pin;
	        this.balance = balance;
	    }

	    public boolean validatePin(int enteredPin) {

	        if (pin == enteredPin) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public void withdraw(int enteredPin, double amount) {

	        if (!validatePin(enteredPin)) {
	            System.out.println("Incorrect PIN.");
	        } else if (amount <= 0) {
	            System.out.println("Invalid withdrawal amount.");
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance.");
	        } else {
	            balance = balance - amount;
	            System.out.println("Withdrawal successful.");
	            System.out.println("Withdrawn Amount: " + amount);
	        }
	    }

	    public void checkBalance(int enteredPin) {

	        if (validatePin(enteredPin)) {
	            System.out.println("Account Number: " + accountNumber);
	            System.out.println("Available Balance: " + balance);
	        } else {
	            System.out.println("Incorrect PIN.");
	        }
	    }
}
	

