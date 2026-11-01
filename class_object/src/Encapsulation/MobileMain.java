package Encapsulation;

public class MobileMain {
	public static void main(String[] args) {
		Mobile m=new Mobile("Samsung", 40000);
		System.out.println("Mobile model : " + m.getModel());
		System.out.println("Original Price : " + m.getprice());
		System.out.println("Discount price : " +m.discountAmount());
	}

}
