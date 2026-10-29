package Encapsulation;

public class Main_Bank {
	public static void main(String[] args) {
		
	
	Bank account = new Bank();

	account.setdeposit(100);                   
	System.out.println("Bank balance :" +account.getBalance()); 
}
}