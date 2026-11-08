package constructor_practice;

public class MobileRechargeMain {
	
	    public static void main(String[] args) {

	        MobileRecharge m1 =
	                new MobileRecharge(9876543210L, "Rani", 100);

	        m1.checkBalance();

	        m1.recharge(200);

	        m1.makeCall(50);

	        m1.checkBalance();
	    }
	}

