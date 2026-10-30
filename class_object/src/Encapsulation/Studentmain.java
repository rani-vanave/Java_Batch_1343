package Encapsulation;

import java.util.Scanner;



public class Studentmain {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		Student s= new Student();
		
		System.out.println("Enter Student ID :");
		int id=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Student name :");
		String name=sc.nextLine();
		
		
		s.setId(id);
		s.setName(name);
		
		System.out.println("Student Id:- "+ s.getId());
		System.out.println("Student Name:- " + s.getName());
	}

}
