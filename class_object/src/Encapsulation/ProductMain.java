package Encapsulation;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Product p=new Product();
	
		System.out.println("Enter product Price : ");
		double price=sc.nextDouble();
		System.out.println("Enter Discount Percentage :");       
		
		p.setPrice(2000);
		p.setDiscountPercent(10);
		System.out.println("Product price : " +p.getPrice());
		
		System.out.println(" Discount Amount  : " + p.calculatediscount());
		
		System.out.println("Final price : " + p.getFinalPrice());
		
	}

}
