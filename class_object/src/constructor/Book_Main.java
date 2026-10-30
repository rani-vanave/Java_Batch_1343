package constructor;

import java.util.Scanner;

public class Book_Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book Title :");
		String title=sc.nextLine();
		System.out.println("Enter Book Price :");
		double price=sc.nextDouble();
		
		Book b=new Book("Java Programing",500);
		b.display();
		
	}

}
