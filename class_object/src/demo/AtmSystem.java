package demo;

public class AtmSystem {
	
	public static void checkBalance(double balance) {
		System.out.println("Account Balance " + balance);
		
	}
	public static double withdrawAmount( double balance,double amount) {
		if(amount >0 && amount <=balance) {
			balance =balance - amount;
			System.out.println("Withdrawal Successful");
			
		}else {
			System.out.println("Insufficient Balance or Invalid Amount");
		}
	
		return balance;
	}

	
	
	

}
