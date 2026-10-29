package constructor;

public class Mobile {
	String brand;
	String color;
	double price;
	
	public Mobile() {
	brand = "samsung";
	color="black";
	price= 45000.00;
	
	
	
	
	}
	void display(){
		System.out.println("Mobile brand =" + brand);
		System.out.println("Mobile color = " + color);
		System.out.println("Mobile price = " + price);
		
		
	}

}
