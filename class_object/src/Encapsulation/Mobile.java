package Encapsulation;

public class Mobile {
	private  String model;
	private double price;
	
	public Mobile(String model,double price) {
		this.model=model;
		this.price=price;
		
	}
	public void setModel(String model) {
		this.model=model;
		
	}
	public String getModel() {
		return model;
	}
	public void setprice(double price) {
		this.price=price;
		
	}
	public double getprice() {
		return price;
	}
	public double discountAmount() {
		double discountAmount=price*10/100;
		return price-discountAmount;
	}

}
