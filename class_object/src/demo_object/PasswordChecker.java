package demo_object;

public class PasswordChecker {
	public static String chekpassword(String password) {
		
		if(password.length()>=8
				&& password.matches(".*[A-Z].*")
				&& password.matches(".*[0-9].*")) {
			
		
		return "Strong Password";
		}else {
			return"Weak Password";
		}
	}

}
