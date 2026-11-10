package constructor_practice;

public class ShoppingCart {

    private String customerName;
    private String productName;
    private double price;
    private int quantity;

    // Parameterized Constructor
    public ShoppingCart(String customerName, String productName,
                        double price, int quantity) {

        this.customerName = customerName;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate Total Amount
    public double calculateTotalAmount() {

        return price * quantity;
    }

    // Display Final Bill
    public void displayFinalBill() {

        double total = calculateTotalAmount();
        double discount = 0;

        if (total > 5000) {

            discount = total * 10 / 100;

        } else if (total > 2000) {

            discount = total * 5 / 100;
        }

        double finalAmount = total - discount;

        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalAmount);
    }
}


