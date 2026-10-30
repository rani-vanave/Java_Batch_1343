package Encapsulation;

import java.util.Scanner;

public class CarMain {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Car c=new Car();
		System.out.println("Enter car Brand :");
		String brand=sc.nextLine();
		System.out.println("Enter Car Price: ");
		double price=sc.nextDouble();
		
		c.setBrand(brand);
		c.setPrice(price);
		
		System.out.println("Car brand " + c.getBrand());
		System.out.println("Car Price " + c.getPrice());
	}

}
