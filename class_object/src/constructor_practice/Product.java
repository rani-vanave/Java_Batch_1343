package constructor_practice;

public class Product {
	
	    private int productId;
	    private String productName;
	    private double price;
	    private int quantity;

	    public Product(int productId, String productName,
	                   double price, int quantity) {

	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    public double calculateTotalPrice() {
	        return price * quantity;
	    }

	    public double calculateDiscount() {

	        double total = calculateTotalPrice();

	        if (total > 5000) {
	            return total * 10 / 100;
	        } else {
	            return 0;
	        }
	    }

	    public double calculateFinalBill() {
	        return calculateTotalPrice() - calculateDiscount();
	    }

	    public void displayBill() {

	        System.out.println("Product ID: " + productId);
	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: " + price);
	        System.out.println("Quantity: " + quantity);

	        System.out.println("Total Price: " + calculateTotalPrice());
	        System.out.println("Discount: " + calculateDiscount());
	        System.out.println("Final Bill: " + calculateFinalBill());
	    }
	}


