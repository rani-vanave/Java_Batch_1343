package constructor_practice;

public class BankAccountMain{
  
 public static void main(String[] args) {

	        BankAccount b1 = new BankAccount(123456789, "Rani", 10000);

	        b1.displayBalance();

	        b1.deposit(5000);

	        b1.withdraw(2000);

	        b1.displayBalance();
	    }
	}


