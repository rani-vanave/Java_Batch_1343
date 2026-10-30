package Encapsulation;

public class Product {

	private double price;
	private double discountPercent;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public double calculatediscount() {
		return (price*discountPercent) / 100;
	}
	public double getFinalPrice(){
		return price-  calculatediscount();	
	}

}
