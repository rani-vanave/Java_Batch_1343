package demo_conditional_statement;

public class TemperatureType {
	public static void main(String[] args) {
		int temp=6;
		
		
		if(temp >30) {
			System.out.println("Hot");
			
		}else if (temp >20) {
			System.out.println("Warm"); 
			
			
		}else if (temp >10) {
			System.out.println("cool");
			
		}else {
			System.out.println("Cold");
		}
		
	}

}
