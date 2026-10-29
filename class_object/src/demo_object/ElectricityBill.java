package demo_object;

public class ElectricityBill {
	public static double  calculateBill(int Units) {
		if(Units <=100 ) {
			return Units*2.0;
		}else if(Units <=2.0) {
			return 200+(Units -100)*3.0;
			
			
		}else {
			return 500+(Units-200)*5.0;
		}
		
	}

}
