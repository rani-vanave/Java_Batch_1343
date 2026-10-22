package swtich_case;

public class Electricity_Rate {
	public static void main(String[] args) {
		String category="commercial";
		
		switch(category) {
		case "Domestic":
			
			System.out.println("Rate : RS.5 per unit");
			break;
			
			
		case "commercial":
			System.out.println("Rate : RS.10 per unit");
			break;
			
		case "industrial":
			System.out.println("Rate : RS.8 per unit");
			break;
			
			default:
				System.out.println("Invalid category");
		}
	}

}
