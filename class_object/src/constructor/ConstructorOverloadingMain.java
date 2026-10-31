package constructor;

import java.util.Scanner;



public class ConstructorOverloadingMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 ConstructorOverLoading c1=new ConstructorOverLoading();
		 System.out.println("Default Age :");
		 c1.diplay();
		 System.out.println("Enter Your Age : ");
		 int  age =sc.nextInt();
		 
		 ConstructorOverLoading c2 =new ConstructorOverLoading();
		 System.out.println("Paramiterized Age : ");
		 c2.diplay();
		 sc.close();
		 
		
	}

}
