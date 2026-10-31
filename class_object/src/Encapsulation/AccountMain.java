package Encapsulation;

public class AccountMain {
	public static void main(String[] args) {
		 
		Account ac=new Account(10000);
		ac.deposit(2000);
		ac.withdraw(3000);
		System.out.println("Available Balnace : " + ac.getBalance());
		
	}

}
