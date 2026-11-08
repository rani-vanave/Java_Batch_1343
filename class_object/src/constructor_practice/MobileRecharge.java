package constructor_practice;

public class MobileRecharge {
	
	    private long mobileNumber;
	    private String customerName;
	    private double balance;

	    public MobileRecharge(long mobileNumber,
	                          String customerName,
	                          double balance) {

	        this.mobileNumber = mobileNumber;
	        this.customerName = customerName;
	        this.balance = balance;
	    }

	    public void recharge(double amount) {

	        if (amount > 0) {
	            balance = balance + amount;
	            System.out.println("Recharge successful.");
	        } else {
	            System.out.println("Invalid recharge amount.");
	        }
	    }

	    public void makeCall(double callCost) {

	        if (callCost <= 0) {
	            System.out.println("Invalid call cost.");
	        } else if (callCost <= balance) {
	            balance = balance - callCost;
	            System.out.println("Call successful.");
	        } else {
	            System.out.println("Insufficient balance. Please recharge.");
	        }
	    }

	    public void checkBalance() {

	        System.out.println("Mobile Number: " + mobileNumber);
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Available Balance: " + balance);
	    }
	}

