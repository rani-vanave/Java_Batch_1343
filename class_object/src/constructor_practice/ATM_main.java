package constructor_practice;

public class ATM_main {
	
	    public static void main(String[] args) {

	        ATM a1 = new ATM(123456789, 1234, 20000);

	        a1.checkBalance(1234);

	        a1.withdraw(1234, 5000);

	        a1.checkBalance(1234);
	    }
	}

