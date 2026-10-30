package constructor;

public class Book {
	
	String tital;
	double price;
	
	public Book(String  tital,double price) {
		tital=tital;
		price=price;
		
		
	}
	void display() {
		System.out.println("Book Tital : " + tital);
		System.out.println("Book Price : " + price );
		
	}
	

}
