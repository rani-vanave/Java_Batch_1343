package Encapsulation;

public class Bank {
	
	    private double balance = 0;  

	    public void setdeposit(double amount) {
	        if (amount > 0) {         
	            balance = balance + amount;
	        }
	    }

	    public double getBalance() {
	        return balance;  
	    }
	}

