package demo;

public class FoodOrderingApp {
	public static void placeOrder(String item,int quantity) {
		System.out.println("Item : " + item);
		System.out.println("Quantity : " + quantity);
		System.out.println("Bill : Rs. " + (quantity *100));
		
	}

}
