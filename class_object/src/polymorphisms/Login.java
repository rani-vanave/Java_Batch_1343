package polymorphisms;

 public class Login {
	 void  login(String username) {
		System.out.println("Login using username : " + username);
	}
	 void login(String username,String password) {
		 System.out.println("Login using username and password");
		 System.out.println("Username :" + username);
		 System.out.println("Login request received");
	 }
	 public static void main(String[] args) {
		Login l= new Login();
		l.login("Krish");
		l.login("Krishn ", "Pass@134");
	}
}
